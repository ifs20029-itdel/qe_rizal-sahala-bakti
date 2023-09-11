import java.util.ArrayList;
import java.util.UUID;
import java.util.Scanner;

class Book {
    private UUID id;
    private String judul;
    private String penulis;
    private String kategori;

    public Book(String judul, String penulis, String kategori) {
        this.id = UUID.randomUUID();
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
    }

    public UUID getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getKategori() {
        return kategori;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               "\nJudul: " + judul +
               "\nPenulis: " + penulis +
               "\nKategori: " + kategori + "\n";
    }
}

public class BookManager {
    private ArrayList<Book> books = new ArrayList<>();

    public void createBook(String judul, String penulis, String kategori) {
        Book book = new Book(judul, penulis, kategori);
        books.add(book);
        System.out.println("Buku berhasil ditambahkan.");
    }

    public void getAllBooks() {
        if (books.isEmpty()) {
            System.out.println("Tidak ada buku yang tersedia.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void getBookById(UUID id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("Buku dengan ID " + id + " tidak ditemukan.");
    }

    public void updateBook(UUID id, String judul, String penulis, String kategori) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                book.setJudul(judul);
                book.setPenulis(penulis);
                book.setKategori(kategori);
                System.out.println("Buku berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Buku dengan ID " + id + " tidak ditemukan.");
    }

    public void deleteBook(UUID id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                books.remove(book);
                System.out.println("Buku berhasil dihapus.");
                return;
            }
        }
        System.out.println("Buku dengan ID " + id + " tidak ditemukan.");
    }

    // Menambahkan metode untuk memperbarui buku berdasarkan judul
    public void updateBookByJudul(String judulToUpdate, String newJudul, String newPenulis, String newKategori) {
        for (Book book : books) {
            if (book.getJudul().equalsIgnoreCase(judulToUpdate)) {
                book.setJudul(newJudul);
                book.setPenulis(newPenulis);
                book.setKategori(newKategori);
                System.out.println("Buku berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Buku dengan judul '" + judulToUpdate + "' tidak ditemukan.");
    }

    // Menambahkan metode untuk menghapus buku berdasarkan judul
    public void deleteBookByJudul(String judulToDelete) {
        for (Book book : books) {
            if (book.getJudul().equalsIgnoreCase(judulToDelete)) {
                books.remove(book);
                System.out.println("Buku berhasil dihapus.");
                return;
            }
        }
        System.out.println("Buku dengan judul '" + judulToDelete + "' tidak ditemukan.");
    }

    public static void main(String[] args) {
        BookManager manager = new BookManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Semua Buku");
            System.out.println("3. Lihat Buku berdasarkan ID");
            System.out.println("4. Perbarui Buku");
            System.out.println("5. Hapus Buku");
            System.out.println("6. Keluar");

            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character

            switch (choice) {
                case 1:
                    System.out.print("Masukkan judul: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan penulis: ");
                    String penulis = scanner.nextLine();
                    System.out.print("Masukkan kategori: ");
                    String kategori = scanner.nextLine();
                    manager.createBook(judul, penulis, kategori);
                    break;
                case 2:
                    manager.getAllBooks();
                    break;
                case 3:
                    System.out.print("Masukkan ID buku: ");
                    UUID bookId = UUID.fromString(scanner.nextLine());
                    manager.getBookById(bookId);
                    break;
                case 4:
                    System.out.print("Masukkan judul buku yang ingin diperbarui: ");
                    String judulToUpdate = scanner.nextLine();
                    System.out.print("Masukkan judul baru: ");
                    String newJudul = scanner.nextLine();
                    System.out.print("Masukkan penulis baru: ");
                    String newPenulis = scanner.nextLine();
                    System.out.print("Masukkan kategori baru: ");
                    String newKategori = scanner.nextLine();
                    manager.updateBookByJudul(judulToUpdate, newJudul, newPenulis, newKategori);
                    break;
                case 5:
                    System.out.print("Masukkan judul buku yang ingin dihapus: ");
                    String judulToDelete = scanner.nextLine();
                    manager.deleteBookByJudul(judulToDelete);
                    break;
                case 6:
                    scanner.close();
                    System.out.print("bye....");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
