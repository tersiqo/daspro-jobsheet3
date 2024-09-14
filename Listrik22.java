import java.util.Scanner;
/**
  * Listrik22
  */
 public class Listrik22 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Membuat objek Scanner untuk mengambil input dari pengguna.

        int hargaListrik = 1500, jmlListrik, totalHargaListrik;  // Deklarasi variabel harga listrik per kWh, jumlah listrik yang digunakan, dan total harga listrik.
        boolean statusListrik;  // Deklarasi variabel boolean untuk menentukan apakah penggunaan listrik lebih dari 500 kWh.

        System.out.println("Masukkan Jumlah Listrik (kwh)\t\t: ");  
        jmlListrik = sc.nextInt();  // Mengambil input jumlah listrik yang digunakan dari pengguna.

        statusListrik = jmlListrik > 500;  // Mengecek apakah jumlah listrik lebih dari 500 kWh (hasilnya true atau false).

        totalHargaListrik = jmlListrik * hargaListrik;  // Menghitung total harga listrik berdasarkan jumlah kWh dan harga per kWh.

        System.out.printf("\nOutput:\n\nApakah Listrik Melebihi 500 kWh?\t: %s\nJumlah Listrik\t\t\t\t: %s\nHarga Listrik (kWh)\t\t\t: %s\nTotal Bayar Listrik\t\t\t: %s", statusListrik, jmlListrik, hargaListrik, totalHargaListrik);    // Menampilkan hasil berupa apakah listrik melebihi 500 kWh, jumlah listrik, harga per kWh, dan total bayar listrik.
    }
 }