
package semester1.practice07;

import java.util.Arrays;

public class Task_24 {
    public static void main(String[] args) {
        ArrayFilter filter = new ArrayFilter();

        int[] numbers = {12, 5, 8, 19, 24, 3, 16};

        System.out.println("Більші за 10: "
                + Arrays.toString(filter.filter(numbers, 10)));

        System.out.println("Від 8 до 19: "
                + Arrays.toString(filter.filter(numbers, 8, 19)));

        System.out.println("Парні: "
                + Arrays.toString(filter.filter(numbers, true)));

        System.out.println("Непарні: "
                + Arrays.toString(filter.filter(numbers, false)));
    }
}

class ArrayFilter {
    public int[] filter(int[] arr, int threshold) {
        int count = 0;

        for (int number : arr) {
            if (number > threshold) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int number : arr) {
            if (number > threshold) {
                result[index++] = number;
            }
        }

        return result;
    }

    public int[] filter(int[] arr, int min, int max) {
        int count = 0;

        for (int number : arr) {
            if (number >= min && number <= max) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int number : arr) {
            if (number >= min && number <= max) {
                result[index++] = number;
            }
        }

        return result;
    }

    public int[] filter(int[] arr, boolean keepEvens) {
        int count = 0;

        for (int number : arr) {
            if ((number % 2 == 0) == keepEvens) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int number : arr) {
            if ((number % 2 == 0) == keepEvens) {
                result[index++] = number;
            }
        }

        return result;
    }
}