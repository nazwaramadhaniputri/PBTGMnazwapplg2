/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasbab18soal1trycatch;

/**
 *
 * @author ASUS
 */
public class Tugasbab18soal1trycatch {

    public static void main(String[] args) {
        try {
            int data = 50 / 0; //may throw exception 
        } //handling the exception 
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}