/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasbab17soal1;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Tugasbab17soal1 {

     public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        
        System.out.println("Masukan Jumlah Kota : ");
        int jumlahKota = myInput.nextInt();
        
        myInput.nextLine();
        
        String[] kotaArray = new String[jumlahKota];
        
        for (int i = 0; i < jumlahKota; i++) {
            System.out.println("Kota ke " + (i + 1) + " : ");
            kotaArray[i] = myInput.nextLine();
        }
        
        System.out.println("Kota-kota yang dimasukan:");
        for (String kota : kotaArray) {
            System.out.println(kota);
        }
    }
}