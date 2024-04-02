package com.accord.SmartNav_Handheld.Utils;

import java.util.Arrays;
import java.util.List;

public  class Constants {
    public static final String SMART_NAV_PACKAGE_NAME = "com.accord.smartnav20_v20:id/";

    public static String LOGIN_PIN = "123456";
    public static String NEW_LOGIN_PIN = "121212";

    public static String MAINTENANCE_PASSWORD = "accord_123";

    public static String KMM_PASSWORD = "Acc0rd@123";
    public static String TRACK_RENAME_TEXT = "Renaming_Track";
    public static String ABBR_TIME = "Current time";
    public static String ABBR_ALT = "Altitude";
    public static String ABBR_ETA = "Estimated time of arrival";
    public static String ABBR_TTN = "Time to next waypoint";
    public static String ABBR_DST = "Destination waypoint";
    public static String ABBR_DTD = "Distance to destination";
    public static String ABBR_TTD = "Time to destination";
    public static String ABBR_BRG = "Bearing to next waypoint";
    public static String ABBR_HDG = "Heading to next waypoint";
    public static String ABBR_XTE = "Cross track error course value";
    public static String ABBR_SPEED = "Current speed";
    public static String ABBR_TAS = "Trip average speed";
    public static String ABBR_TMS = "Trip maximum speed";
    public static String ABBR_NXT = "Next waypoint";
    public static String ABBR_ETN = "Estimated time of arrival at next waypoint";
    public static String ABBR_DTN = "Distance to next waypoint";
    public static String ABBR_TST = "Trip start time";
    public static String ABBR_TOD = "Trip odometer";
    public static String ABBR_TMR = "Trip timer";
    public static String ABBR_VMG = "Velocity made good";

    public static String KALIANPUR_1975_SEMI_MAJOR_AXIS = "6377299.151";
    public static String KALIANPUR_1975_INVERSE_FLATTENING = "300.8017255";
    public static String KALIANPUR_1975_DELTA_X = "295";
    public static String KALIANPUR_1975_DELTA_Y = "736";
    public static String KALIANPUR_1975_DELTA_Z = "257";

    public static List<String> POSITION_FORMATS = Arrays.asList("dd.ddddd", "dd mm ss.ss", "dd mm.mmmm", "IGRS (New)", "IGRS (Old)", "ECEF", "MGRS", "UserDefined_LCC");

}
