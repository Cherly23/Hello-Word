/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2_017;

import java.util.Scanner; // Mengimport Scanner  untuk imput dari pengguna

public class Modul2_017_2 {
    public double luas_lingkaran(int diameter) {
        int jari_jari = diameter / 2; // Mengambil jari-jari dari diametter
        double luas = Math.PI * Math.pow(jari_jari, 2); // Lumus luas lingkaran
        return luas; // Mengambilkan hasil luas
    }
    public double volume_tabung(int diameter, double tinggi) {
        int jari_jari = diameter / 2;
        double total = Math.PI * Math.pow(jari_jari, 2) * tinggi; // Rumus volume tabung
        return total;
    }
    public double volume_kerucut(int diameter, double tinggi){
        int jari_jari = diameter /2;
        double total = (Math.PI * Math.pow(jari_jari, 2) * tinggi) * tinggi / 3;
        return total;
    }
    public double volume_bola (int diameter) {
        int jari_jari = diameter / 2;
        double total = (4 * Math.PI * Math.pow(jari_jari, 3)) / 3; // Rumus volume bola 
        return total;
    }
    public static void main(String[] args) {
        Modul2_017_2 count = new Modul2_017_2(); // membuat objek dari class 
        Scanner input = new Scanner(System.in); // Scanner untuk membaca input dari user
        try {
            String status = ""; double hasil = 0; // Variabel untuk menampung status dan hasil
            System.out.println("Pilihan : \n"
                    + "1. Luas Lingkaran\n"
                    + "2. Volume Tabung\n"
                    + "3. Volume Kerucut\n"
                    + "4. Vollulme Bola\n");
        System.out.print("Masukkan Pilihan : ");
        byte pilihan = input.nextByte(); // Menyimpan pilihan user (1-4)
        
        if (pilihan == 1) {
            System.out.print("Masukkan Diameter : ");
            int diameter = input.nextInt();
            hasil = count.luas_lingkaran(diameter);
            status = "Menghitung Luas Lingkaran" ;
        } else if (pilihan == 2) {
            System.out.print("Masukkan Diameter : ");
            int diameter = input.nextInt();
            System.out.print("Masukan Tinggi    : ");
            int tinggi = input.nextInt();
            hasil = count.volume_tabung(diameter, tinggi);
            status = "Menghitung Volume Tabung";
        } else if (pilihan == 3) {
            System.out.print("Masukkan Diameter : ");
            int diameter = input.nextInt();
            System.out.print("Masukkan Tinggi   : ");
            int tinggi = input.nextInt();
            hasil = count.volume_kerucut(diameter, tinggi);
            status = "Menghitung Volume Kerucut";
        } else if (pilihan == 4) {
            System.out.print ("Masukkan Diameter : ");
            int diameter = input.nextInt();
            status = "Menghitung Volume Bola";
        } else {
            status = "Pilihan tidak valid, harus antara 1-4"; // Jika pilihannya tidak ada
        }
         System.out.println("\nStatus : " + status);
         System.out.println("Hasil  : " + hasil);   
        } catch (Exception e) {
            System.out.println("Inputan Tidak Valid");
        }
    }
}
