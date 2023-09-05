import java.util.Scanner;

public class drawXYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();

        int[][] matrix = new int[height][height];

        int currentValue = 1;
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < height; col++) {
                matrix[row][col] = currentValue++;
            }
        }

        System.out.println("Generated Matrix:");
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < height; col++) {
                if (matrix[row][col] % 2 == 0) {

                    if (matrix[row][col] % 3 == 0) {
                        System.out.print("X" + "\t");
                    } else {
                        System.out.print("Z" + "\t");
                    }
                } else {
                    if (matrix[row][col] % 3 == 0) {
                        System.out.print("X" + "\t");
                    } else {
                        System.out.print("Y" + "\t");
                    }
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}