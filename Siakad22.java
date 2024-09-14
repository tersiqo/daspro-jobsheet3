import java.util.Scanner; //Mengimpor kelas Scanner dari pustaka java.util.

import java.util.Scanner;

/**
 * Siakad22
 */
public class Siakad22 { //Mendefinisikan kelas Siakad22.

    public static void main(String[] args) {  //main adalah tempat utama dimana eksekusi program dimulai. 
        Scanner sc = new Scanner(System.in);  //Membuat objek Scanner untuk menangani input dari pengguna melalui keyboard.
        String nama, nim;  // Menyimpan input berupa nama dan NIM yang diambil dari pengguna.
        char kelas;  // Menyimpan satu karakter untuk menyimpan informasi kelas (misal: 'A', 'B').
        byte absen;  // Menyimpan input nomor absen (menggunakan tipe data byte untuk angka kecil).
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiUTS, nilaiUAS, nilaiAkhir;  //menyimpan nilai yang dimasukkan pengguna dengan tipe double, yang mendukung angka desimal.
        
        System.out.println("Masukkan nama\t\t: ");
        nama = sc.nextLine();  //Mengambil input dari pengguna berupa teks (string).
        System.out.println("Masukkan NIM\t\t: ");
        nim = sc.nextLine();  //Mengambil input dari pengguna berupa teks (string).
        System.out.println("Masukkan kelas\t\t: ");
        kelas = sc.nextLine().charAt(0);  //Mengambil input dari pengguna berupa teks (string). charat(0) mengambil karakter pertama yang diinput.
        System.out.println("Masukkan nomor absen\t: ");
        absen = sc.nextByte();  //Mengambil input berupa byte (angka kecil).
        System.out.println("Masukkan nilai kuis\t: ");
        nilaiKuis = sc.nextDouble();  // Mengambil input berupa angka desimal (double).
        System.out.println("Masukkan nilai tugas\t: ");
        nilaiTugas = sc.nextDouble();  // Mengambil input berupa angka desimal (double).
        System.out.println("Masukkan nilai ujian\t: ");
        nilaiUjian = sc.nextDouble();  //  Mengambil input berupa angka desimal (double).
        System.out.println("Masukkan nilai UTS\t: ");
        nilaiUTS = sc.nextDouble();  //  Mengambil input berupa angka desimal (double).
        System.out.println("Masukkan nilai UAS\t: ");
        nilaiUAS = sc.nextDouble();  //  Mengambil input berupa angka desimal (double).
        System.out.println("Masukkan nilai akhir\t: ");
        nilaiAkhir = sc.nextDouble();  //  Mengambil input berupa angka desimal (double).
       
        nilaiAkhir = (nilaiKuis / 100 * 20) + (nilaiTugas / 100 * 15) + (nilaiUTS / 100 * 30) + (nilaiUAS / 100 * 35);  //  digunakan untuk menghitung nilai akhir mahasiswa berdasarkan bobot kuis, tugas, UTS, dan UAS.
       
        System.out.printf("Output:\nNAma\t: %s\nNIM\t: %s\nKelas\t: %s\nAbsen\t: %s\nNilai Akhir\t: %s", nama, nim, kelas, absen, nilaiAkhir); // Mencetak hasil input dan perhitungan nilai akhir ke layar dengan format yang teratur. %s digunakan untuk menampilkan string dan %f untuk angka desimal.                                                                                                                                                                                                                                                                                                                                                                                  
        
       
    }
}