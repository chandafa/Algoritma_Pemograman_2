/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduction;

import java.util.Scanner;

/**
 *
 * @author CHAN
 */
public class contoh1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jari-jari
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();

        // Menghitung keliling lingkaran
        double keliling = 2 * Math.PI * jariJari;

        // Meminta input sudut pusat
        System.out.print("Masukkan sudut pusat (dalam derajat): ");
        double sudutPusat = scanner.nextDouble();

        // Menghitung panjang ruas lingkaran
        double panjangRuas = (sudutPusat / 360) * keliling;

        // Menampilkan hasil
        System.out.println("Panjang ruas lingkaran adalah: " + panjangRuas);
    }
}
