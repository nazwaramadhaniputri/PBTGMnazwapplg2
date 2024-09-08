/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasbab16soal2;

/**
 *
 * @author ASUS
 */
public class Tugasbab16soal2 {

    public static void main(String[] args) {
       double a = 9.5;
        double b = 2.5;
        
         OperasiAritmatika[] operasi = new OperasiAritmatika[]{
            new Penjumlahan(a, b),
            new Pengurangan(a, b),
            new Perkalian(a, b),
            new Pembagian(a, b)
         };
         
         // Menampilkan hasil operasi
        for (OperasiAritmatika op : operasi) {
            try {
                System.out.println(op.getClass().getSimpleName() + ": " + op.hitung());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}