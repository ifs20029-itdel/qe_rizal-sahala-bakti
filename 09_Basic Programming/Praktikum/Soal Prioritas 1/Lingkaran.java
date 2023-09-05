import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();

        // Menggunakan nilai phi sebagai 3.14
        double phi = 3.14;

        // Menghitung luas lingkaran
        double luas = phi * jariJari * jariJari;

        // Menampilkan hasil
        System.out.println("Luas lingkaran: " + luas);

        input.close();
    }
}
