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
public class percobaan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi variabel
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int ts = 0;
        int tts = 0;
        int tm = 0;
        int ttm = 0;
        int td = 0;

        // Meminta input total DPT
        System.out.print("Masukkan total DPT: ");
        td = scanner.nextInt();

        // Meminta input suara sah
        System.out.print("Masukkan total suara sah: ");
        ts = scanner.nextInt();

        // Meminta input suara tidak sah
        System.out.print("Masukkan total suara tidak sah: ");
        tts = scanner.nextInt();

        // Menghitung total memilih
        tm = ts + tts;

        // Menghitung total tidak memilih
        ttm = td - tm;

        // Meminta input suara untuk setiap paslon
        System.out.print("Masukkan suara untuk Paslon 1: ");
        p1 = scanner.nextInt();

        System.out.print("Masukkan suara untuk Paslon 2: ");
        p2 = scanner.nextInt();

        System.out.print("Masukkan suara untuk Paslon 3: ");
        p3 = scanner.nextInt();

        // Menghitung persentase suara untuk setiap paslon
        double persenP1 = (double) p1 / ts * 100;
        double persenP2 = (double) p2 / ts * 100;
        double persenP3 = (double) p3 / ts * 100;

        // Menampilkan hasil real count
        System.out.println("Hasil Real Count:");
        System.out.println("Total DPT: " + td);
        System.out.println("Total Memilih: " + tm);
        System.out.println("Total Tidak Memilih: " + ttm);
        System.out.println("Total Suara Sah: " + ts);
        System.out.println("Total Suara Tidak Sah: " + tts);
        System.out.println();
        System.out.println("Hasil Perolehan Suara:");
        System.out.println("Paslon 1: " + p1 + " suara (" + persenP1 + "%)");
        System.out.println("Paslon 2: " + p2 + " suara (" + persenP2 + "%)");
        System.out.println("Paslon 3: " + p3 + " suara (" + persenP3 + "%)");
    }
}
