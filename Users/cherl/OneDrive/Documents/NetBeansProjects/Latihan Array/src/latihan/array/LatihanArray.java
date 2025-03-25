/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan.array;
import javax.swing.JOptionPane;
public class LatihanArray {

    public static void main(String[] args) {
     int data[][] = {
         {4,6,4,2,8,4,2,10},
         {4,6,4,2,8,4,2,10}
     };
   for (int a=0; a<data.length;a++) {
       for (int b=0; b<data[0].length; b++) {
           System.out.print(data[a][b] + " ");
       }
       System.out.println("");
     }
        System.out.println("============================");
    // a. Menghitung rata-rata array 
    int total = 0;    
    int jumlah = 0;
    for (int a=0; a< data.length; a++){
        for (int b=0; b<data[a].length; b++){
            total += data[a][b];
            jumlah++;
        }
    }
    double rata_rata = (double) total / jumlah;
        System.out.println("Nilai Rata-Rata Array : " + rata_rata);
        
    // b. Mengubah nilai berdasarkan input pengguna
    int baris = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Index Baris Yang Ingin Diubah (0 atau 1) : "));
    int kolom = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Index Kolom Yang Ingin Diubah (0-7) : "));
    int nilai = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Index Nilai Baru : "));
    
    // Mengubah niali dalam Array 
    if (baris >= 0 && baris < data.length && kolom >= 0 && kolom < data[baris].length){
        data[baris][kolom] = nilai;
    } else {
        System.out.println("Index Tidak Valid");
    }
    
    // Menampilkan Array setelah perubahan
        System.out.println("\nArray Setelah Perubahan :");
        for (int a=0; a<data.length; a++){
            for (int b=0; b<data[a].length; b++){
                System.out.print(data[a][b] +" ");
            }
            System.out.println();
        }
        
    // c. Menjumlah elemen di kolom ganjil
    int ganjil = 0;
    for (int a=0; a< data.length; a++){
        for (int b=1; b< data[a].length; b += 2) {
            ganjil += data[a][b];
        }
    }
        System.out.println("\nJumlah elemen di kolom ganjil : " + ganjil); 
    }
}
