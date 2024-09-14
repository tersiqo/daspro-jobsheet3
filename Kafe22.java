import java.util.Scanner;  // Mengimpor kelas Scanner untuk menangani input dari pengguna.
/**A
 * Kafe22
 */
public class Kafe22 {  // Mendefinisikan kelas Kafe22.

    
    
    public static void main(String[] args) {  // main tempat program dimulai eksekusi.
        Scanner input = new Scanner(System.in);  // Membuat objek Scanner bernama input untuk menerima input dari pengguna
        boolean keanggotaan;  // untuk menyimpan status keanggotaan pelanggan (true/false).
        int jmlKopi, jmlTeh, jmlRoti;  // Menyimpan jumlah item kopi, teh, dan roti yang dibeli.
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;  // Menyimpan harga masing-masing item.
        float diskon = 10 /100;  // Menyimpan diskon dalam bentuk persentase.
        double totalHarga, nominalBayar;  // Menyimpan total harga dan nominal yang harus dibayar.
        
        System.out.println("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();  // Mengambil input boolean (true/false) untuk keanggotaan pelanggan.
        System.out.println("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();  // Mengambil input berupa jumlah pembelian untuk masing-masing item (kopi).
        System.out.println("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();  // Mengambil input berupa jumlah pembelian untuk masing-masing item (teh).
        System.out.println("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt(); // Mengambil input berupa jumlah pembelian untuk masing-masing item (roti).
        
        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);  // Menghitung total harga dari semua item yang dibeli.
        nominalBayar = totalHarga - (diskon * totalHarga);  // Menghitung nominal yang harus dibayar setelah diskon.
        

        int nominalInt = (int) nominalBayar;  // Mengubah nominalBayar dari double menjadi int.
        byte totalByte = (byte) totalHarga;   //  Mengubah totalHarga dari double menjadi byte.
        
        System.out.println("Keanggotaan pelanggan " + keanggotaan);  // Mencetak status keanggotaan pelanggan.
        System.out.println("Item pembelian " + jmlKopi + "Kopi, " + jmlTeh + "Teh, " + jmlRoti + "Roti, ");  // Mencetak jumlah pembelian untuk masing-masing item.
        System.out.println("Nominal bayar Rp " + nominalBayar);  // Mencetak nominal yang harus dibayar setelah diskon.
        System.out.println("Nominal bayar (dalam int): Rp " + nominalInt);  // Mencetak nominal bayar dalam tipe int.
        System.out.println("Total harga (dalam byte): " + totalByte);  // Mencetak total harga dalam tipe byte.

       }
    }