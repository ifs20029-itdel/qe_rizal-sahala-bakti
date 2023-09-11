public class Product {
    private String nama;
    private String deskripsi;
    private int harga;
    private int stok;

    public Product(String nama, String deskripsi, int harga, int stok) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.stok = stok;
    }

    // Method setter untuk mengatur nilai atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method getter untuk mendapatkan nilai atribut nama
    public String getNama() {
        return nama;
    }

    // Method setter untuk mengatur nilai atribut deskripsi
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    // Method getter untuk mendapatkan nilai atribut deskripsi
    public String getDeskripsi() {
        return deskripsi;
    }

    // Method setter untuk mengatur nilai atribut harga
    public void setHarga(int harga) {
        this.harga = harga;
    }

    // Method getter untuk mendapatkan nilai atribut harga
    public double getHarga() {
        return harga;
    }

    // Method setter untuk mengatur nilai atribut stok
    public void setStok(int stok) {
        this.stok = stok;
    }

    // Method getter untuk mendapatkan nilai atribut stok
    public int getStok() {
        return stok;
    }

    // Method getInfo() untuk menampilkan informasi mengenai data produk
    public void getInfo() { 
        System.out.println("======");
        System.out.println("INFO PRODUK");
        System.out.println("Nama : " + nama);
        System.out.println("Deskripsi: " + deskripsi);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Stok: " + stok);
        System.out.println("======");
    }

    public static void main(String[] args) {
        Product product = new Product("Produk Coffee", "This is Coffee", 15000, 10);
        product.getInfo();
    }
}
