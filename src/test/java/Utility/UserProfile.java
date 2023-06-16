package Utility;

public class UserProfile {
    public static String environment = null;
    public static String planName = null;
    public static String planCurrency = "USD";
    //public static String planCurrency = "Euro";
    //public static String planCurrency = "GBP";

    public static class cardLoad {
        public static double clRate = 0.0300;
        public static double clMin = 0;
        public static double clMax = 0;
    }

    public static class FP {
        public static double fpRate = 0.02;
        public static double fpMin = 20;
        public static double fpMax = 500;
    }

    public static class ACH {
        public static double achRate = 0.02;
        public static double achMin = 20;
        public static double achMax = 500;
    }

    public static class SEPA {
        public static double sepaRate = 0.02;
        public static double sepaMin = 20;
        public static double sepaMax = 500;
    }

    public static class WIR {
        public static double wirRate = 0.02;
        public static double wirMin = 20;
        public static double wirMax = 500;
    }

    public static class exchangeRateFromUSD {
        public static double euro = 0.02;
        public static double gbp = 20;
        public static double cny = 500;
        public static double jpy = 500;
    }



}

