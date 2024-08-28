/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasbab6soal2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Tugasbab6soal2 {

    public static void main(String[] args) {
        Scanner myInput= new Scanner(System.in); //membuat a Scanner object
        System.out.println("Masukan Nim Anda? ");
        String nim = myInput.nextLine();
        System.out.println("Masukan Nama Anda? ");
        String nama = myInput.nextLine();
        System.out.println("Masukan Nilai Anda? ");
        int nilai = myInput.nextInt();
 
 if(nilai<50){
 System.out.println("Tidak Lulus ");
 }
 else if(nilai>=50 && nilai<60){
 System.out.println("Grade D ");
 }
 else if(nilai>=60 && nilai<70){
 System.out.println("Grade C ");
 }
 else if(nilai>=70 && nilai<80){
 System.out.println("Grade B ");
 }
 else if(nilai>=80 && nilai<90){
 System.out.println("Grade A ");
 }
 else if(nilai>=90 && nilai<100){
 System.out.println("Grade A+ ");
 }
 else {
 System.out.println("Data Nilai Salah! ");
 }
 
 if(nilai<50){
 System.out.println("Keterangan : Tidak Lulus ");
 }
 else if(nilai>=60 && nilai<100){
 System.out.println("Keterangan : Lulus ");
 }
 else if(nilai>=50 && nilai<60){
 System.out.println("Keterangan : Tidak Lulus ");
 }
    }
}