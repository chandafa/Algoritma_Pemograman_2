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
public class Segitiga {
    double alas, tinggi, luas;
    
    void HitungLuas() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Alas: ");alas=sc.nextDouble();
        System.out.print("Tinggi: ");tinggi=sc.nextDouble();
        luas=(alas*tinggi)/2;
        System.out.print("Luas: "+luas);
        luas=sc.nextDouble();
    }
    
    public static void main(String[] args) {
        int N;
        Segitiga S=new Segitiga();
    
    
    Scanner sc= new Scanner(System .in);
    System.out.print("Nilai N: ");N=sc.nextInt();
    for (int i=1;i<=N;i++) 
        S.HitungLuas();
    }
    
}
