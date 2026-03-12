package Lab_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                12, 5, 8, 20, 3, 15, 7, 10, 1, 18, 4, 9, 14, 2, 6
        ));

        int value = 10;

        System.out.println("Initial list:");
        System.out.println(numbers);
        System.out.println("Target value = " + value + "\n");

        int left = 0;
        int right = numbers.size() - 1;

        while (left < right) {
            while (left < right && numbers.get(left) < value) {
                left++;
            }
            while (left < right && numbers.get(right) >= value) {
                right--;
            }
            if (left < right) {
                Collections.swap(numbers, left, right);
            }
        }

        System.out.println("Regrouped list (left < " + value + ", right >= " + value + "):");
        System.out.println(numbers);
    }
}