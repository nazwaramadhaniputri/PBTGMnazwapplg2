/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasbab16soal1;

/**
 *
 * @author ASUS
 */
public class Tugasbab16soal1 {

    public static void main(String[] args) {
        double a = 9.5;
        double b = 2.5;
        
        // Membuat objek dari subclass Operasi
        operasi operasi = new operasi(a,b);
        
        // Menampilkan hasil operasi
        System.out.println("Penjumlahan: " + operasi.penjumlahan());
        System.out.println("Pengurangan: " + operasi.pengurangan());
        System.out.println("Perkalian: " + operasi.perkalian());
        try {
            System.out.println("Pembagian: " + operasi.pembagian());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}