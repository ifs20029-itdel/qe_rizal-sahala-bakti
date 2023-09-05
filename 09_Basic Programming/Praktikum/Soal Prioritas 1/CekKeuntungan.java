import java.util.Scanner;

public class CekKeuntungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input harga beli dan harga jual
        System.out.print("harga beli: ");
        int hargaBeli = input.nextInt();

        System.out.print("harga jual: ");
        int hargaJual = input.nextInt();

        // Menghitung keuntungan atau kerugian
        int keuntungan = hargaJual - hargaBeli;

        // Menampilkan hasil
        if (keuntungan > 0) {
            System.out.println("untung sebesar: " + keuntungan);
        } else if (keuntungan < 0) {
            System.out.println("rugi sebesar: " + "-" + Math.abs(keuntungan));
        } else {
            System.out.println("Sama saja.");
        }

        input.close();
    }
}
