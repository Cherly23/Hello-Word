/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.array;


public class LatihanArrar2 {
    public static void main(String[] args) {
        String[][] data = {
            {"ABDUL", "085646668991", "Kediri"},
            {"Kusno", "085646668992", "Trenggalek"},
            {"PONIRAN", "085646668993", "Bojonegoro"}  
        };
        //Header
        System.out.println(String.format("%-10s %-13s %-10s", "Nama", "Alamat", "Telepon"));
        System.out.println("-------------------------------------");
        
        //Menampilkan Data
        for (String[] row : data) {
            System.out.println(String.format("%-10s %-13s %-10s", row[0], row[2], row[1]));
        }
    }
}
