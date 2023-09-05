import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();

        double luas = panjang * lebar;

        System.out.println("Luas persegi panjang: " + luas);

        input.close();
    }
}
