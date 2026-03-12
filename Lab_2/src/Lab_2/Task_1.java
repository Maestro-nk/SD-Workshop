package Lab_2;

import java.util.Random;
public class Task_1 {
    public static void main(String[] args) {
        Random random = new Random();

        int num4 = random.nextInt(9000) + 1000;
        int num5 = random.nextInt(90000) + 10000;

        String str4 = String.valueOf(num4);
        String str5 = String.valueOf(num5);

        System.out.println(str4);
        System.out.println(str5);

        int sum4 = 0;
        for( int i=0; i<str4.length();i++){
            char c = str4.charAt(i);
            int digit = Character.getNumericValue(c);
            sum4+=digit;
        }

        int sum5=0;
        for( int i=0; i<str5.length();i++){
            char c = str5.charAt(i);
            int digit = Character.getNumericValue(c);
            sum5+=digit;
        }

        System.out.println("Sum of digits in a 4-digit number: " + sum4);
        System.out.println("Sum of digits in a 5-digit number: " + sum5);
        System.out.println("Difference in amounts: " + (sum5 - sum4)); // или sum4 - sum5, смотря что из чего хочешь вычесть
    }

}