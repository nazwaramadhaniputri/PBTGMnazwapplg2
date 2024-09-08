/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasbab15soal2;
import kalkulatorpack.KalkulatorKurang;
import kalkulatorpack.KalkulatorBagi;
import kalkulatorpack.KalkulatorKali;
/**
 *
 * @author ASUS
 */
public class Tugasbab15soal2 {

    public static void main(String[] args) {
        
        // Membuat objek dari masing-masing kelas
        KalkulatorKurang kalkulatorKurang = new KalkulatorKurang();
        KalkulatorBagi kalkulatorBagi = new KalkulatorBagi();
        KalkulatorKali kalkulatorKali = new KalkulatorKali();

        // Menghitung hasil operasi
        int hasilKurang = kalkulatorKurang.kurang(10, 5);
        int hasilBagi = kalkulatorBagi.bagi(10, 2);
        int hasilKali = kalkulatorKali.kali(10, 5);

        // Menampilkan hasil output
        System.out.println("Hasil pengurangan: " + hasilKurang);
        System.out.println("Hasil pembagian: " + hasilBagi);
        System.out.println("Hasil perkalian: " + hasilKali);
    }
}
