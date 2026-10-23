
package semester1.practice07;

public class Task_28 {
    public static void main(String[] args) {
        System.out.printf("1000 грн = %.2f USD%n",
                CurrencyExchange.uahToUsd(1000));

        System.out.printf("100 USD = %.2f грн%n",
                CurrencyExchange.usdToUah(100));

        System.out.printf("100 EUR = %.2f грн%n",
                CurrencyExchange.eurToUah(100));

        System.out.println("\nОновлюємо курси...");
        CurrencyExchange.updateRates(42.0, 46.0);

        System.out.printf("1000 грн = %.2f USD%n",
                CurrencyExchange.uahToUsd(1000));

        System.out.printf("100 USD = %.2f грн%n",
                CurrencyExchange.usdToUah(100));
    }
}

class CurrencyExchange {
    private static double usdToUahRate = 41.5;
    private static double eurToUahRate = 45.2;

    public static void updateRates(double newUsd, double newEur) {
        if (newUsd > 0) {
            usdToUahRate = newUsd;
        }

        if (newEur > 0) {
            eurToUahRate = newEur;
        }
    }

    public static double uahToUsd(double uah) {
        return uah / usdToUahRate;
    }

    public static double usdToUah(double usd) {
        return usd * usdToUahRate;
    }

    public static double eurToUah(double eur) {
        return eur * eurToUahRate;
    }
}
