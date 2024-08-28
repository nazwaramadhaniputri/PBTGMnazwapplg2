/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasbab10soal2;

/**
 *
 * @author ASUS
 */
public class Aritmatika {
    private int bilangan1;
    private int bilangan2;

    // Konstruktor
    public Aritmatika(int bilangan1, int bilangan2) {
        this.bilangan1 = bilangan1;
        this.bilangan2 = bilangan2;
    }

    // Metode untuk melakukan pengurangan
    public int pengurangan() {
        return bilangan1 - bilangan2;
    }

    // Metode untuk melakukan perkalian
    public int perkalian() {
        return bilangan1 * bilangan2;
    }

    // Metode untuk melakukan pembagian
    public int pembagian() {
        if (bilangan2 != 0) {
            return bilangan1 / bilangan2;
        } else {
            throw new ArithmeticException("Pembagi tidak boleh nol.");
        }
    }

    // Metode untuk melakukan pangkat
    public double pangkat() {
        return Math.pow(bilangan1, bilangan2);
    }
}
