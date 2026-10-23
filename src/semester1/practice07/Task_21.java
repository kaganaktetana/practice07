
package semester1.practice07;

import java.util.Arrays;

public class Task_21 {
    public static void main(String[] args) {
        ArraySearcher searcher = new ArraySearcher();

        int[] numbers = {10, 20, 30, 20, 40};

        System.out.println(searcher.find(numbers, 20));
        System.out.println(searcher.find(numbers, 20, 2));
        System.out.println(searcher.find(numbers, 50));

        String[] words = {"Java", "Python", "java", "C++"};

        System.out.println(searcher.find(words, "Java"));
        System.out.println(searcher.find(words, "JAVA", true));
        System.out.println(searcher.find(words, "Ruby"));
    }
}

class ArraySearcher {
    public int find(int[] arr, int target) {
        return find(arr, target, 0);
    }

    public int find(int[] arr, int target, int startIndex) {
        for (int i = Math.max(0, startIndex); i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int find(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == null ? arr[i] == null : target.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    public int find(String[] arr, String target, boolean ignoreCase) {
        if (!ignoreCase) {
            return find(arr, target);
        }

        for (int i = 0; i < arr.length; i++) {
            if (target == null ? arr[i] == null
                    : arr[i] != null && target.equalsIgnoreCase(arr[i])) {
                return i;
            }
        }
        return -1;
    }
}