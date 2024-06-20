package utils;

public class configuration {

    private static final String STAG = "";
    public static final String Environment = STAG;
    private static final String Url ;

    static {
        if (Environment.equals(STAG)){
            Url="https://app-stg.converted.in/login";
        }
        else {
            Url= "https://app.converted.in/login";
        }
    }

    public static String getURL(){
        return Url;
    }
}
