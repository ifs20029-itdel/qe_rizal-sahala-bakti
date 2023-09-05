import java.util.Scanner;

public class EnkripsiSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Input: ");
        String teks = input.nextLine();
        
        String teksTerenkripsi = enkripsi(teks);
        
        System.out.println("Teks Output: " + teksTerenkripsi);
        
        input.close();
    }
    
    public static String enkripsi(String teks) {
        StringBuilder hasil = new StringBuilder();
        
        for (int i = 0; i < teks.length(); i++) {
            char karakter = teks.charAt(i);
            
            if (Character.isLetter(karakter)) {
                char batasAtas = Character.isUpperCase(karakter) ? 'Z' : 'z';
                int pergeseran = 10; // Pergeseran 10 urutan alphabet
                
                char terenkripsi = (char) (karakter + pergeseran);
                
                if (terenkripsi > batasAtas) {
                    terenkripsi = (char) (karakter - (26 - pergeseran));
                }
                
                hasil.append(terenkripsi);
            } else {
                hasil.append(karakter);
            }
        }
        
        return hasil.toString();
    }
}
