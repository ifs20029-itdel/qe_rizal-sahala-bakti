public class Calculator {
    // Fungsi penjumlahan
    public static int add(int a, int b) {
        return a + b;
    }

    // Fungsi pengurangan
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Fungsi perkalian
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Fungsi pembagian
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Pembagian oleh nol tidak diizinkan");
            return 0;
        } else {
            return (double) a / b;
        }
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;

        // Operasi penjumlahan
        int resultAdd = add(num1, num2);
        System.out.println("Penjumlahan: " + resultAdd);

        // Operasi pengurangan
        int resultSubtract = subtract(15, 4);
        System.out.println("Pengurangan: " + resultSubtract);

        // Operasi perkalian
        int resultMultiply = multiply(10, 10);
        System.out.println("Perkalian: " + resultMultiply);

        // Operasi pembagian
        double resultDivide = divide(12, 3);
        System.out.println("Pembagian: " + resultDivide);
    }
}
