package CurrencyConverterWithAPI;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

// ...

public class CurrencyConverterWithAPI {

    // Variables
    static final String welcomeText = ("""
            --------------------------------------------------------------
            Welcome to The Currency Converter
             where Currency Exchange Rates are updated every 20 mins
             which provides you with the best value for money.
             To start off what currency would you
             like to convert from?""");

    static final String welcomeText1 = ("Now that we've have chose the currency to convert into another currency.\n" +
            "What Currency would you like to convert into?");

    static final String AmmountText = ("""
            Now that we have chose the final currency to tranfer to
            We need the amount of currency you would like to use to transfer.
            Please enter the amount of currency underneath.""");

    static String RED = "\u001B[31m";
    static String GREEN = "\u001B[32m";
    static String RESET = "\u001B[0m";
    static String YELLOW = "\u001B[33m";

    static String Link = "https://open.er-api.com/v6/latest/AUD";

    public static void main(String[] args) throws Exception {

        //Http Client Definition!
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(new URI("https://open.er-api.com/v6/latest/AUD"))
                .header("Authorization", "d7265cb74c84403c2885580c")
                .build();

        HttpResponse<String> response =
                client.send(postRequest, HttpResponse.BodyHandlers.ofString());

        // Parse the JSON response using Jackson
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(response.body());
        String baseCode = jsonNode.get("base_code").asText();

        JsonNode conversionRates = jsonNode.get("rates");


//      System.out.println(baseCode);
//      System.out.println(USDExchangeRate);

      System.out.println( YELLOW + welcomeText + RESET);

      Scanner sc = new Scanner(System.in);

      String currencyToConvertFrom = sc.nextLine();
      System.out.println(RED + currencyToConvertFrom);
      System.out.println( GREEN + welcomeText1);

      String currencyToConvertTo = sc.nextLine();
      System.out.println(RED + currencyToConvertTo);
      System.out.println( GREEN + AmmountText);

      double AmountToConvertTo = sc.nextDouble();
      System.out.println(STR."\{RED}$\{AmountToConvertTo}");

      double amountForCurrencyConverter = conversionRates.get(currencyToConvertTo).asDouble() * AmountToConvertTo;

      System.out.println(STR."$\{AmountToConvertTo}\{currencyToConvertFrom}is equal to $\{amountForCurrencyConverter}\{currencyToConvertTo}");

//      System.out.println("$1 AUD is Equal To " + "$" + conversionRates.get(currencyToConvertTo) +  currencyToConvertTo);

    }
}
