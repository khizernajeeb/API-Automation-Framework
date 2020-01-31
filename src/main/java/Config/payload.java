/*
# Define payloads
 */

package Config;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class payload {


    private static int randomNum = ThreadLocalRandom.current().nextInt(1, 10000 + 1);
    private static int randomNum1 = ThreadLocalRandom.current().nextInt(1, 10000 + 1);

    //Instant instant = Instant.now();
    //private static String currentDate = Instant.now().toString();
    //private static String tomorrowDate = Instant.now().plus(Duration.ofDays(1)).toString();

    private static String getCurrentDate() {
        return Instant.now().toString();
    }

    private static String getTomorrowDate() {
        return Instant.now().plus(Duration.ofDays(1)).toString();
    }

    public static String epcCreateAsset() {
        return "{\n" +
                "    \"customer\": \"Test\",\n" +
                "    \"country\": \"Test\",\n" +
                "    \"site\": \"Test\",\n" +
                "    \"fieldLocationName\": \"Test\",\n" +
                "    \"dnowNumber\": \"NOWV_" + (randomNum+randomNum1) + "\",\n" +
                "    \"lifecycleEvent\":\"Lay Down\",\n" +
                "    \"valveBrand\": \"UNK\",\n" +
                "    \"valveType\": \"BUTTERFLY\",\n" +
                "    \"valveSubType\": \"FULLY LUG\",\n" +
                "    \"valveModel\": \"UNK\",\n" +
                "    \"shortTextDescription\": \"BUTTERFLY 32\\\" 150\",\n" +
                "    \"longTextDescription\": \"BUTTERFLY 32\\\" 150 FULLY LUG FF  Ni-Aluminum Bronze Ni-Aluminum " +
                "Bronze O-Ring MANUAL\",\n" +
                "    \"oemMaterialNumber\": \"UNK\",\n" +
                "    \"valveDataSheet\": \"N7RYNV3\",\n" +
                "    \"qty\": \"1\",\n" +
                "    \"boreType\": \"UNK\",\n" +
                "    \"npsOne\": \"32\\\"\",\n" +
                "    \"npsTwo\": \"32\\\"\",\n" +
                "    \"boreSize\": \"UNK\",\n" +
                "    \"pressureRatingNpsOne\": \"150\",\n" +
                "    \"pressureRatingNpsTwo\": \"150\",\n" +
                "    \"endConnectionOne\": \"FF\",\n" +
                "    \"endConnectionTwo\": \"FF\",\n" +
                "    \"designTemperartureMax\": \"UNK\",\n" +
                "    \"designTemperartureMin\": \"UNK\",\n" +
                "    \"operatingTemperartureMax\": \"UNK\",\n" +
                "    \"operatingTemperartureMin\": \"UNK\",\n" +
                "    \"bodyDesign\": \"UNK\",\n" +
                "    \"obturatorDesign\": \"DISC\",\n" +
                "    \"seatDesign\": \"UNK\",\n" +
                "    \"bodyMaterial\": \"Ni-Aluminum Bronze\",\n" +
                "    \"obturatorMaterial\": \"Ni-Aluminum Bronze\",\n" +
                "    \"seatRingMaterial\": \"PTFE\",\n" +
                "    \"seatInsertMaterial\": \"N/A\",\n" +
                "    \"stemTrunnionMaterial\": \"UNK\",\n" +
                "    \"primarySealType\": \"O-Ring\",\n" +
                "    \"primarySealMaterial\": \"Viton-B\",\n" +
                "    \"gaskets\": \"UNK\",\n" +
                "    \"packing\": \"UNK\",\n" +
                "    \"lockableDevice\": \"YES\",\n" +
                "    \"antiStatic\": \"UNK\",\n" +
                "    \"ballPositionIndicator\": \"UNK\",\n" +
                "    \"stemInjectionPort\": \"UNK\",\n" +
                "    \"seatInjectionPort\": \"UNK\",\n" +
                "    \"ventPlug\": \"UNK\",\n" +
                "    \"drainPlug\": \"UNK\",\n" +
                "    \"stemExtension\": \"UNK\",\n" +
                "    \"overlayAreaOnBody\": \"UNK\",\n" +
                "    \"overlayMaterial\": \"UNK\",\n" +
                "    \"actuatedManual\": \"MANUAL\",\n" +
                "    \"operatorManufacturer\": \"UNK\",\n" +
                "    \"operatorModel\": \"UNK\",\n" +
                "    \"operatorType\": \"UNK\",\n" +
                "    \"operatorDescription\": \"UNK\",\n" +
                "    \"valveSerialNumber\": \"UNK\",\n" +
                "    \"operatorSerialNumber\": \"UNK\",\n" +
                "    \"valveManufactureDate\": \"UNK\",\n" +
                "    \"valveOperatorType\": null,\n" +
                "    \"epcName\": \"SBM Offshore\",\n" +
                "    \"service\": \"SEAWATER\",\n" +
                "    \"valveTagNo\": \"32N7RYNV3\",\n" +
                "    \"salesOrder\": \"SO# 18535572\",\n" +
                "    \"equipmentNumber\": \"P-1850A\",\n" +
                "    \"blowOutProofStem\": \"UNK\",\n" +
                "    \"boltingMaterial\": \"UNK\",\n" +
                "    \"boltCoating\": \"UNK\",\n" +
                "    \"flangeStandard\": \"N/A\",\n" +
                "    \"bonnetDesign\": \"BOLTED\",\n" +
                "    \"pattern\": \"LUG\",\n" +
                "    \"certifiedLengthMm\": \"305 mm\",\n" +
                "    \"dbbFeature\": \"NO\",\n" +
                "    \"operation\": \"QUARTER TURN\",\n" +
                "    \"trimCode\": \"N/A\",\n" +
                "    \"naceMrFive\": \"UNK\",\n" +
                "    \"naceMrThree\": \"UNK\",\n" +
                "    \"dnowValveNo\": \"DNOW-VM-BR-087\",\n" +
                "    \"dnowProjectNo\": \"DNOW-BR-00001\",\n" +
                "    \"poNumber\": \"PO-II-VM-CHV-032019-003\",\n" +
                "    \"area\": \"Vessel\",\n" +
                "    \"module\": \"31\",\n" +
                "    \"pid\": \"DVV22014\",\n" +
                "    \"lineIsoNumber\": \"N/A\",\n" +
                "    \"gaDrawing\": \"N/A\",\n" +
                "    \"bom\": \"N/A\",\n" +
                "    \"pipeSize\": \"32\\\"\",\n" +
                "    \"pipeSpec\": \"A0\",\n" +
                "    \"fluidCode\": \"SW\",\n" +
                "    \"pipeMaterial\": \"NiAlBr\",\n" +
                "    \"paintSpec\": \"N/A\",\n" +
                "    \"paintCode\": \"UNK\",\n" +
                "    \"functionalLocation\": \"UNK\",\n" +
                "    \"failPosition\": \"Last\",\n" +
                "    \"criticality\": \"2\",\n" +
                "    \"priorityLevel\": \"2\",\n" +
                "    \"extensionHeight\": \"UNK\",\n" +
                "    \"firesafeSeals\": \"UNK\",\n" +
                "    \"seatSpring\": \"UNK\",\n" +
                "    \"siteRecordNumber\": \"VM-101\",\n" +
                "    \"insulation\": \"NO\",\n" +
                "    \"manualOverideFitted\": \"YES\",\n" +
                "    \"travel\": \"N/A\",\n" +
                "    \"recommendedAirSupplyRange\": \"N/A\",\n" +
                "    \"requiredOpeningTime\": \"N/A\",\n" +
                "    \"requiredClosingTime\": \"N/A\",\n" +
                "    \"positionIndicator\": \"YES\",\n" +
                "    \"indicatorType\": \"VISUAL\",\n" +
                "    \"indicatorManufacturer\": \"UNK\",\n" +
                "    \"indicatorModel\": \"UNK\",\n" +
                "    \"valveTestingStandard\": \"UNK\",\n" +
                "    \"hydrostatic\": \"UNK\",\n" +
                "    \"lpPneumatic\": \"UNK\",\n" +
                "    \"hpPneumatic\": \"UNK\",\n" +
                "    \"torque\": \"UNK\",\n" +
                "    \"backseat\": \"N/A\",\n" +
                "    \"nde\": \"N/A\",\n" +
                "    \"astmAsme\": \"UNK\",\n" +
                "    \"lpi\": \"UNK\",\n" +
                "    \"mpi\": \"UNK\",\n" +
                "    \"ut\": \"UNK\",\n" +
                "    \"rt\": \"UNK\",\n" +
                "    \"pmi\": \"UNK\",\n" +
                "    \"enThreeDotOne\": \"UNK\",\n" +
                "    \"enThreeDotTwo\": \"UNK\",\n" +
                "    \"installationDate\": \"UNK\",\n" +
                "    \"lastCertificationDate\": \"UNK\",\n" +
                "    \"inspectionInterval\": \"UNK\",\n" +
                "    \"nextCertificationDate\": \"UNK\",\n" +
                "    \"repairDateOne\": \"N/A\",\n" +
                "    \"isoFailureModeOne\": \"N/A\",\n" +
                "    \"repairDateTwo\": \"N/A\",\n" +
                "    \"isoFailureModeTwo\": \"N/A\",\n" +
                "    \"repairDateThree\": \"N/A\",\n" +
                "    \"isoFailureModeThree\": \"N/A\",\n" +
                "    \"mtbfMonths\": \"N/A\",\n" +
                "    \"shutoffClass\": \"N/A\",\n" +
                "    \"valveCv\": \"N/A\",\n" +
                "    \"flowDirection\": \"N/A\",\n" +
                "    \"shaftIs\": \"N/A\",\n" +
                "    \"plugCharacteristic\": \"N/A\",\n" +
                "    \"pressureBalanced\": \"N/A\",\n" +
                "    \"trimSizeNumber\": \"N/A\",\n" +
                "    \"positionerFitted\": \"N/A\",\n" +
                "    \"positionerManufacturer\": \"N/A\",\n" +
                "    \"positionerType\": \"N/A\",\n" +
                "    \"positionerModel\": \"N/A\",\n" +
                "    \"positionerSerialNumber\": \"N/A\",\n" +
                "    \"signalRange\": \"N/A\",\n" +
                "    \"supplyPressure\": \"N/A\",\n" +
                "    \"positionerAction\": \"N/A\",\n" +
                "    \"twentyMA\": \"N/A\",\n" +
                "    \"signalType\": \"N/A\",\n" +
                "    \"warrantyExpiryDate\": \"UNK\",\n" +
                "    \"systemNo\": \"21\",\n" +
                "    \"subSystemNo\": \"21-03\",\n" +
                "    \"testPackNo\": \"TP-SW-21-03-02\",\n" +
                "    \"systemPressurized\": null,\n" +
                "    \"flangeSizeOne\": null,\n" +
                "    \"flangeSizeTwo\": null,\n" +
                "    \"pressureRatingFlangeOne\": null,\n" +
                "    \"pressureRatingFlangeTwo\": null,\n" +
                "    \"manufactureDate\": null,\n" +
                "    \"lockableDeviceComment\": null,\n" +
                "    \"stemInjectionPortComment\": null,\n" +
                "    \"injectionPortSeat\": null,\n" +
                "    \"injectionPortSeatComment\": null,\n" +
                "    \"ventPlugComment\": null,\n" +
                "    \"drainPlugComment\": null,\n" +
                "    \"valvePosition\": null,\n" +
                "    \"valveOrientation\": null,\n" +
                "    \"pipelinePressure\": null,\n" +
                "    \"isVisualInspection\": null,\n" +
                "    \"visualInspectionResult\": null,\n" +
                "    \"visualInspectionComment\": null,\n" +
                "    \"isOnlineSeatTestPerformed\": null,\n" +
                "    \"onlineSeatTestResultA\": null,\n" +
                "    \"onlineSeatTestResultB\": null,\n" +
                "    \"onlineSeatTestResult\": null,\n" +
                "    \"isValveExternalLeakageCheck\": null,\n" +
                "    \"valveExternalLeakageResult\": null,\n" +
                "    \"externalLeakageCheckComment\": null,\n" +
                "    \"isRoutineLubricationPerformed\": null,\n" +
                "    \"routineLubricationPerformedComment\": null,\n" +
                "    \"manualOveride\": null,\n" +
                "    \"recommendedSetPressure\": null,\n" +
                "    \"actualSetPressure\": null,\n" +
                "    \"actualSetPressureResult\": null,\n" +
                "    \"isPartialDevice\": null,\n" +
                "    \"partialDeviceComment\": null,\n" +
                "    \"isActualOpeningTimeCheck\": null,\n" +
                "    \"actualOpeningTimeResult\": null,\n" +
                "    \"isActualClosingTimeCheck\": null,\n" +
                "    \"actualClosingTimeResult\": null,\n" +
                "    \"turnToOpenClose\": null,\n" +
                "    \"turnToOpenCloseResult\": null,\n" +
                "    \"btcTorque\": null,\n" +
                "    \"runningTorqueBtc\": null,\n" +
                "    \"etcTorque\": null,\n" +
                "    \"etoTorque\": null,\n" +
                "    \"btoTorque\": null,\n" +
                "    \"isOnlineProfilerDiagnostic\": null,\n" +
                "    \"onlineProfilerDiagnosticResult\": null,\n" +
                "    \"onlineProfilerDiagnosticComment\": null,\n" +
                "    \"isHartCommunicator\": null,\n" +
                "    \"hartCommunicatorResult\": null,\n" +
                "    \"hartCommunicatorComment\": null,\n" +
                "    \"isInternalLeakageCheck\": null,\n" +
                "    \"internalLeakageResult\": null,\n" +
                "    \"internalLeakageComment\": null,\n" +
                "    \"isActuatorExternalLeakageCheck\": null,\n" +
                "    \"actuatorExternalLeakageResult\": null,\n" +
                "    \"externalLeakageComment\": null,\n" +
                "    \"isVisualConditionCheck\": null,\n" +
                "    \"visualConditionResult\": null,\n" +
                "    \"isFunctionalTestCheck\": null,\n" +
                "    \"functionalTestResult\": null,\n" +
                "    \"functionalTestComment\": null,\n" +
                "    \"isFilterRegulatorFitted\": null,\n" +
                "    \"filterRegulatorComment\": null,\n" +
                "    \"filterRegulatorManufacturer\": null,\n" +
                "    \"filterRegulatorModel\": null,\n" +
                "    \"isSolenoidFitted\": null,\n" +
                "    \"solenoidComment\": null,\n" +
                "    \"solenoidManufacturer\": null,\n" +
                "    \"solenoidModel\": null,\n" +
                "    \"isLimitSwitchFitted\": null,\n" +
                "    \"limitSwitchComment\": null,\n" +
                "    \"limitSwitchManufacturer\": null,\n" +
                "    \"limitSwitchModel\": null,\n" +
                "    \"isPilotValveFitted\": null,\n" +
                "    \"pilotValveComment\": null,\n" +
                "    \"pilotValveManufacturer\": null,\n" +
                "    \"pilotValveModel\": null,\n" +
                "    \"isQuickExhaustFitted\": null,\n" +
                "    \"quickExhaustComment\": null,\n" +
                "    \"quickExhaustManufacturer\": null,\n" +
                "    \"quickExhaustModel\": null,\n" +
                "    \"isBoostersFitted\": null,\n" +
                "    \"boostersComment\": null,\n" +
                "    \"boostersManufacturer\": null,\n" +
                "    \"boostersModel\": null,\n" +
                "    \"isVolumeTankFitted\": null,\n" +
                "    \"volumeTankComment\": null,\n" +
                "    \"volumeTankManufacturer\": null,\n" +
                "    \"volumeTankModel\": null,\n" +
                "    \"tubingMaterial\": null,\n" +
                "    \"tubingSize\": null,\n" +
                "    \"fittingMaterial\": null,\n" +
                "    \"fittingType\": null,\n" +
                "    \"isOriginalValve\": null,\n" +
                "    \"originalValveComment\": null,\n" +
                "    \"isDifferentType\": null,\n" +
                "    \"differentTypeComment\": null,\n" +
                "    \"isDesignCompliant\": null,\n" +
                "    \"designCompliantComment\": null,\n" +
                "    \"isActionReqValve\": null,\n" +
                "    \"valveComment\": null,\n" +
                "    \"isActionReqOperator\": null,\n" +
                "    \"operatorComment\": null,\n" +
                "    \"isActionReqAncillarys\": null,\n" +
                "    \"ancillarysComment\": null,\n" +
                "    \"isFurtherInspection\": null,\n" +
                "    \"furtherInspectionComment\": null,\n" +
                "    \"isPossibleOnlineSeatLeakTest\": null,\n" +
                "    \"possibleOnlineSeatLeakTestComment\": null,\n" +
                "    \"isOnlineFunctionTest\": null,\n" +
                "    \"onlineFunctionTestComment\": null,\n" +
                "    \"isSealantInjection\": null,\n" +
                "    \"sealantInjectionComment\": null,\n" +
                "    \"isOnsiteTroubleshooting\": null,\n" +
                "    \"onsiteTroubleshootingComment\": null,\n" +
                "    \"isOfflineInsituRepair\": null,\n" +
                "    \"offlineInsituRepairComment\": null,\n" +
                "    \"isOfflineOffsiteRepair\": null,\n" +
                "    \"offlineOffsiteRepairComment\": null,\n" +
                "    \"isReplacement\": null,\n" +
                "    \"replacementComment\": null,\n" +
                "    \"isRoutineLubricationRecommended\": null,\n" +
                "    \"routineLubricationComment\": null,\n" +
                "    \"isControlValveDiagnostic\": null,\n" +
                "    \"controlValveDiagnosticComment\": null,\n" +
                "    \"fieldLocationId\":" + configProperties.initialFieldLocationId + ",\n" +
                "    \"imageUrls\": [],\n" +
                "    \"isSurveyed\": false,\n" +
                "    \"milestoneTitle\": null,\n" +
                "    \"ftoFDimension\": \"ASME B16.10\"\n" +
                "}";
    }

    public static String createAsset() {
        return "{\n" +
                "    \"isActionReqAncillarys\": false,\n" +
                "    \"isActionReqOperator\": true,\n" +
                "    \"isActionReqValve\": false,\n" +
                "    \"isActualClosingTimeCheck\": \"sds\",\n" +
                "    \"actualClosingTimeResult\": \"Pass\",\n" +
                "    \"isActualOpeningTimeCheck\": \"sdsd\",\n" +
                "    \"actualOpeningTimeResult\": \"Pass\",\n" +
                "    \"actualSetPressure\": \"sds\",\n" +
                "    \"actualSetPressureResult\": \"Pass\",\n" +
                "    \"actuatedManual\": \"MANUAL\",\n" +
                "    \"isActuatorExternalLeakageCheck\": false,\n" +
                "    \"actuatorExternalLeakageResult\": \"Pass\",\n" +
                "    \"recommendedAirSupplyRange\": \"5000\",\n" +
                "    \"antiStatic\": false,\n" +
                "    \"area\": \"Vessel\",\n" +
                "    \"assetImageUrl\": \"/storage/emulated/0/DCIM/Camera/IMG_20190326_125212.jpg\",\n" +
                "    \"astmAsme\": \"20\",\n" +
                "    \"backseat\": \"10\",\n" +
                "    \"ballPositionIndicator\": false,\n" +
                "    \"blowOutProofStem\": false,\n" +
                "    \"bodyDesign\": \"Two Piece Side Entry\",\n" +
                "    \"bodyMaterial\": \"A105N\",\n" +
                "    \"boltCoating\": \"Yes\",\n" +
                "    \"boltingMaterial\": \"AB123\",\n" +
                "    \"bom\": \"Bom_doc\",\n" +
                "    \"bonnetDesign\": \"Welded\",\n" +
                "    \"boostersComment\": \"Sdsd\",\n" +
                "    \"isBoostersFitted\": true,\n" +
                "    \"boostersManufacturer\": \"sds\",\n" +
                "    \"boostersModel\": \"sdsd\",\n" +
                "    \"boreSize\": \"4\",\n" +
                "    \"boreType\": \"Reduced\",\n" +
                "    \"btcTorque\": \"sdsd\",\n" +
                "    \"btoTorque\": \"sdsdsd\",\n" +
                "    \"certifiedLengthMm\": \"1000\",\n" +
                "    \"requiredClosingTime\": \"Sun Dec 31 12:00:00 GMT 1899\",\n" +
                "    \"country\": \"United States \",\n" +
                "    \"criticality\": \"1\",\n" +
                "    \"customer\": \"LLOG Exploration\",\n" +
                "    \"dbbFeature\": \"d3\",\n" +
                "    \"isDesignCompliant\": true,\n" +
                "    \"designCompliantComment\": \"Sdsd\",\n" +
                "    \"designTemperartureMax\": \"110\",\n" +
                "    \"designTemperartureMin\": \"50\",\n" +
                "    \"isDifferentType\": false,\n" +
                "    \"dnowNumber\": \"NOWV_" + (randomNum+randomNum1) + "\",\n" +
                "    \"dnowProjectNo\": \"DNOW165\",\n" +
                "    \"dnowValveNo\": \"DNOW165\",\n" +
                "    \"drainPlug\": false,\n" +
                "    \"enThreeDotOne\": \"b23\",\n" +
                "    \"enThreeDotTwo\": \"w5\",\n" +
                "    \"endConnectionOne\": \"ANSI\",\n" +
                "    \"endConnectionTwo\": \"RF\",\n" +
                "    \"epcName\": \"Checking1\",\n" +
                "    \"equipmentNumber\": \"EQ100\",\n" +
                "    \"etoTorque\": \"sdsdsd\",\n" +
                "    \"extensionHeight\": \"15''\",\n" +
                "    \"externalLeakageCheckComment\": \"Asas\",\n" +
                "    \"externalLeakageComment\": \"Sdsd\",\n" +
                "    \"failPosition\": \"Open\",\n" +
                "    \"fieldLocationName\": \"Gulf of Mexico\",\n" +
                "    \"fieldLocationId\":" + configProperties.initialFieldLocationId + ",\n" +
                "    \"filterRegulatorComment\": \"Sds\",\n" +
                "    \"isFilterRegulatorFitted\": false,\n" +
                "    \"filterRegulatorManufacturer\": \"sds\",\n" +
                "    \"filterRegulatorModel\": \"sdsd\",\n" +
                "    \"firesafeSeals\": \"Yes\",\n" +
                "    \"fittingMaterial\": \"sdsd\",\n" +
                "    \"fittingType\": \"sdsd\",\n" +
                "    \"flangeStandard\": \"AS4087\",\n" +
                "    \"flowDirection\": \"2df\",\n" +
                "    \"fluidCode\": \"23\",\n" +
                "    \"ftoFDimension\": \"ASME B16.10\",\n" +
                "    \"functionalLocation\": \"USA\",\n" +
                "    \"isFunctionalTestCheck\": true,\n" +
                "    \"functionalTestComment\": \"Sdsdsdd\",\n" +
                "    \"functionalTestResult\": \"Pass\",\n" +
                "    \"isFurtherInspection\": false,\n" +
                "    \"gaDrawing\": \"GA Drawing_doc\",\n" +
                "    \"gaskets\": \"UNK\",\n" +
                "    \"isHartCommunicator\": true,\n" +
                "    \"hartCommunicatorComment\": \"Sdsd\",\n" +
                "    \"hartCommunicatorResult\": \"sdsd\",\n" +
                "    \"hpPneumatic\": \"30\",\n" +
                "    \"hydrostatic\": \"Yes\",\n" +
                "    \"imageUrls\": [],\n" +
                "    \"images\": [],\n" +
                "    \"imagesUpdated\": false,\n" +
                "    \"indicatorManufacturer\": \"AABB Manufacturers\",\n" +
                "    \"indicatorModel\": \"AABB1122\",\n" +
                "    \"indicatorType\": \"Green\",\n" +
                "    \"inspectionInterval\": \"3423\",\n" +
                "    \"installationDate\": \"34\",\n" +
                "    \"insulation\": false,\n" +
                "    \"isInternalLeakageCheck\": false,\n" +
                "    \"internalLeakageComment\": \"Sdsd\",\n" +
                "    \"internalLeakageResult\": \"Pass\",\n" +
                "    \"isSurveyed\": true,\n" +
                "    \"isUploaded\": false,\n" +
                "    \"isoFailureModeOne\": \"223\",\n" +
                "    \"isoFailureModeThree\": \"2323\",\n" +
                "    \"isoFailureModeTwo\": \"34\",\n" +
                "    \"lastCertificationDate\": \"34\",\n" +
                "    \"lifecycleEvent\": \"Receiving Inspection\",\n" +
                "    \"limitSwitchComment\": \"Sdsd\",\n" +
                "    \"isLimitSwitchFitted\": true,\n" +
                "    \"limitSwitchManufacturer\": \"sds\",\n" +
                "    \"limitSwitchModel\": \"sd\",\n" +
                "    \"lineIsoNumber\": \"LineISO Number_doc\",\n" +
                "    \"lockableDevice\": false,\n" +
                "    \"lockableDeviceComment\": \"Asas\",\n" +
                "    \"longTextDescription\": \"VALVE BALL TRUNNION 16 IN RAISED FACE CLASS 900 REGULAR PORT 3 PIECE " +
                "BOLTED BODY LF2\",\n" +
                "    \"lpPneumatic\": \"11\",\n" +
                "    \"lpi\": \"25\",\n" +
                "    \"manualOveride\": false,\n" +
                "    \"manualOverideFitted\": false,\n" +
                "    \"manufactureDate\": \"5/2019\",\n" +
                "    \"module\": \"32\",\n" +
                "    \"mpi\": \"30\",\n" +
                "    \"mtbfMonths\": \"34\",\n" +
                "    \"naceMrFive\": false,\n" +
                "    \"naceMrThree\": false,\n" +
                "    \"nde\": \"15\",\n" +
                "    \"nextCertificationDate\": \"34\",\n" +
                "    \"npsOne\": \"1/2\\\"\",\n" +
                "    \"npsTwo\": \"1/2\\\"\",\n" +
                "    \"obturatorDesign\": \"Ball\",\n" +
                "    \"obturatorMaterial\": \"A182-F51\",\n" +
                "    \"oemMaterialNumber\": \"UNK123\",\n" +
                "    \"isOfflineInsituRepair\": false,\n" +
                "    \"offlineInsituRepairComment\": \"Sd\",\n" +
                "    \"isOfflineOffsiteRepair\": true,\n" +
                "    \"isOnlineFunctionTest\": true,\n" +
                "    \"isOnlineProfilerDiagnostic\": false,\n" +
                "    \"onlineProfilerDiagnosticComment\": \"Sdsd\",\n" +
                "    \"onlineProfilerDiagnosticResult\": \"sdsd\",\n" +
                "    \"isOnlineSeatTestPerformed\": true,\n" +
                "    \"onlineSeatTestResult\": \"Pass\",\n" +
                "    \"onlineSeatTestResultA\": \"asasas\",\n" +
                "    \"onlineSeatTestResultB\": \"asa\",\n" +
                "    \"isOnsiteTroubleshooting\": false,\n" +
                "    \"onsiteTroubleshootingComment\": \"Sds\",\n" +
                "    \"requiredOpeningTime\": \"Sun Dec 31 10:00:00 GMT 1899\",\n" +
                "    \"operatingTemperartureMax\": \"90\",\n" +
                "    \"operatingTemperartureMin\": \"60\",\n" +
                "    \"operation\": \"50\",\n" +
                "    \"operatorDescription\": \"Operating with 2df\",\n" +
                "    \"operatorManufacturer\": \"MANUAL\",\n" +
                "    \"operatorModel\": \"NONE\",\n" +
                "    \"operatorSerialNumber\": \"12\",\n" +
                "    \"operatorType\": \"2df\",\n" +
                "    \"isOriginalValve\": false,\n" +
                "    \"overlayAreaOnBody\": \"NO\",\n" +
                "    \"overlayMaterial\": \"NO\",\n" +
                "    \"packing\": \"N/A\",\n" +
                "    \"paintCode\": \"WA401E\",\n" +
                "    \"paintSpec\": \"Light\",\n" +
                "    \"isPartialDevice\": true,\n" +
                "    \"partialDeviceComment\": \"Sdsdds\",\n" +
                "    \"pattern\": \"Long\",\n" +
                "    \"pid\": \"pid doc\",\n" +
                "    \"pilotValveComment\": \"Sdsd\",\n" +
                "    \"isPilotValveFitted\": true,\n" +
                "    \"pilotValveManufacturer\": \"sdsd\",\n" +
                "    \"pilotValveModel\": \"sdsd\",\n" +
                "    \"pipeMaterial\": \"polyvinylchloride \",\n" +
                "    \"pipeSize\": \"1/2\\\"\",\n" +
                "    \"pipeSpec\": \"Q1\",\n" +
                "    \"pipelinePressure\": \"wee\",\n" +
                "    \"plugCharacteristic\": \"34\",\n" +
                "    \"pmi\": \"100\",\n" +
                "    \"poNumber\": \"DNOW001\",\n" +
                "    \"positionIndicator\": false,\n" +
                "    \"positionerAction\": \"AA1122\",\n" +
                "    \"positionerFitted\": \"34\",\n" +
                "    \"positionerManufacturer\": \"dnow112299\",\n" +
                "    \"positionerModel\": \"dnow112299\",\n" +
                "    \"positionerSerialNumber\": \"dnow112299\",\n" +
                "    \"positionerType\": \"dnow112299\",\n" +
                "    \"isPossibleOnlineSeatLeakTest\": false,\n" +
                "    \"pressureBalanced\": \"334\",\n" +
                "    \"pressureRatingNpsOne\": \"1500\",\n" +
                "    \"pressureRatingNpsTwo\": \"150\",\n" +
                "    \"primarySealMaterial\": \"PTFE\",\n" +
                "    \"primarySealType\": \"O-ring\",\n" +
                "    \"priorityLevel\": \"4\",\n" +
                "    \"qty\": \"2\",\n" +
                "    \"quickExhaustComment\": \"Sdsd\",\n" +
                "    \"isQuickExhaustFitted\": false,\n" +
                "    \"quickExhaustManufacturer\": \"sdsd\",\n" +
                "    \"quickExhaustModel\": \"sdsd\",\n" +
                "    \"rating\": \"1500\",\n" +
                "    \"recommendedSetPressure\": \"sdsd\",\n" +
                "    \"repairDateOne\": \"35\",\n" +
                "    \"repairDateThree\": \"23\",\n" +
                "    \"repairDateTwo\": \"34\",\n" +
                "    \"isReplacement\": true,\n" +
                "    \"replacementComment\": \"Sdsd\",\n" +
                "    \"routineLubricationComment\": \"Asas\",\n" +
                "    \"isRoutineLubricationRecommended\": false,\n" +
                "    \"rowId\": 1,\n" +
                "    \"rt\": \"60\",\n" +
                "    \"runningTorqueBtc\": \"sdsd\",\n" +
                "    \"salesOrder\": \"1Q2PRSV1\",\n" +
                "    \"isSealantInjection\": false,\n" +
                "    \"sealantInjectionComment\": \"Sd\",\n" +
                "    \"seatDesign\": \"SOFT\",\n" +
                "    \"seatInjectionPort\": false,\n" +
                "    \"seatInsertMaterial\": \"PTFE reinforced\",\n" +
                "    \"seatRingMaterial\": \"A182-F51\",\n" +
                "    \"seatSpring\": \"Yes\",\n" +
                "    \"service\": \"24\",\n" +
                "    \"shaftIs\": \"23\",\n" +
                "    \"shortTextDescription\": \"10'' GATE VA 163-8/GO\",\n" +
                "    \"shutoffClass\": \"434\",\n" +
                "    \"signalRange\": \"A100\",\n" +
                "    \"signalType\": \"RED\",\n" +
                "    \"site\": \"Who Dat Field\",\n" +
                "    \"siteRecordNumber\": \"28\",\n" +
                "    \"solenoidComment\": \"Sds\",\n" +
                "    \"isSolenoidFitted\": false,\n" +
                "    \"solenoidManufacturer\": \"sdsd\",\n" +
                "    \"solenoidModel\": \"sdsd\",\n" +
                "    \"stemExtension\": false,\n" +
                "    \"stemInjectionPort\": false,\n" +
                "    \"stemTrunnionMaterial\": \"A182-F51\",\n" +
                "    \"subSystemNo\": \"dnow11223344-1\",\n" +
                "    \"supplyPressure\": \"P50000\",\n" +
                "    \"systemNo\": \"dnow11223344\",\n" +
                "    \"systemPressurized\": \"Isolatedasa\",\n" +
                "    \"testPackNo\": \"dnow11223344\",\n" +
                "    \"torque\": \"5\",\n" +
                "    \"travel\": \"No\",\n" +
                "    \"trimCode\": \"20\",\n" +
                "    \"trimSizeNumber\": \"34\",\n" +
                "    \"tubingMaterial\": \"sds\",\n" +
                "    \"tubingSize\": \"sdsd\",\n" +
                "    \"turnToOpenClose\": \"sdsd\",\n" +
                "    \"turnToOpenCloseResult\": \"Pass\",\n" +
                "    \"twentyMA\": \"YES\",\n" +
                "    \"ut\": \"45\",\n" +
                "    \"valveBrand\": \"RHSO\",\n" +
                "    \"valveCv\": \"3434v\",\n" +
                "    \"valveDataSheet\": \"Q2PRSV1\",\n" +
                "    \"isValveExternalLeakageCheck\": false,\n" +
                "    \"valveExternalLeakageResult\": \"Pass\",\n" +
                "    \"valveManufactureDate\": \"5/2019\",\n" +
                "    \"valveManufacturer\": \"American Valve\",\n" +
                "    \"valveModel\": \"B5U\",\n" +
                "    \"valveOrientation\": \"wewe\",\n" +
                "    \"valvePosition\": \"sddsd\",\n" +
                "    \"valveSerialNumber\": \"2147483647\",\n" +
                "    \"valveSubType\": \"Safety Relief Valve\",\n" +
                "    \"valveTagNo\": \"4rt\",\n" +
                "    \"valveTestingStandard\": \"Standard 20\",\n" +
                "    \"valveType\": \"BALL\",\n" +
                "    \"ventPlug\": false,\n" +
                "    \"isVisualConditionCheck\": true,\n" +
                "    \"visualConditionResult\": \"Pass\",\n" +
                "    \"isVisualInspection\": false,\n" +
                "    \"visualInspectionComment\": \"Asasq\",\n" +
                "    \"visualInspectionResult\": \"Pass\",\n" +
                "    \"volumeTankComment\": \"Sdsd\",\n" +
                "    \"isVolumeTankFitted\": true,\n" +
                "    \"volumeTankManufacturer\": \"sds\",\n" +
                "    \"volumeTankModel\": \"sdsd\",\n" +
                "    \"warrantyExpiryDate\": \"Fri Jan 10 00:00:00 GMT 2025\"\n" +
                "}";
    }

    public static String assetPageRequest() {
        return "{\n" +
                "  \"descending\": true,\n" +
                "  \"fieldLocationId\":" + configProperties.initialFieldLocationId + ",\n" +
                "  \"pageNumber\": 1,\n" +
                "  \"pageSize\": 100,\n" +
                "  \"sortProperties\": [\n" +
                "    \"id\"\n" +
                "  ]\n" +
                "}";
    }

    public static String getAssetFilters() {
        return "{\n" +
                "  \"assetFilterFields\": [\n" +
                "    \"ALL\"\n" +
                "  ],\n" +
                "  \"fieldLocationId\":" + configProperties.initialFieldLocationId + "\n" +
                "}";
    }

    public static String getAssetBySearch() {
        return "{\n" +
                "    \"area\": [],\n" +
                "    \"boreType\": [],\n" +
                "    \"criticality\": [],\n" +
                "    \"descending\": true,\n" +
                "    \"dnowNumber\": \"\",\n" +
                "    \"fieldLocationId\":" + configProperties.initialFieldLocationId + ",\n" +
                "    \"fluidCode\": [],\n" +
                "    \"isSurveyed\": \"ALL\",\n" +
                "    \"lifecycleEvents\": [],\n" +
                "    \"lineIsoNumber\": [],\n" +
                "    \"milestone\": [],\n" +
                "    \"module\": [],\n" +
                "    \"operatorManufacturer\": [],\n" +
                "    \"operatorType\": [],\n" +
                "    \"pageNumber\": 1,\n" +
                "    \"pageSize\": 10,\n" +
                "    \"pid\": [],\n" +
                "    \"pipeSpec\": [],\n" +
                "    \"sortProperties\": [],\n" +
                "    \"subSystem\": [],\n" +
                "    \"system\": [],\n" +
                "    \"testPack\": [],\n" +
                "    \"valveBrand\": [],\n" +
                "    \"valveModel\": [],\n" +
                "    \"valveSubType\": [],\n" +
                "    \"valveType\": []\n" +
                "}";
    }

    public static String projectRequest(String projectType, String activityType) {

        return "{\n" +
                "  \"ccspRequest\": {\n" +
                "    \"countryId\":" + configProperties.initialCountryId + ",\n" +
                "    \"customerId\":" + configProperties.initialCustomerId + ",\n" +
                "    \"fieldLocationId\":" + configProperties.initialFieldLocationId + ",\n" +
                "    \"projectType\": \"" + projectType + "\",\n" +
                "    \"siteId\":" + configProperties.initialSiteId + "\n" +
                "  },\n" +
                "  \"project\": \"string\",\n" +
                "  \"projectActivity\": \"" + activityType + "\",\n" +
                "  \"startDate\": \"" + getCurrentDate() + "\"" +
                "}";
    }

    public static String projectList(String projectType) {
        return "{\n" +
                "  \"descending\": true,\n" +
                "  \"isCompleted\": false,\n" +
                "  \"pageNumber\": 1,\n" +
                "  \"pageSize\": 100,\n" +
                "  \"projectType\": \"" + projectType + "\",\n" +
                "  \"sortProperties\": [\n" +
                "    \"id\"\n" +
                "  ]\n" +
                "}";
    }

    public static String listOfSurvey() {
        return "{\n" +
                "  \"countryId\":" + configProperties.initialCountryId + ",\n" +
                "  \"customerId\":" + configProperties.initialCustomerId + ",\n" +
                "  \"descending\": true,\n" +
                "  \"fieldLocationId\":" + configProperties.initialFieldLocationId + ",\n" +
                "  \"pageNumber\": 1,\n" +
                "  \"pageSize\": 100,\n" +
                "  \"siteId\":" + configProperties.initialSiteId + ",\n" +
                "  \"sortProperties\": [\n" +
                "    \"id\"\n" +
                "  ]\n" +
                "}";
    }

    public static String createMilestone() {
        return "{\n" +
                "  \"ccspRequest\": {\n" +
                "    \"countryId\":" + configProperties.initialCountryId + ",\n" +
                "    \"customerId\":" + configProperties.initialCustomerId + ",\n" +
                "    \"fieldLocationId\":" + configProperties.initialFieldLocationId + ",\n" +
                "    \"projectType\": \"EPC\",\n" +
                "    \"siteId\":" + configProperties.initialSiteId + "\n" +
                "  },\n" +
                "  \"endDate\": \"" + getCurrentDate() + "\",\n" +
                "  \"startDate\": \"" + getTomorrowDate() + "\"\n" +
                "}";
    }

    public static String milestoneListRequest() {
        return "{\n" +
                "  \"ccspRequest\": {\n" +
                "    \"countryId\":" + configProperties.initialCountryId + ",\n" +
                "    \"customerId\":" + configProperties.initialCustomerId + ",\n" +
                "    \"fieldLocationId\":" + configProperties.initialFieldLocationId + ",\n" +
                "    \"projectType\": \"EPC\",\n" +
                "    \"siteId\":" + configProperties.initialSiteId + "\n" +
                "  },\n" +
                "  \"descending\": true,\n" +
                "  \"lifecycleEvent\": \"\",\n" +
                "  \"milestone\": \"\",\n" +
                "  \"module\": \"\",\n" +
                "  \"pageNumber\": 1,\n" +
                "  \"pageSize\": 100,\n" +
                "  \"sortProperties\": [\n" +
                "    \"id\"\n" +
                "  ],\n" +
                "  \"subSystem\": \"\",\n" +
                "  \"system\": \"\",\n" +
                "  \"testPack\": \"\"\n" +
                "}";
    }

    public static String milestoneAssetAddRequest(String assetId, String toMilestoneId) {
        return "{\n" +
                "  \"assetList\": [\n" +
                "    " + assetId + "\n" +
                "  ],\n" +
                "  \"toMilestoneId\":" + toMilestoneId + "\n" +
                "}";
    }

    public static String milestoneAssetRemoveRequest(String assetId, String fromMilestoneId) {
        return "{\n" +
                "  \"assetList\": [\n" +
                "    " + assetId + "\n" +
                "  ],\n" +
                "  \"fromMilestoneId\":" + fromMilestoneId + "\n" +
                "}";
    }

    public static String documentRequest() {
        return "{\n" +
                "  \"countryId\":" + configProperties.initialCountryId + ",\n" +
                "  \"customerId\":" + configProperties.initialCustomerId + ",\n" +
                "  \"descending\": true,\n" +
                "  \"fieldLocationId\":" + configProperties.initialFieldLocationId + ",\n" +
                "  \"pageNumber\": 1,\n" +
                "  \"pageSize\": 100,\n" +
                "  \"siteId\":" + configProperties.initialSiteId + ",\n" +
                "  \"sortProperties\": [\n" +
                "    \"id\"\n" +
                "  ]\n" +
                "}";
    }

    public static String documentPathRequest(int docCategoryId, String docName) {
        return "{\n" +
                "  \"documentCategoryId\":" + docCategoryId + ",\n" +
                "  \"documentName\": \"" + docName + "\",\n" +
                "  \"fieldLocationId\":" + configProperties.initialFieldLocationId + ",\n" +
                "  \"projectType\": \"EPC\"\n" +
                "}";
    }

    public static String fileRequest(String sheetName, String projectType, String sheetStatus) {
        return "{\n" +
                "  \"ccspRequest\": {\n" +
                "    \"countryId\":" + configProperties.initialCountryId + ",\n" +
                "    \"customerId\":" + configProperties.initialCustomerId + ",\n" +
                "    \"fieldLocationId\":" + configProperties.initialFieldLocationId + ",\n" +
                "    \"projectType\": \"" + projectType + "\",\n" +
                "    \"siteId\":" + configProperties.initialSiteId + "\n" +
                "  },\n" +
                "  \"dataSheetType\": \"" + sheetName + "\",\n" +
                "  \"pageRequest\": {\n" +
                "    \"descending\": true,\n" +
                "    \"pageNumber\": 1,\n" +
                "    \"pageSize\": 100,\n" +
                "    \"sortProperties\": [\n" +
                "      \"id\"\n" +
                "    ]\n" +
                "  },\n" +
                "  \"status\": \"" + sheetStatus + "\"\n" +
                "}";
    }

    public static String dataSheetUpdateRequest(String sheetName, String dataSheetId, String projectType) {
        return "{\n" +
                "  \"dataSheetIds\": [" + dataSheetId + "],\n" +
                "  \"dataSheetType\": \"" + sheetName + "\",\n" +
                "  \"projectType\": \"" + projectType + "\",\n" +
                "  \"status\": \"APPROVED\"\n" +
                "}";
    }

    public static String CustomerInventorySearchRequest() {
        return "{\n" +
                "  \"countryId\":" + configProperties.initialCountryId + ",\n" +
                "  \"customerId\":" + configProperties.initialCustomerId + ",\n" +
                "  \"descending\": true,\n" +
                "  \"fieldLocationId\":" + configProperties.initialFieldLocationId + ",\n" +
                "  \"pageNumber\":1,\n" +
                "  \"pageSize\":100,\n" +
                "  \"siteId\":" + configProperties.initialSiteId + ",\n" +
                "  \"sortProperties\": [\n" +
                "    \"id\"\n" +
                "  ],\n" +
                "  \"status\": \"APPROVED\"\n" +
                "}";
    }

    public static String CustomerInventorySearchRequestById(String dataSheetId) {
        return "{\n" +
                "    \"dataSheetId\": \"" + dataSheetId + "\",\n" +
                "    \"descending\": false,\n" +
                "    \"pageNumber\": 1,\n" +
                "    \"pageSize\": 100,\n" +
                "    \"sortProperties\": [\n" +
                "        \"id\"\n" +
                "    ]\n" +
                "}";
    }

    public static String updateEnpDataSheet(String dataSheetId) {
        return "{\n" +
                "\t\"id\":" + dataSheetId + ",\n" +
                "\t\"customer\": \"Tess\",\n" +
                "\t\"country\": \"USA\",\n" +
                "\t\"site\": \"Florida\",\n" +
                "\t\"fieldLocation\": \"Fort Myers\",\n" +
                "\t\"valveManufacturer\": \"American Valve\",\n" +
                "\t\"valveBrand\": \"RHSO\",\n" +
                "\t\"valveType\": \"BALL\",\n" +
                "\t\"valveSubType\": \"Safety Relief Valve\",\n" +
                "\t\"valveModel\": \"UPDATE VALVE MODEL " + randomNum + "\",\n" +
                "\t\"shortTextDescription\": \"10'' GATE VA 163-8/GO\",\n" +
                "\t\"longTextDescription\": \"VALVE BALL TRUNNION 16 IN RAISED FACE CLASS 900 REGULAR PORT 3 PIECE " +
                "BOLTED BODY LF2\",\n" +
                "\t\"oemMaterialNumber\": \"UNK123\",\n" +
                "\t\"valveDataSheet\": \"Q2PRSV1\",\n" +
                "\t\"qty\": \"2\",\n" +
                "\t\"boreType\": \"Reduced\",\n" +
                "\t\"npsOne\": \"1/2\\\"\",\n" +
                "\t\"npsTwo\": \"1/2\\\"\",\n" +
                "\t\"boreSize\": \"4\",\n" +
                "\t\"pressureRatingNpsOne\": \"1500\",\n" +
                "\t\"pressureRatingNpsTwo\": \"150\",\n" +
                "\t\"endConnectionOne\": \"ANSI\",\n" +
                "\t\"endConnectionTwo\": \"RF\",\n" +
                "\t\"designTemperartureMax\": \"110\",\n" +
                "\t\"designTemperartureMin\": \"50\",\n" +
                "\t\"operatingTemperartureMax\": \"90\",\n" +
                "\t\"operatingTemperartureMin\": \"60\",\n" +
                "\t\"bodyDesign\": \"Two Piece Side Entry\",\n" +
                "\t\"obturatorDesign\": \"Ball\",\n" +
                "\t\"seatDesign\": \"SOFT\",\n" +
                "\t\"bodyMaterial\": \"A105N\",\n" +
                "\t\"obturatorMaterial\": \"A182-F51\",\n" +
                "\t\"seatRingMaterial\": \"A182-F51\",\n" +
                "\t\"seatInsertMaterial\": \"PTFE reinforced\",\n" +
                "\t\"stemTrunnionMaterial\": \"A182-F51\",\n" +
                "\t\"primarySealType\": \"O-ring\",\n" +
                "\t\"primarySealMaterial\": \"PTFE\",\n" +
                "\t\"gaskets\": \"UNK\",\n" +
                "\t\"packing\": \"N/A\",\n" +
                "\t\"lockableDevice\": \"Yes\",\n" +
                "\t\"antiStatic\": \"Yes\",\n" +
                "\t\"ballPositionIndicator\": \"Yes\",\n" +
                "\t\"stemInjectionPort\": \"Yes\",\n" +
                "\t\"seatInjectionPort\": \"Yes\",\n" +
                "\t\"ventPlug\": \"Yes\",\n" +
                "\t\"drainPlug\": \"Yes\",\n" +
                "\t\"stemExtension\": \"No\",\n" +
                "\t\"overlayAreaOnBody\": \"No\",\n" +
                "\t\"overlayMaterial\": \"No\",\n" +
                "\t\"actuatedManual\": \"MANUAL\",\n" +
                "\t\"operatorManufacturer\": \"MANUAL\",\n" +
                "\t\"operatorModel\": \"NoNE\",\n" +
                "\t\"operatorType\": \"2df\",\n" +
                "\t\"operatorDescription\": \"Operating with 2df\",\n" +
                "\t\"valveSerialNumber\": \"440705\",\n" +
                "\t\"operatorSerialNumber\": \"12\",\n" +
                "\t\"valveManufactureDate\": \"Sun Jan 10 00:00:00 GMT 2016\",\n" +
                "\t\"epcName\": \"Checking\",\n" +
                "\t\"service\": \"24\",\n" +
                "\t\"valveTagNo\": \"4rt\",\n" +
                "\t\"salesOrder\": \"1Q2PRSV1\",\n" +
                "\t\"equipmentNumber\": \"EQ100\",\n" +
                "\t\"blowOutProofStem\": \"Yes\",\n" +
                "\t\"boltingMaterial\": \"AB123\",\n" +
                "\t\"boltCoating\": \"Yes\",\n" +
                "\t\"flangeStandard\": \"AS4087\",\n" +
                "\t\"bonnetDesign\": \"Yes\",\n" +
                "\t\"pattern\": \"Center\",\n" +
                "\t\"certifiedLengthMm\": \"1000\",\n" +
                "\t\"dbbFeature\": \"d3\",\n" +
                "\t\"operation\": \"50\",\n" +
                "\t\"trimCode\": \"20\",\n" +
                "\t\"naceMrFive\": \"13\",\n" +
                "\t\"naceMrThree\": \"13\",\n" +
                "\t\"dnowValveNo\": \"DNoW165\",\n" +
                "\t\"dnowProjectNo\": \"DNoW165\",\n" +
                "\t\"poNumber\": \"DNoW001\",\n" +
                "\t\"area\": \"Vessel\",\n" +
                "\t\"module\": \"32\",\n" +
                "\t\"pid\": \"DVV11003\",\n" +
                "\t\"lineIsoNumber\": \"165\",\n" +
                "\t\"gaDrawing\": \"165\",\n" +
                "\t\"bom\": \"165\",\n" +
                "\t\"pipeSize\": \"1/2\\\"\",\n" +
                "\t\"pipeSpec\": \"Q1\",\n" +
                "\t\"fluidCode\": \"23\",\n" +
                "\t\"pipeMaterial\": \"STST\",\n" +
                "\t\"paintSpec\": \"Light\",\n" +
                "\t\"paintCode\": \"WA401E\",\n" +
                "\t\"functionalLocation\": \"USA\",\n" +
                "\t\"failPosition\": \"Last\",\n" +
                "\t\"criticality\": \"1\",\n" +
                "\t\"priorityLevel\": \"4\",\n" +
                "\t\"extensionHeight\": \"15''\",\n" +
                "\t\"firesafeSeals\": \"Yes\",\n" +
                "\t\"seatSpring\": \"Yes\",\n" +
                "\t\"siteRecordNumber\": \"28\",\n" +
                "\t\"insulation\": \"Yes\",\n" +
                "\t\"manualOverideFitted\": \"Yes\",\n" +
                "\t\"travel\": \"No\",\n" +
                "\t\"recommendedAirSupplyRange\": \"5000\",\n" +
                "\t\"requiredOpeningTime\": \"Sun Dec 31 10:00:00 GMT 1899\",\n" +
                "\t\"requiredClosingTime\": \"Sun Dec 31 12:00:00 GMT 1899\",\n" +
                "\t\"positionIndicator\": \"Yes\",\n" +
                "\t\"indicatorType\": \"Green\",\n" +
                "\t\"indicatorManufacturer\": \"AABB Manufacturers\",\n" +
                "\t\"indicatorModel\": \"AABB1122\",\n" +
                "\t\"valveTestingStandard\": \"Standard 20\",\n" +
                "\t\"hydrostatic\": \"Yes\",\n" +
                "\t\"lpPneumatic\": \"11\",\n" +
                "\t\"hpPneumatic\": \"30\",\n" +
                "\t\"torque\": \"5\",\n" +
                "\t\"backseat\": \"10\",\n" +
                "\t\"nde\": \"15\",\n" +
                "\t\"astmAsme\": \"20\",\n" +
                "\t\"lpi\": \"25\",\n" +
                "\t\"mpi\": \"30\",\n" +
                "\t\"ut\": \"45\",\n" +
                "\t\"rt\": \"60\",\n" +
                "\t\"pmi\": \"100\",\n" +
                "\t\"enThreeDotOne\": \"b23\",\n" +
                "\t\"enThreeDotTwo\": \"w5\",\n" +
                "\t\"installationDate\": \"34\",\n" +
                "\t\"lastCertificationDate\": \"34\",\n" +
                "\t\"inspectionInterval\": \"3423\",\n" +
                "\t\"nextCertificationDate\": \"34\",\n" +
                "\t\"repairDateOne\": \"35\",\n" +
                "\t\"isoFailureModeOne\": \"223\",\n" +
                "\t\"repairDateTwo\": \"34\",\n" +
                "\t\"isoFailureModeTwo\": \"34\",\n" +
                "\t\"repairDateThree\": \"23\",\n" +
                "\t\"isoFailureModeThree\": \"2323\",\n" +
                "\t\"mtbfMonths\": \"34\",\n" +
                "\t\"shutoffClass\": \"434\",\n" +
                "\t\"valveCv\": \"3434v\",\n" +
                "\t\"flowDirection\": \"2df\",\n" +
                "\t\"shaftIs\": \"23\",\n" +
                "\t\"plugCharacteristic\": \"34\",\n" +
                "\t\"pressureBalanced\": \"334\",\n" +
                "\t\"trimSizeNumber\": \"34\",\n" +
                "\t\"positionerFitted\": \"34\",\n" +
                "\t\"positionerManufacturer\": \"dNow112299\",\n" +
                "\t\"positionerType\": \"dNow112299\",\n" +
                "\t\"positionerModel\": \"dNow112299\",\n" +
                "\t\"positionerSerialNumber\": \"dNow112299\",\n" +
                "\t\"signalRange\": \"A100\",\n" +
                "\t\"supplyPressure\": \"P50000\",\n" +
                "\t\"positionerAction\": \"AA1122\",\n" +
                "\t\"twentyMA\": \"Yes\",\n" +
                "\t\"signalType\": \"RED\",\n" +
                "\t\"warrantyExpiryDate\": \"Fri Jan 10 00:00:00 GMT 2025\",\n" +
                "\t\"systemNo\": \"dNow11223344\",\n" +
                "\t\"subSystemNo\": \"dNow11223344-1\",\n" +
                "\t\"testPackNo\": \"dNow11223344\",\n" +
                "\t\"dnowJointId\": \"dNow11223344-1\",\n" +
                "\t\"clientJointId\": \"dNow11223344-1\",\n" +
                "\t\"flangeSize\": \"229mm\",\n" +
                "\t\"pressureRatingFlange\": \"270\",\n" +
                "\t\"flangeType\": \"neck\",\n" +
                "\t\"gasketType\": \"Type 1\",\n" +
                "\t\"gasketMaterial\": \"rubber\",\n" +
                "\t\"studNutMaterial\": \"WCB\",\n" +
                "\t\"boltSize\": \"16”\",\n" +
                "\t\"boltLength\": \"33\\\"\",\n" +
                "\t\"boltQuantity\": \"13\",\n" +
                "\t\"recommendedTorqueMethod\": \"calibrated \",\n" +
                "\t\"toolPumpReference\": \"13\",\n" +
                "\t\"requiredTorqueValue30\": \"20\",\n" +
                "\t\"requiredTorqueValue60\": \"60\",\n" +
                "\t\"requiredTorqueValue100\": \"100\",\n" +
                "\t\"requiredTorqueToolPressure30\": \"20\",\n" +
                "\t\"requiredTorqueToolPressure60\": \"60\",\n" +
                "\t\"requiredTorqueToolPressure100\": \"100\",\n" +
                "\t\"tensioningCoverage\": \"50\",\n" +
                "\t\"requiredTensionToolPressure\": \"112\",\n" +
                "\t\"lubricantRequired\": \"Yes\",\n" +
                "\t\"lubricantCof\": \"12\",\n" +
                "\t\"status\": \"NEW\",\n" +
                "\t\"isError\": false,\n" +
                "\t\"errorMsg\": null,\n" +
                "\t\"isDeleted\": false,\n" +
                "\t\"ftoFDimension\": \"10*10\"\n" +
                "}";
    }

    public static String updateEpcDataSheet(String dataSheetId) {
        return "{\n" +
                "\t\"id\":" + dataSheetId + ",\n" +
                "\t\"customer\": \"Tess\",\n" +
                "\t\"country\": \"USA\",\n" +
                "\t\"site\": \"Florida\",\n" +
                "\t\"fieldLocation\": \"Fort Myers\",\n" +
                "\t\"valveManufacturer\": \"American Valve1\",\n" +
                "\t\"valveBrand\": \"RHSO\",\n" +
                "\t\"valveType\": \"BALL\",\n" +
                "\t\"valveSubType\": \"Safety Relief Valve\",\n" +
                "\t\"valveModel\": \"UPDATE VALVE MODEL " + randomNum + "\",\n" +
                "\t\"shortTextDescription\": \"10'' GATE VA 163-8/GO\",\n" +
                "\t\"longTextDescription\": \"VALVE BALL TRUNNION 16 IN RAISED FACE CLASS 900 REGULAR PORT 3 PIECE " +
                "BOLTED BODY LF2\",\n" +
                "\t\"oemMaterialNumber\": \"UNK123\",\n" +
                "\t\"valveDataSheet\": \"Q2PRSV1\",\n" +
                "\t\"qty\": \"2\",\n" +
                "\t\"boreType\": \"Reduced\",\n" +
                "\t\"npsOne\": \"1/2\\\"\",\n" +
                "\t\"npsTwo\": \"1/2\\\"\",\n" +
                "\t\"boreSize\": \"4\",\n" +
                "\t\"pressureRatingNpsOne\": \"1500\",\n" +
                "\t\"pressureRatingNpsTwo\": \"150\",\n" +
                "\t\"endConnectionOne\": \"ANSI\",\n" +
                "\t\"endConnectionTwo\": \"RF\",\n" +
                "\t\"designTemperartureMax\": \"110\",\n" +
                "\t\"designTemperartureMin\": \"50\",\n" +
                "\t\"operatingTemperartureMax\": \"90\",\n" +
                "\t\"operatingTemperartureMin\": \"60\",\n" +
                "\t\"bodyDesign\": \"Two Piece Side Entry\",\n" +
                "\t\"obturatorDesign\": \"Ball\",\n" +
                "\t\"seatDesign\": \"SOFT\",\n" +
                "\t\"bodyMaterial\": \"A105N\",\n" +
                "\t\"obturatorMaterial\": \"A182-F51\",\n" +
                "\t\"seatRingMaterial\": \"A182-F51\",\n" +
                "\t\"seatInsertMaterial\": \"PTFE reinforced\",\n" +
                "\t\"stemTrunnionMaterial\": \"A182-F51\",\n" +
                "\t\"primarySealType\": \"O-ring\",\n" +
                "\t\"primarySealMaterial\": \"PTFE\",\n" +
                "\t\"gaskets\": \"UNK\",\n" +
                "\t\"packing\": \"N/A\",\n" +
                "\t\"lockableDevice\": \"Yes\",\n" +
                "\t\"antiStatic\": \"Yes\",\n" +
                "\t\"ballPositionIndicator\": \"Yes\",\n" +
                "\t\"stemInjectionPort\": \"Yes\",\n" +
                "\t\"seatInjectionPort\": \"Yes\",\n" +
                "\t\"ventPlug\": \"Yes\",\n" +
                "\t\"drainPlug\": \"Yes\",\n" +
                "\t\"stemExtension\": \"No\",\n" +
                "\t\"overlayAreaOnBody\": \"NO\",\n" +
                "\t\"overlayMaterial\": \"NO\",\n" +
                "\t\"actuatedManual\": \"MANUAL\",\n" +
                "\t\"operatorManufacturer\": \"MANUAL\",\n" +
                "\t\"operatorModel\": \"NONE\",\n" +
                "\t\"operatorType\": \"2df\",\n" +
                "\t\"operatorDescription\": \"Operating with 2df\",\n" +
                "\t\"valveSerialNumber\": \"2147483647\",\n" +
                "\t\"operatorSerialNumber\": \"12\",\n" +
                "\t\"valveManufactureDate\": \"Sun Jan 10 00:00:00 GMT 2016\",\n" +
                "\t\"epcName\": \"Checking\",\n" +
                "\t\"service\": \"24\",\n" +
                "\t\"valveTagNo\": \"4rt\",\n" +
                "\t\"salesOrder\": \"1Q2PRSV1\",\n" +
                "\t\"equipmentNumber\": \"EQ100\",\n" +
                "\t\"blowOutProofStem\": \"Yes\",\n" +
                "\t\"boltingMaterial\": \"AB123\",\n" +
                "\t\"boltCoating\": \"Yes\",\n" +
                "\t\"flangeStandard\": \"AS4087\",\n" +
                "\t\"bonnetDesign\": \"Yes\",\n" +
                "\t\"pattern\": \"Center\",\n" +
                "\t\"certifiedLengthMm\": \"1000\",\n" +
                "\t\"dbbFeature\": \"d3\",\n" +
                "\t\"operation\": \"50\",\n" +
                "\t\"trimCode\": \"20\",\n" +
                "\t\"naceMrFive\": \"13\",\n" +
                "\t\"naceMrThree\": \"13\",\n" +
                "\t\"dnowValveNo\": \"DNOW165\",\n" +
                "\t\"dnowProjectNo\": \"DNOW165\",\n" +
                "\t\"poNumber\": \"DNOW001\",\n" +
                "\t\"area\": \"Vessel\",\n" +
                "\t\"module\": \"32\",\n" +
                "\t\"pid\": \"DVV11003\",\n" +
                "\t\"lineIsoNumber\": \"165\",\n" +
                "\t\"gaDrawing\": \"165\",\n" +
                "\t\"bom\": \"165\",\n" +
                "\t\"pipeSize\": \"1/2\\\"\",\n" +
                "\t\"pipeSpec\": \"Q1\",\n" +
                "\t\"fluidCode\": \"23\",\n" +
                "\t\"pipeMaterial\": \"STST\",\n" +
                "\t\"paintSpec\": \"Light\",\n" +
                "\t\"paintCode\": \"WA401E\",\n" +
                "\t\"functionalLocation\": \"USA\",\n" +
                "\t\"failPosition\": \"Last\",\n" +
                "\t\"criticality\": \"1\",\n" +
                "\t\"priorityLevel\": \"4\",\n" +
                "\t\"extensionHeight\": \"15''\",\n" +
                "\t\"firesafeSeals\": \"Yes\",\n" +
                "\t\"seatSpring\": \"Yes\",\n" +
                "\t\"siteRecordNumber\": \"28\",\n" +
                "\t\"insulation\": \"Yes\",\n" +
                "\t\"manualOverideFitted\": \"Yes\",\n" +
                "\t\"travel\": \"No\",\n" +
                "\t\"recommendedAirSupplyRange\": \"5000\",\n" +
                "\t\"requiredOpeningTime\": \"Sun Dec 31 10:00:00 GMT 1899\",\n" +
                "\t\"requiredClosingTime\": \"Sun Dec 31 12:00:00 GMT 1899\",\n" +
                "\t\"positionIndicator\": \"Yes\",\n" +
                "\t\"indicatorType\": \"Green\",\n" +
                "\t\"indicatorManufacturer\": \"AABB Manufacturers\",\n" +
                "\t\"indicatorModel\": \"AABB1122\",\n" +
                "\t\"valveTestingStandard\": \"Standard 20\",\n" +
                "\t\"hydrostatic\": \"Yes\",\n" +
                "\t\"lpPneumatic\": \"11\",\n" +
                "\t\"hpPneumatic\": \"30\",\n" +
                "\t\"torque\": \"5\",\n" +
                "\t\"backseat\": \"10\",\n" +
                "\t\"nde\": \"15\",\n" +
                "\t\"astmAsme\": \"20\",\n" +
                "\t\"lpi\": \"25\",\n" +
                "\t\"mpi\": \"30\",\n" +
                "\t\"ut\": \"45\",\n" +
                "\t\"rt\": \"60\",\n" +
                "\t\"pmi\": \"100\",\n" +
                "\t\"enThreeDotOne\": \"b23\",\n" +
                "\t\"enThreeDotTwo\": \"w5\",\n" +
                "\t\"installationDate\": \"34\",\n" +
                "\t\"lastCertificationDate\": \"34\",\n" +
                "\t\"inspectionInterval\": \"3423\",\n" +
                "\t\"nextCertificationDate\": \"34\",\n" +
                "\t\"repairDateOne\": \"35\",\n" +
                "\t\"isoFailureModeOne\": \"223\",\n" +
                "\t\"repairDateTwo\": \"34\",\n" +
                "\t\"isoFailureModeTwo\": \"34\",\n" +
                "\t\"repairDateThree\": \"23\",\n" +
                "\t\"isoFailureModeThree\": \"2323\",\n" +
                "\t\"mtbfMonths\": \"34\",\n" +
                "\t\"shutoffClass\": \"434\",\n" +
                "\t\"valveCv\": \"3434v\",\n" +
                "\t\"flowDirection\": \"2df\",\n" +
                "\t\"shaftIs\": \"23\",\n" +
                "\t\"plugCharacteristic\": \"34\",\n" +
                "\t\"pressureBalanced\": \"334\",\n" +
                "\t\"trimSizeNumber\": \"34\",\n" +
                "\t\"positionerFitted\": \"34\",\n" +
                "\t\"positionerManufacturer\": \"dnow112299\",\n" +
                "\t\"positionerType\": \"dnow112299\",\n" +
                "\t\"positionerModel\": \"dnow112299\",\n" +
                "\t\"positionerSerialNumber\": \"dnow112299\",\n" +
                "\t\"signalRange\": \"A100\",\n" +
                "\t\"supplyPressure\": \"P50000\",\n" +
                "\t\"positionerAction\": \"AA1122\",\n" +
                "\t\"twentyMA\": \"YES\",\n" +
                "\t\"signalType\": \"RED\",\n" +
                "\t\"warrantyExpiryDate\": \"Fri Jan 10 00:00:00 GMT 2025\",\n" +
                "\t\"systemNo\": \"dnow11223344\",\n" +
                "\t\"subSystemNo\": \"dnow11223344-1\",\n" +
                "\t\"testPackNo\": \"dnow11223344\",\n" +
                "\t\"dnowJointId\": \"dnow11223344-1\",\n" +
                "\t\"clientJointId\": \"dnow11223344-1\",\n" +
                "\t\"flangeSize\": \"229mm\",\n" +
                "\t\"pressureRatingFlange\": \"270\",\n" +
                "\t\"flangeType\": \"neck\",\n" +
                "\t\"gasketType\": \"Type 1\",\n" +
                "\t\"gasketMaterial\": \"rubber\",\n" +
                "\t\"studNutMaterial\": \"WCB\",\n" +
                "\t\"boltSize\": \"16”\",\n" +
                "\t\"boltLength\": \"33\\\"\",\n" +
                "\t\"boltQuantity\": \"13\",\n" +
                "\t\"recommendedTorqueMethod\": \"calibrated \",\n" +
                "\t\"toolPumpReference\": \"13\",\n" +
                "\t\"requiredTorqueValue30\": null,\n" +
                "\t\"requiredTorqueValue60\": null,\n" +
                "\t\"requiredTorqueValue100\": null,\n" +
                "\t\"requiredTorqueToolPressure30\": null,\n" +
                "\t\"requiredTorqueToolPressure60\": null,\n" +
                "\t\"requiredTorqueToolPressure100\": null,\n" +
                "\t\"tensioningCoverage\": \"50\",\n" +
                "\t\"requiredTensionToolPressure\": \"112\",\n" +
                "\t\"lubricantRequired\": \"Yes\",\n" +
                "\t\"lubricantCof\": \"12\",\n" +
                "\t\"status\": \"NEW\",\n" +
                "\t\"isError\": false,\n" +
                "\t\"errorMsg\": null,\n" +
                "\t\"isDeleted\": false,\n" +
                "\t\"nps\": null,\n" +
                "\t\"studSize\": null,\n" +
                "\t\"studLength\": null,\n" +
                "\t\"studQuantity\": null,\n" +
                "\t\"recommendedTighteningTool\": null,\n" +
                "\t\"requiredTorqueValuePerThirty\": \"20\",\n" +
                "\t\"requiredTorqueValuePerSixty\": \"60\",\n" +
                "\t\"requiredTorqueValuePerHundred\": \"100\",\n" +
                "\t\"requiredTorqueToolPressure\": \"20\",\n" +
                "\t\"requiredTorqueToolPressureSixty\": \"60\",\n" +
                "\t\"requiredTorqueToolPressurePerHundred\": \"100\",\n" +
                "\t\"requiredTensionToolPressureOne\": null,\n" +
                "\t\"requiredTensionToolPressureTwo\": null,\n" +
                "\t\"requiredTensionToolPressureThree\": null,\n" +
                "\t\"requiredTensionToolPressureFour\": null,\n" +
                "\t\"ftoFDimension\": \"10*10\"\n" +
                "}";
    }

  /*
    public static String readJsonFile(String fileName) {
     public static String getAssetFilters = readJsonFile("abc.json");
        JSONParser parser = new JSONParser();
        String name = "";
        Reader reader;

        {
            try {
                reader = new FileReader(configProperties.filePath + fileName);
                JSONObject jsonObject = (JSONObject) parser.parse(reader);


                name = jsonObject.toJSONString();
                System.out.println(name);
            } catch (ParseException | IOException e) {
                e.printStackTrace();
            }
        }
        return name;
    }
    */


}