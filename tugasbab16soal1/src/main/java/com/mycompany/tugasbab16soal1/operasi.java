/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasbab16soal1;

/**
 *
 * @author ASUS
 */
public class operasi extends operasiaritmatika {
    
    public operasi(double a, double b){
        super(a, b);
    }
    
    @Override
    public double penjumlahan() {
        return a + b;
    }

    @Override
    public double pengurangan() {
        return a - b;
    }

    @Override
    public double perkalian() {
        return a * b;
    }

    @Override
    public double pembagian() {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
        }
    }
}