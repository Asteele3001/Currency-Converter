import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class currencyConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello. Welcome to Currency Converter X");
        System.out.println("What currency would you like to start with? Please type the corresponding number:");
        System.out.println("1: U.S. Dollar");
        System.out.println("2: Euro");
        System.out.println("3: Japanese Yen");
        System.out.println("4: British Pound (Sterling)");

        String value = input.nextLine();

        while (!Objects.equals(value, "1") && !Objects.equals(value, "2") && !Objects.equals(value, "3") && !Objects.equals(value, "4")) {
            System.out.println("That is not a valid option. Please try again.");
            System.out.println("What currency would you like to start with? Please type the corresponding number:");
            System.out.println("1: U.S. Dollar");
            System.out.println("2: Euro");
            System.out.println("3: Japanese Yen");
            System.out.println("4: British Pound (Sterling)");

            value = input.nextLine();
        }

        int startingCurrency = Integer.parseInt(value);

        if (startingCurrency == 1) {
            System.out.println("Okay! And what would you like to convert Dollars to?");
            System.out.println("2: Euro");
            System.out.println("3: Japanese Yen");
            System.out.println("4: British Pound (sterling)");

        } else if (startingCurrency == 2) {
            System.out.println("Okay! And what would you like to convert Euros to?");
            System.out.println("1: U.S. Dollar");
            System.out.println("3: Japanese Yen");
            System.out.println("4: British Pound (Sterling)");

        } else if (startingCurrency == 3) {
            System.out.println("Okay! And what would you like to convert Yen to?");
            System.out.println("1: U.S. Dollar");
            System.out.println("2: Euro");
            System.out.println("4: British Pound (Sterling)");

        } else {
            System.out.println("Okay! And what would you like to convert Pounds to?");
            System.out.println("1: U.S. Dollar");
            System.out.println("2: Euro");
            System.out.println("3: Japanese Yen");
        }

        value = input.nextLine();

        while (startingCurrency == 1 && !Objects.equals(value, "2") && !Objects.equals(value, "3") && !Objects.equals(value, "4")) {
            System.out.println("That is not a valid option. Please try again.");
            System.out.println("What would you like to convert Dollars to?");
            System.out.println("2: Euro");
            System.out.println("3: Japanese Yen");
            System.out.println("4: British Pound (Sterling)");

            value = input.nextLine();
        }

        while (startingCurrency == 2 && !Objects.equals(value, "1") && !Objects.equals(value, "3") && !Objects.equals(value, "4")) {
            System.out.println("That is not a valid option. Please try again.");
            System.out.println("What would you like to convert Euros to?");
            System.out.println("1: U.S. Dollar");
            System.out.println("3: Japanese Yen");
            System.out.println("4: British Pound (Sterling)");

            value = input.nextLine();
        }

        while (startingCurrency == 3 && !Objects.equals(value, "1") && !Objects.equals(value, "2") && !Objects.equals(value, "4")) {
            System.out.println("That is not a valid option. Please try again.");
            System.out.println("What would you like to convert Yen to?");
            System.out.println("1: U.S. Dollar");
            System.out.println("2: Euro");
            System.out.println("4: British Pound (Sterling)");

            value = input.nextLine();
        }

        while (startingCurrency == 4 && !Objects.equals(value, "1") && !Objects.equals(value, "2") && !Objects.equals(value, "3")) {
            System.out.println("That is not a valid option. Please try again.");
            System.out.println("What would you like to convert Pounds to?");
            System.out.println("1: U.S. Dollar");
            System.out.println("2: Euro");
            System.out.println("3: Japanese Yen1");

            value = input.nextLine();
        }

        int endingCurrency = Integer.parseInt(value);

        if (startingCurrency == 1) {

            if (endingCurrency == 2) {
                System.out.println("Great! You want to convert Dollars to Euros");
            } else if (endingCurrency == 3) {
                System.out.println("Great! You want to convert Dollars to Yen");
            } else if (endingCurrency == 4) {
                System.out.println("Great! You want to convert Dollars to Pounds");
            }
        } else if (startingCurrency == 2) {
            if (endingCurrency == 1) {
                System.out.println("Great! You want to convert Euros to Dollars");
            } else if (endingCurrency == 3) {
                System.out.println("Great! You want to convert Euros to Yen");
            } else if (endingCurrency == 4) {
                System.out.println("Great! You want to convert Euros to Pounds");
            }
        } else if (startingCurrency == 3) {
            if (endingCurrency == 1) {
                System.out.println("Great! You want to convert Yen to Dollars");
            } else if (endingCurrency == 2) {
                System.out.println("Great! You want to convert Yen to Euros");
            } else if (endingCurrency == 4) {
                System.out.println("Great! You want to convert Yen to Pounds");
            }
        } else if (startingCurrency == 4) {

            if (endingCurrency == 1) {
                System.out.println("Great! You want to convert Pounds to Dollars");
            } else if (endingCurrency == 2) {
                System.out.println("Great! You want to convert Pounds to Euros");
            } else if (endingCurrency == 3) {
                System.out.println("Great! You want to convert Pounds to Yen");
            }
        }

        Double currencyAmount = null;

        while (currencyAmount == null) {
            System.out.println("Please enter an amount you wish to convert: ");
            value = input.nextLine();

            try {
                currencyAmount = Double.parseDouble(value);
            } catch (NumberFormatException e) {
                System.out.println("That is not a valid option. Please try again:");
                System.out.println("Please enter an amount you wish to convert: ");
                value = input.nextLine();
            }
        }

        final DecimalFormat df = new DecimalFormat("0.00");

        if (startingCurrency == 1) {

            if (endingCurrency == 2) {
                double dollarsToEuros = (currencyAmount * 0.91);
                System.out.println("$" + df.format(currencyAmount) + " is €" + df.format(dollarsToEuros));

            } else if (endingCurrency == 3) {
                double dollarsToYen = (currencyAmount * 144.63501732);
                System.out.println("$" + df.format(currencyAmount) + " is ¥" + df.format(dollarsToYen));

            } else if (endingCurrency == 4) {
                double dollarsToPounds = (currencyAmount * 0.785855);
                System.out.println("$" + df.format(currencyAmount) + " is £" + df.format(dollarsToPounds));
            }
        } else if (startingCurrency == 2) {

            if (endingCurrency == 1) {
                double eurosToDollars = (currencyAmount * 1.09547);
                System.out.println("€" + df.format(currencyAmount) + " is $" + df.format(eurosToDollars));

            } else if (endingCurrency == 3) {
                double eurosToYen = (currencyAmount * 158.44335577);
                System.out.println("€" + df.format(currencyAmount) + " is ¥" + df.format(eurosToYen));

            } else if (endingCurrency == 4) {
                double eurosToPounds = (currencyAmount * 1.15);
                System.out.println("€" + df.format(currencyAmount) + " is £" + df.format(eurosToPounds));
            }
        } else if (startingCurrency == 3) {

            if (endingCurrency == 1) {
                double yenToDollars = (currencyAmount * 0.006914);
                System.out.println("¥" + df.format(currencyAmount) + " is $" + df.format(yenToDollars));

            } else if (endingCurrency == 2) {
                double yenToEuros = (currencyAmount * 0.006311);
                System.out.println("¥" + df.format(currencyAmount) + " is €" + df.format(yenToEuros));

            } else if (endingCurrency == 4) {
                double yenToPounds = (currencyAmount * 0.005433);
                System.out.println("¥" + df.format(currencyAmount) + " is £" + df.format(yenToPounds));
            }
        } else if (startingCurrency == 4) {

            if (endingCurrency == 1) {
                double poundsToDollars = (currencyAmount * 1.36);
                System.out.println("£" + df.format(currencyAmount) + " is $" + df.format(poundsToDollars));

            } else if (endingCurrency == 2) {
                double poundsToEuros = (currencyAmount * 1.116);
                System.out.println("£" + df.format(currencyAmount) + " is €" + df.format(poundsToEuros));

            } else if (endingCurrency == 3) {
                double poundsToYen = (currencyAmount * 184.05);
                System.out.println("£" + df.format(currencyAmount) + " is ¥" + df.format(poundsToYen));
            }
        }
    }
}


