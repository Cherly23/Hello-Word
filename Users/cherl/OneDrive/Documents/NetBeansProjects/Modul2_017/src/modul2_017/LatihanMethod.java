/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2_017;

import javax.swing.JOptionPane;

public class LatihanMethod {
    void kalkulator(String operasi, double bil1, double bil2){
        double hasil;
        
        switch (operasi) {
            case "penjumlahan":
                hasil = bil1+bil2;
                break;
            case "pengurangan":
                hasil = bil1-bil2;
                break;
            case "perkalian":
                hasil = bil1*bil2;
                break;
            case "pembagian":
                if (bil2 != 0) {
                    hasil = bil1 / bil2;
                } else {
                    JOptionPane.showMessageDialog(null, "Eror: Pembagian dengan nol tidak dapat dilakukan", "Eror", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operasi tidak dikenali", "Eror", JOptionPane.ERROR_MESSAGE);
                return;
        }
        String txtMessage = "Hasil Operasi " + operasi + " " + bil1 + " dan " + bil2 + " adalah " + hasil;
        JOptionPane.showMessageDialog(null, txtMessage, "Hasil Operasi", JOptionPane.PLAIN_MESSAGE);
    }
    public static void main(String[] args) {
        LatihanMethod lm = new LatihanMethod();
        lm.kalkulator ("penjumlahan", 3, 5);
        lm.kalkulator("pengurangan", 10, 4);
        lm.kalkulator("perkalian", 7, 6);
        lm.kalkulator("pembagian", 20, 4);
    }
}
