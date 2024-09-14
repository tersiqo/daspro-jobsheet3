import java.util.Scanner;  // Mengimpor kelas Scanner untuk mengambil input dari pengguna.
/**
* Gaji22
 */
public class Gaji22 {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  // Membuat objek Scanner bernama sc untuk menangani input dari pengguna0

        double totalJamKerja, upahPerJam, totalGaji, totalGajiAkhir, totalPajak, totalBonus, pajak = 5/100f, bonus = 5/100f;    // Deklarasi variabel-variabel: jumlah jam kerja, upah per jam, total gaji, total gaji akhir, pajak, bonus, dan persentase pajak dan bonus.

        System.out.println("Masukkan Jumlah Jam Kerja\t: ");
        totalJamKerja = sc.nextDouble();  // Mengambil input jumlah jam kerja.
        System.out.println("Masukkan Upah Jam Kerja\t\t: ");
        upahPerJam = sc.nextDouble();  // Mengambil input upah per jam.

        totalGaji = totalJamKerja * upahPerJam;  // Menghitung total gaji dengan mengalikan jumlah jam kerja dengan upah per jam.
        totalBonus = totalGaji * bonus;  // Menghitung total bonus sebagai persentase dari total gaji.
        totalPajak = (totalGaji + totalBonus) *pajak;  // Menghitung total pajak sebagai persentase dari total gaji + bonus.
        totalGajiAkhir = totalGaji + totalBonus - totalPajak;  // Menghitung gaji akhir dengan menambahkan gaji dan bonus, lalu mengurangi pajak.

        System.out.printf("\nOutput:\n\nTotal Jam Kerja\t\t\t: %.2f\nUpah Per Jam\t\t\t: Rp.%.2f\nBonus\t\t\t\t: 10%%\nPajak\t\t\t\t: 5%%\nTotal Gaji\t\t\t: Rp.%.2f\nTotal Bonus\t\t\t: Rp.%.2f\nTotal Gaji + Bonus\t\t: Rp.%.2f\nTotal Pajak\t\t\t: Rp.%.2f\nTotal Gaji Akhir\t\t: Rp.%.2f",
        totalJamKerja, upahPerJam, totalGaji, totalBonus, (totalGaji + totalBonus), totalPajak, totalGajiAkhir);  // Menampilkan semua hasil perhitungan dalam format tabel.
    }

    
}
    