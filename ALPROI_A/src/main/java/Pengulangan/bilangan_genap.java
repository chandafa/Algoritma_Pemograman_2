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
public class bilangan_genap {
    
// Cara pertama (1)   
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //input nilai N
        System.out.print("Masukan Nilai N: ");
        int N = input.nextInt();
        
        // inisialisasi
        int X = 0;
        
        // pengulangan
        while (X < N) {
            System.out.println(X);
            X+=2;
        }
        
        // output selesai
        System.out.println("Selesai");
    }
}

//Cara kedua (2)

// public static void main(String[] args) {
// int X, N;

// Scanner sc= new Scanner (System.in);
// System.out.print("Nilai N: ");N=sc.nextInt();
// X=0;
// while (X < N) {
//    System.out.println("X= "+X);
//    X=X+2;
// }
// System.out.print("Selesai");
// }