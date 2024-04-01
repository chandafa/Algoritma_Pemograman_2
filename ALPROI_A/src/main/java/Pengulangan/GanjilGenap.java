/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pengulangan;

/**
 *
 * @author CHAN
 */
public class GanjilGenap {

    public static void main(String[] args) {
        int batas = 10; // Batas bilangan yang ingin dihitung
        int i = 1;

        // Menghitung bilangan ganjil
        while (i <= batas) {
            if (i % 2 == 1) {
                System.out.println(i + " adalah bilangan ganjil");
            }
            i++;
        }

        i = 1; // Reset nilai i

        // Menghitung bilangan genap
        while (i <= batas) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            }
            i++;
        }
    }
}

