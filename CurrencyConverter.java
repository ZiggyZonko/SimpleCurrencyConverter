import java.util.Scanner;

public class CurrencyConverter {

    public CurrencyConverter() {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------------\n" +
                "This is a Currency Converter from $AUD to Another Currency On This List.\n" +
                " USD\n" +
                " Euro\n" +
                " GBP\n" +
//                " and Bitcoin\n" +
                "Please choose a Currency to Convert to\n" +
                "Currency: ");
        String CurrencyToConvert = sc.nextLine();

        switch (CurrencyToConvert) {
            case "USD":
            case "usd":
            case "Usd": {
                System.out.println("Please Enter an amount of Money you would like to see in USD\n $");

                double CurrencyAmount = sc.nextDouble();

                if (CurrencyAmount == CurrencyAmount) {
                    System.out.println("Transferring Now!");
                    System.out.println("|=           |\r |==          |\r |===         |\r |====       |\r |======       |\r |=======     |\r |========    |\r |=========   |\r |==========  |\r |===========|");
                    System.out.println("Done!");

                    System.out.println("$" + CurrencyAmount + " AUD is the same as " + "$" + CurrencyAmount * 0.78 + "USD");

                    System.out.println("----------------------------------------\n");
                } else {
                    System.out.println("Sorry that is not a valid amount of Currency. Please Try again Later.");
                    System.out.println("----------------------------------------\n");
                    return;
                }
                break;
            }
            case "Euro":
            case "euro":
            case "EUR":
            case "Eur": {
                System.out.println("Please Enter an amount of Money you would like to see in Euros\n $");

                double CurrencyAmount = sc.nextDouble();

                if (CurrencyAmount == CurrencyAmount) {
                    System.out.println("Transferring Now!");
                    System.out.println("|=           |\r |==          |\r |===         |\r |====       |\r |======       |\r |=======     |\r |========    |\r |=========   |\r |==========  |\r |===========|");
                    System.out.println("Done!");

                    System.out.println("$" + CurrencyAmount + " AUD is the same as " + "$" + CurrencyAmount * 0.61 + "Euros");

                    System.out.println("----------------------------------------\n");
                } else {
                    System.out.println("Sorry that is not a valid amount of Currency. Please Try again Later.");
                    System.out.println("----------------------------------------\n");
                    return;
                }
                break;
            }
            case "GBP":
            case "Gbp":
            case "GbP": {
                System.out.println("Please Enter an amount of Money you would like to see in GBP\n $");

                double CurrencyAmount = sc.nextDouble();

                if (CurrencyAmount == CurrencyAmount) {
                    System.out.println("Transferring Now!");
                    System.out.println("|=           |\r |==          |\r |===         |\r |====       |\r |======       |\r |=======     |\r |========    |\r |=========   |\r |==========  |\r |===========|");
                    System.out.println("Done!");

                    System.out.println("$" + CurrencyAmount + " AUD is the same as " + "$" + CurrencyAmount * 0.52 + "Pound Sterling");

                    System.out.println("----------------------------------------\n");
                } else {
                    System.out.println("Sorry that is not a valid amount of Currency. Please Try again Later.");
                    System.out.println("----------------------------------------\n");
                    return;
                }
                break;
            }
//
//        else if (CurrencyToConvert.equals("Bitcoin") || CurrencyToConvert.equals("bitcoin") || CurrencyToConvert.equals("BTC") || CurrencyToConvert.equals("btc")) {
//            System.out.println("Please Enter an amount of Money you would like to see in BTC\n $");
//
//            double CurrencyAmount = sc.nextDouble();
//
//            System.out.println("Transferring Now!");
//            System.out.println("|=           |\r |==          |\r |===         |\r |====       |\r |======       |\r |=======     |\r |========    |\r |=========   |\r |==========  |\r |===========|");
//            System.out.println("Done!");
//
//            System.out.println("$" + CurrencyAmount + " AUD is the same as " + "$" + CurrencyAmount * 0.000010 + "BTC");
//
//            System.out.println("----------------------------------------\n");
//        }
            default:
                System.out.println("That is not a valid Currency. Please try again Next Time.");
                System.out.println("----------------------------------------\n");
        }

//        System.out.println("$" + CurrencyToConvert + " AUD is the same as " + "$" + CurrencyToConvert * 0.78 + "USD");
//        System.out.println("-----------------------------------------\n");

    }

    public static void main(String[] args) {
        new CurrencyConverter();
    }
}
