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
public class periksa_nama_bulan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nomor bulan
        System.out.print("Masukkan nomor bulan (1-12): ");
        int nomorBulan = scanner.nextInt();

        // Periksa nama bulan
        String namaBulan;
        switch (nomorBulan) {
            case 1:
                namaBulan = "Januari";
                break;
            case 2:
                namaBulan = "Februari";
                break;
            case 3:
                namaBulan = "Maret";
                break;
            case 4:
                namaBulan = "April";
                break;
            case 5:
                namaBulan = "Mei";
                break;
            case 6:
                namaBulan = "Juni";
                break;
            case 7:
                namaBulan = "Juli";
                break;
            case 8:
                namaBulan = "Agustus";
                break;
            case 9:
                namaBulan = "September";
                break;
            case 10:
                namaBulan = "Oktober";
                break;
            case 11:
                namaBulan = "November";
                break;
            case 12:
                namaBulan = "Desember";
                break;
            default:
                namaBulan = "Nomor bulan tidak valid";
                break;
        }

        // Output nama bulan
        System.out.println("Nama bulan: " + namaBulan);
    }

}
