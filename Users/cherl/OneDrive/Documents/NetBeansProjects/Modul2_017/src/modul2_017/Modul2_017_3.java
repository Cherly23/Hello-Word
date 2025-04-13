/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2_017;

import javax.swing.JOptionPane;

public class Modul2_017_3 {
    // Menghitung Luas Persegi Panjang
    public double luas_PersegiPanjang(int panjang, int lebar){
        int total = panjang * lebar;
        return total;
    }
    // Menghitung Luas Segitiga
    public double luas_Segitiga(int alas, int tinggi) {
        int total = (alas * tinggi) / 2;
        return total;
    }
    // Menghitung Luas Lingkaran
    public double luas_lingkaran(int diameter) {
        int jari_jari = diameter / 2;
        double total = Math.PI * Math.pow(jari_jari, 2);
        return total;
    }
    public static void main(String[] args) {
        Modul2_017_3 count = new Modul2_017_3();
    // Inisialisasi variabel total untuk menampung hasil dari
    // perhitungan dan jenis untuk menyimpan jenis bangun datar yang dipilih.
    try {
       double total = 0;
       String jenis = "";
       // MMenampilkan Input dialog untuk memilih jenis perhitungan.
       int pilihan = Integer.parseInt(JOptionPane.showInputDialog("Pilihan : \n"
       + "1. Luas Panjang\n"
       + "2. Luas Segitiga\n"
       + "3. Luas Lingkaran\n"));
            if (pilihan == 1) {
                int panjang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang : "));
                int lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar : "));
                total = count.luas_PersegiPanjang(panjang, lebar);
                jenis = "Persegi Panjang";
            } else if (pilihan == 2) {
                int alas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Alas : "));
                int tinggi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tinggi :"));
                total = count.luas_Segitiga(alas, tinggi);
                jenis = "Segitiga";
            } else if (pilihan ==3) {
                int diameter = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Diameter : "));
                total = count.luas_lingkaran(diameter);
                jenis = "Lingkaran";
            } else {
                JOptionPane.showMessageDialog(null, "Pilihan Tidak Valid, Harus Antara 1-3");
            } 
            JOptionPane.showMessageDialog(null, "Luas " + jenis +" = " + total);
            System.out.println("Luas " + jenis + " = " + total);
    } catch (Exception e) {
        System.out.println("Inputan Tidak Valid, Silahkan Coba Lagi");
       } 
    }
}
