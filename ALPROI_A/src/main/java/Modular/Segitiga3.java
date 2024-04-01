///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Modular;
//
//import java.util.Scanner;
//
///**
// *
// * @author CHAN
// */
//public class Segitiga3 {
//    double alas, tinggi, luas, keliling;
//    
//    void BacaSegitiga() {
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Alas: ");alas=sc.nextDouble();
//        System.out.print("Tinggi: ");tinggi=sc.nextDouble();
//    }
//    
//    void TampilSegitiga() {
//        System.out.println("Alas: "+alas);
//        System.out.println("Tinggi: "+tinggi);
//        System.out.println("Luas: "+luas);
//        System.out.println("Keliling: "+keliling);
//    }
//    
//    void HitungKeliling() {
//        double a, c;
//        c=Math.sqrt(alas*alas+tinggi*tinggi);
//        keliling=alas+tinggi+c;
//        luas=(alas*tinggi)/2;
//        System.out.print("Keliling: "+keliling);
//    }
//    
//    public static void main(String[] args) {
//        int N;
//        Segitiga2 S=new Segitiga2();
//    
//    
//    Scanner sc= new Scanner(System .in);
//    System.out.print("Nilai N: ");N=sc.nextInt();
//    for (int i=1;i<=N;i++) 
//        S.BacaSegitiga();
//        S.HitungLuas();
//        S.HitungKeliling();
//        S.TampilSegitiga();
//    }
//}
