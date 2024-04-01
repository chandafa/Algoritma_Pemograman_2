/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pengulangan;

/**
 *
 * @author CHAN
 */

// Cara pertama

public class menghitung_jam_menit_detik {
    public static void main(String[] args) {
        // Masukkan total detik
        int totalDetik = 1000;

        // Hitung jam
        int jam = totalDetik / 3600;

        // Hitung sisa detik setelah dihitung jam
        int sisaDetik = totalDetik % 3600;

        // Hitung menit
        int menit = sisaDetik / 60;

        // Hitung sisa detik setelah dihitung menit
        int detik = sisaDetik % 60;

        // Cetak hasil
        System.out.println("waktu:" + jam + ":" + menit + ":" + detik);
    }
}

// Cara kedua
// public class menghitung_jam_menit_detik {
//    public static void main(String[] args) {
//      int jam, menit, detik;

// Scanner sc= new Scanner