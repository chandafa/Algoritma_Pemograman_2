/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percabangan;

import java.util.Scanner;
/**
 *
 * @author CHAN
 */


public class GanjilGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai siswa: ");
        int nilai = scanner.nextInt();

        if (nilai >= 0 && nilai <= 100) {
            if (nilai >= 60) {
                System.out.println("Nilai siswa: " + nilai);
                System.out.println("Status: Lulus");
            } else {
                System.out.println("Nilai siswa: " + nilai);
                System.out.println("Status: Tidak Lulus");
            }
        } else {
            System.out.println("Nilai yang dimasukkan tidak valid. Harap masukkan nilai antara 0 dan 100.");
        }

        scanner.close();
    }
}
