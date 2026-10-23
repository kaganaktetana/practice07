
package semester1.practice07;

public class Task_30 {
    public static void main(String[] args) {
        System.out.println(StringUtils.isPalindrome("А роза упала на лапу Азора"));
        System.out.println(StringUtils.isPalindrome("Java"));

        System.out.println(StringUtils.reverse("Привіт"));

        System.out.println("Голосних: "
                + StringUtils.countVowels("Програмування"));

        System.out.println(StringUtils.maskCardNumber("1234 5678 9012 3456"));
    }
}

class StringUtils {
    private StringUtils() {
    }

    public static boolean isPalindrome(String s) {
        String text = s.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static int countVowels(String s) {
        int count = 0;
        String vowels = "аеєиіїоуюяaeiou";

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (vowels.indexOf(ch) >= 0) {
                count++;
            }
        }

        return count;
    }

    public static String maskCardNumber(String cardNumber) {
        String digits = cardNumber.replaceAll("\\D", "");

        if (digits.length() <= 4) {
            return digits;
        }

        String lastFour = digits.substring(digits.length() - 4);
        return "**** **** **** " + lastFour;
    }
}
