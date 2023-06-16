package Utility;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static Utility.UserProfile.planCurrency;

public class API {

    public static class CurrencyExchangeRate {
        public static double ToUSD ;
        public static double ToEuro ;
        public static double ToGBP;
        public static double ToJPY;
        public static double ToCNY;

        public void rates() {
            String url = null;
            if (planCurrency.equals("USD")) {
                String fromUSD = "https://api.exchangerate-api.com/v4/latest/USD";
                url=fromUSD;
            }
            else if (planCurrency.equals("Euro")) {
                String fromEuro = "https://api.exchangerate-api.com/v4/latest/EUR";
                url=fromEuro;
            }
            else if (planCurrency.equals("GBP")) {
                String fromEuro = "https://api.exchangerate-api.com/v4/latest/GBP";
                url=fromEuro;
            }
            try {
                URL obj = new URL(url);
                HttpURLConnection con = (HttpURLConnection) obj.openConnection();
                con.setRequestMethod("GET");
                int responseCode = con.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    String inputLine;
                    StringBuilder response = new StringBuilder();
                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    in.close();
                    JSONObject myResponse = new JSONObject(response.toString());
                    double usdTousd = myResponse.getJSONObject("rates").getDouble("USD");
                    ToUSD = usdTousd;
                    double usdToEur = myResponse.getJSONObject("rates").getDouble("EUR");
                    ToEuro = usdToEur;
                    double usdToGbp = myResponse.getJSONObject("rates").getDouble("GBP");
                    ToGBP = usdToGbp;
                    double usdToJpy = myResponse.getJSONObject("rates").getDouble("JPY");
                    ToJPY =usdToJpy;
                    double usdToCny = myResponse.getJSONObject("rates").getDouble("CNY");
                    ToCNY = usdToCny;
                    System.out.println(planCurrency+" to EUR: " + usdToEur);
                    System.out.println(planCurrency+" to USD: " + usdTousd);
                    System.out.println(planCurrency+" to GBP: " + usdToGbp);
                    System.out.println(planCurrency+" to JPY: " + usdToJpy);
                    System.out.println(planCurrency+" to CNY: " + usdToCny);
                } else {
                    System.out.println("GET request not worked");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
