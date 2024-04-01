/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modular;

import java.util.Scanner;

/**
 *
 * @author CHAN
 */
public class Segitiga2 {
     double alas, tinggi, luas;
    
    void BacaSegitiga() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Alas: ");alas=sc.nextDouble();
        System.out.print("Tinggi: ");tinggi=sc.nextDouble();
    }
    
    void TampilSegitiga() {
        System.out.print("Alas: "+alas);
        System.out.print("Tinggi: "+tinggi);
    }
    
    void HitungLuas() {
        luas=(alas*tinggi)/2;
        System.out.print("Luas: "+luas);
    }
    
    public static void main(String[] args) {
        int N;
        Segitiga2 S=new Segitiga2();
    
    
    Scanner sc= new Scanner(System .in);
    System.out.print("Nilai N: ");N=sc.nextInt();
    for (int i=1;i<=N;i++) 
        S.BacaSegitiga();
        S.HitungLuas();
        S.TampilSegitiga();
    }
}
