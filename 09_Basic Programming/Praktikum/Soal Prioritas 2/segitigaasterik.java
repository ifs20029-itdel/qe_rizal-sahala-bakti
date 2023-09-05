import java.util.Scanner;

public class    segitigaasterik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris segitiga: ");
        int n = input.nextInt();
        
        // Loop untuk mencetak segitiga asterisk
        for (int i = 0; i < n; i++) {
            // Mencetak spasi sebelum asterisk
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            
            // Mencetak asterisk
            for (int k = -1; k < i; k++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
        
        input.close();
    }
}
