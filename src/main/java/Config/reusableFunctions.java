package Config;

import General.baseTest;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;


public class reusableFunctions {

    // get response path array list
    public static ArrayList responseList(String key) {
        return envGlobals.response.then().
                extract().
                path(key);
    }

    // get response size
    public static int getResponseLength() {
        return envGlobals.response.body().path("list.size()");
    }

    // print response string
    public static void printResponse() {
        System.out.println(envGlobals.response.getBody().asString());
    }

    // get response as string
    public static String getResponse() {
        return envGlobals.response.getBody().asString();
    }

    // sort response by id
    private static JSONArray sortApiResponse(JSONArray jsonArr, String sortBy, boolean sortOrder) {
        JSONArray sortedJsonArray = new JSONArray();

        List<JSONObject> jsonValues = new ArrayList<JSONObject>();
        for (int i = 0; i < jsonArr.length(); i++) {
            jsonValues.add(jsonArr.getJSONObject(i));
        }
        final String KEY_NAME = sortBy;
        final Boolean SORT_ORDER = sortOrder;
        Collections.sort(jsonValues, new Comparator<JSONObject>() {

            @Override
            public int compare(JSONObject a, JSONObject b) {
                Integer valA = new Integer(0);
                Integer valB = new Integer(0);

                try {
                    valA = (Integer) a.get(KEY_NAME);
                    valB = (Integer) b.get(KEY_NAME);
                } catch (JSONException e) {
                    //exception
                }
                if (SORT_ORDER) {
                    return valA.compareTo(valB);
                } else {
                    return -valA.compareTo(valB);
                }
            }
        });

        for (int i = 0; i < jsonArr.length(); i++) {
            sortedJsonArray.put(jsonValues.get(i));
        }

        return sortedJsonArray;
    }

    // get response path
    public static String getResponsePath(String key) {
        return envGlobals.response.getBody().path(key).toString();
    }

    //get response json
    public static JSONArray getResponseJson(String... params) {

        JsonPath jsonPathEvaluator = envGlobals.response.jsonPath();

        JSONArray jArray = new JSONArray();

        ArrayList<Object> list1 = jsonPathEvaluator.get(params[0]);

        ArrayList<Object> list2 = jsonPathEvaluator.get(params[1]);

        for (int i = 0; i < getResponseLength(); i++) {

            JSONObject obj = new JSONObject();

            for (int j = 0; j < params.length; j++) {
                if (j == 0) {
                    obj.put(params[j], list1.get(i));
                } else
                    obj.put(params[j], list2.get(i));
            }

            jArray.put(obj);


        }
        ;
        return sortApiResponse(jArray, "id", true);
    }

    // set content type
    private static void contentType(String contentType) {
        baseTest.REQUEST = RestAssured.given().contentType(contentType);
    }

    // Given function with no parameters
    public static void given() {
        contentType("application/json");
        envGlobals.requestSpecification = baseTest.REQUEST.given();
    }

    // Given function with 1 parameter - For multipart API's
    public static void givenFormData(Map<String, String> formData) {
        contentType("multipart/form-data");

        Iterator<Map.Entry<String, String>> it = formData.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> pair = it.next();
            envGlobals.requestSpecification = baseTest.REQUEST.given()
                    .multiPart(pair.getKey(), pair.getValue());
            it.remove();
        }
    }

    // Given function with one parameter - Headers
    public static void givenHeaders(Map<String, String> headers) {
        contentType("application/json");
        envGlobals.requestSpecification = baseTest.REQUEST.given()
                .headers(headers);
    }

    // Given function with 2 parameters - API (parameters, headers)
//    public static void givenParamHeader(Map<String, String> params, Map<String, String> headers) {
//        contentType("application/json");
//        envGlobals.requestSpecification = baseTest.REQUEST.given()
//                .queryParam(String.valueOf(params))
//                .headers(headers);
//    }

    // Given function with 3 parameters - API (parameters, headers, payload)
    // pass null value when calling a function if params or headers not required
    public static void givenHeaderPayload(Map<String, String> headers, String
            payload) {
        contentType("application/json");
        envGlobals.requestSpecification = baseTest.REQUEST.given();
        if (headers == null) {
            envGlobals.requestSpecification = baseTest.REQUEST.given()
                    .body(payload);
        } else if (payload == null) {
            envGlobals.requestSpecification = baseTest.REQUEST.given()
                    .headers(headers);
        } else {
            envGlobals.requestSpecification = baseTest.REQUEST.given()
                    .headers(headers)
                    .body(payload);
        }
    }

    // Given function with two params, Headers and Formdata
    public static void givenHeaderFormData(Map<String, String> headers, Map<String,
            String> formData) {
        contentType("multipart/form-data");
        Iterator<Map.Entry<String, String>> it = formData.entrySet().iterator();


        if (headers == null) {
            envGlobals.requestSpecification = baseTest.REQUEST.given();
            while (it.hasNext()) {
                Map.Entry<String, String> pair = it.next();
                envGlobals.requestSpecification = baseTest.REQUEST.given()
                        .multiPart(pair.getKey(), pair.getValue());
                it.remove();
            }
        } else {
            envGlobals.requestSpecification = baseTest.REQUEST.given()
                    .headers(headers);
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();

                envGlobals.requestSpecification = baseTest.REQUEST.given()
                .multiPart((String) pair.getKey(), pair.getValue());
                it.remove();
            }
        }
    }


    // When function with request type(Get, Post etc) & API endpoint
    public static void whenFunction(String requestType, String endPoint) {
        switch (requestType) {
            case "post":
                envGlobals.response =
                        envGlobals.requestSpecification
                                .when()
                                .post(endPoint);
                break;

            case "get":
                envGlobals.response =
                        envGlobals.requestSpecification
                                .when()
                                .get(endPoint);
                break;
            case "delete":
                envGlobals.response =
                        envGlobals.requestSpecification
                                .when()
                                .delete(endPoint);
                break;
            case "put":
                envGlobals.response =
                        envGlobals.requestSpecification
                                .when()
                                .put(endPoint);
                break;
            case "patch":
                envGlobals.response =
                        envGlobals.requestSpecification
                                .when()
                                .patch(endPoint);
                break;
        }

    }

    // Then function to verify status code
    public static void thenFunction(int statusCode) {
        //envGlobals.response.then().statusCode(statusCode);
        envGlobals.response.then().statusCode(statusCode);
    }

    // Hashmap for params, headers, form-data
    public static <K, V> Map<K, V> headers(Object... keyValues) {
        Map<K, V> map = new HashMap<>();

        for (int index = 0; index < keyValues.length / 2; index++) {
            map.put((K) keyValues[index * 2], (V) keyValues[index * 2 + 1]);
        }

        return map;
    }

    public static <K, V> Map<K, V> form_data(Object... keyValues) {
        Map<K, V> map = new HashMap<>();

        for (int index = 0; index < keyValues.length / 2; index++) {
            map.put((K) keyValues[index * 2], (V) keyValues[index * 2 + 1]);
        }

        return map;
    }

    public static <K, V> Map<K, V> params(Object... keyValues) {
        Map<K, V> map = new HashMap<>();

        for (int index = 0; index < keyValues.length / 2; index++) {
            map.put((K) keyValues[index * 2], (V) keyValues[index * 2 + 1]);
        }

        return map;
    }
}