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
    static final String welcomeText = ("--------------------------------------------------------------\n" +
            "Welcome to The Currency Converter\n " +
            "where Currency Exchange Rates are updated every 20 mins\n" +
            " which provides you with the best value for money.");

    public static void main(String[] args) throws Exception {

        //Http Client Definition!
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(new URI("https://open.er-api.com/v6/latest/AUD"))
                .header("Authorization", "API-KEY")
                .build();

        HttpResponse<String> response =
                client.send(postRequest, HttpResponse.BodyHandlers.ofString());

        // Parse the JSON response using Jackson
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(response.body());
        String baseCode = jsonNode.get("base_code").asText();

        JsonNode conversionRates = jsonNode.get("rates");
        double USDExcahngeRate = conversionRates.get("USD").asDouble();


//      System.out.println(baseCode);
      System.out.println(USDExcahngeRate);

      System.out.println(welcomeText);

      Scanner sc = new Scanner(System.in);

      String currencyToConvert = sc.nextLine();

      System.out.println("$1 AUD is Equal To " + "$" + conversionRates.get(currencyToConvert));

    }
}
