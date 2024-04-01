///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Modular;
//
///**
// *
// * @author CHAN
// */
//package Modular;
//
//import java.util.Scanner;
//
//public class Segitiga4 {
//    double alasSegitiga, tinggiSegitiga, luas, keliling;
//
//    void bacaSegitiga() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Masukkan alas segitiga: ");
//        alasSegitiga = sc.nextDouble();
//        System.out.print("Masukkan tinggi segitiga: ");
//        tinggiSegitiga = sc.nextDouble();
//    }
//
//    void hitungLuas() {
//        luas = (alasSegitiga * tinggiSegitiga) / 2;
//    }
//
//    void hitungKeliling() {
//        double sisiMiring = Math.sqrt(alasSegitiga * alasSegitiga + tinggiSegitiga * tinggiSegitiga);
//        keliling = alasSegitiga + tinggiSegitiga + sisiMiring;
//    }
//
//    void tampilkanSegitiga() {
//        System.out.println("Alas segitiga: " + alasSegitiga);
//        System.out.println("Tinggi segitiga: " + tinggiSegitiga);
//        System.out.println("Luas segitiga: " + luas);
//        System.out.println("Keliling segitiga: " + keliling);
//    }
//
//    public static void main(String[] args) {
//        int n;
////        Segitiga segitiga = new Segitiga();
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Masukkan jumlah perhitungan: ");
//        n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            segitiga.bacaSegitiga();
//            segitiga.hitungLuas();
//            segitiga.hitungKeliling();
//            segitiga.tampilkanSegitiga();
//        }
//    }
//}
