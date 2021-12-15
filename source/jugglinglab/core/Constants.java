// Constants.java
//
// Copyright 2021 by Jack Boyce (jboyce@gmail.com)

package jugglinglab.core;

public class Constants {
    public static final String version = "1.5.1";
    public static final String year = "2021";

    public static final String site_URL = "http://jugglinglab.org";
    public static final String download_URL = "https://jugglinglab.org/#download";
    public static final String help_URL = "https://jugglinglab.org/#help";

    public static final boolean DEBUG_PARSING = false;
    public static final boolean DEBUG_LAYOUT = false;
    public static final boolean DEBUG_TRANSITIONS = false;
    public static final boolean DEBUG_GENERATOR = false;
    public static final boolean DEBUG_OPTIMIZE = false;
    public static final boolean DEBUG_OPEN_SERVER = false;
    public static final boolean VALIDATE_GENERATED_PATTERNS = false;

    public static final int ANGLE_LAYOUT_METHOD = jugglinglab.curve.Curve.lineCurve;
    public static final int SPLINE_LAYOUT_METHOD = jugglinglab.curve.SplineCurve.rmsaccel;

    public static final int RESERVED_WIDTH_PIXELS = 1200;
}
