/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pengulangan;

import java.util.Scanner;

/**
 *
 * @author CHAN
 */
public class realcount_pengulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p1 = 0, p2 = 0, p3 = 0, ts = 0, tts = 0, tm = 0, td = 0;

        while (true) {
            System.out.println("Pason 1: ");
            p1 = sc.nextInt();

            if (p1 <= 300) {
                break;
            }

            System.out.println("Jumlah suara paslon 1 harus kurang dari atau sama dengan 300.");
        }

        System.out.println("Pason 2: ");
        p2 = sc.nextInt();
        System.out.println("Pason 3: ");
        p3 = sc.nextInt();
        System.out.println("Total Suara Sah: ");
        ts = sc.nextInt();
        System.out.println("Total Suara Tidak Sah: ");
        tts = sc.nextInt();
        System.out.println("Total Pemilih: ");
        tm = sc.nextInt();
        System.out.println("Total Dpt: ");
        td = sc.nextInt();

        // Menampilkan Output ke Layar
        System.out.println("Pason 1: " + p1);
        System.out.println("Pason 2: " + p2);
        System.out.println("Pason 3: " + p3);
        System.out.println("Total Suara Sah: " + ts);
        System.out.println("Total Suara Tidak Sah: " + tts);
        System.out.println("Total Pemilih: " + tm);
        System.out.println("Total Dpt: " + td);
    }
}
