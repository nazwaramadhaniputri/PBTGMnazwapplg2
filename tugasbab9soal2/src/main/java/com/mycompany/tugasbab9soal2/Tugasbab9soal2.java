/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasbab9soal2;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Tugasbab9soal2 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Masukan bilangan awal: ");
        int awal =  myInput.nextInt();
        System.out.println("Masukan bilangan akhir: ");
        int akhir =  myInput.nextInt();
        
        System.out.println("Hasil deret bilangan: ");
        boolean bilangan = true;
        
        for (int i = awal; i <= akhir; i += 5) {
            if (!bilangan) {
                System.out.print(" , ");
            }
            System.out.print(i);
            bilangan = false;
        }
        myInput.close();
    }
}
