/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasbab10soal1;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Tugasbab10soal1 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        
        aritmatika3 aritmatika = new aritmatika3();
        System.out.print("Masukkan bilangan pertama: ");
        int a = myInput.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int b = myInput.nextInt();

        // Menampilkan hasil operasi
        System.out.println("Pengurangan: " + aritmatika.pengurangan(a, b));
        System.out.println("Perkalian: " + aritmatika.perkalian(a, b));

        try {
            System.out.println("Pembagian: " + aritmatika.pembagian(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        System.out.println("Pangkat: " + aritmatika.pangkat(a, b));
    }
}
