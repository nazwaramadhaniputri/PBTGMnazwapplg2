/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasbab13soal2;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Tugasbab13soal2 {
    public class Segitiga {
        private double alas;
        private double tinggi;
        private double luas;
        
        public Segitiga() {
        this.alas = 0;
        this.tinggi = 0;
        this.luas = 0;
    }
        public Segitiga(double alas, double tinggi) {
            this.alas = alas;
            this.tinggi = tinggi;
            this.luas = hitungLuas(alas, tinggi); // Hitung luas menggunakan dua parameter
        }
        
        public double getAlas() {
            return alas;
        }
        
        public void setAlas(double alas) {
            this.alas = alas;
            this.luas = hitungLuas(alas, this.tinggi); // Hitung ulang luas jika alas berubah
        }
        
        public double getTinggi() {
            return tinggi;
        }
        
        public void setTinggi(double tinggi) {
            this.tinggi = tinggi;
            this.luas = hitungLuas(this.alas, tinggi); // Hitung ulang luas jika tinggi berubah
        }
        
        public double getLuas() {
            return luas;
        }

        // Metode untuk menghitung luas dengan dua parameter (alas dan tinggi)
        public double hitungLuas(double alas, double tinggi) {
            return (alas * tinggi) / 2;
        }
        
        // Metode untuk menghitung luas dengan objek Segitiga sebagai parameter
        public double hitungLuas(Segitiga segitiga) {
            return hitungLuas(segitiga.getAlas(), segitiga.getTinggi());
        }
        
        public void tampilkanData() {
            System.out.println("Alas: " + alas);
            System.out.println("Tinggi: " + tinggi);
            System.out.println("Luas: " + luas);
        }
    }
    
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Masukkan alas segitiga: ");
        double alas = myInput.nextDouble();

        System.out.println("Masukkan tinggi segitiga: ");
        double tinggi = myInput.nextDouble();

        // Membuat instance dari Segitiga dengan input dari pengguna
        Tugasbab13soal2 objekLuar = new Tugasbab13soal2();
        Segitiga segitiga = objekLuar.new Segitiga(alas, tinggi);

        // Menampilkan hasil
        System.out.println("\nInformasi Segitiga:");
        segitiga.tampilkanData();
    }
}
