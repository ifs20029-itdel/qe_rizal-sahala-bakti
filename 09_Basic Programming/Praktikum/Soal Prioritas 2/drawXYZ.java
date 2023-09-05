/*Buatlah sebuah function dengan nama drawXYZ yang menjalankan proses dengan menggunakan looping 
dan menerima satu parameter bernama height. 
Buatlah sebuah pola kemunculan simbol X, Y, dan Z di print, 
dimana Y mewakili kelipatan ganjil, Z mewakili kelipatan genap dan X khusus urutan kelipatan 3. */

import java.util.Scanner;
public class drawXYZ {
    public static void main(int height) {
        for (int i = 1; i < height; i++) {
            for (int j = 1; j <= height; j++) {
                if (j % 3 == 0) {
                    System.out.print("X");
                } else if (j % 2 == 1) {
                    System.out.print("Y");
                } else {
                    System.out.print("Z");
                }
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        int height = scanner.nextInt();

        main(height);

        scanner.close();
    }
}