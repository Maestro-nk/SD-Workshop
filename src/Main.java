import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("Torgoniy B. V.");
        int[][] A = new int[3][3];
        int[] D = new int[3];
        Random random = new Random();

        System.out.println("Array D:");
        for (int i = 0; i < D.length; i++) {
            D[i] = random.nextInt(10);
            System.out.print(D[i] + "\t");
        }
        System.out.println("\n");

        System.out.println("Initial matrix A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = random.nextInt(10);
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < D.length; i++){
            A[1][i]=D[i];
        }

        System.out.println("Matrix A after transformation:");
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + "\t");
                sum += A[i][j];
            }
            System.out.println();
        }

        System.out.println("\nThe sum of the elements of matrix A after transformation: " + sum);
    }
}