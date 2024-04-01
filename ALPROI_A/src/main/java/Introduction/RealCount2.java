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
public class RealCount2 {
    public static void main(String[] args) {
        int p1, p2, p3, ts, tts, tm, td;
        // Membaxa data masukan dari keyboard    
        Scanner sc= new Scanner(System.in);
        System.out.println("Pason 1 : ");p1=sc.nextInt();
        boolean cp1;
        cp1=p1<=300;
        System.out.println("cek jumlah suara paslon 1 adalah");p1=sc.nextInt();
        System.out.println("Pason 2 : ");p2=sc.nextInt();
        System.out.println("Pason 3 : ");p3=sc.nextInt();
        System.out.println("Total Suara Sah : ");ts=sc.nextInt();
        System.out.println("Total Suara Tidak Sah : ");tts=sc.nextInt();
        System.out.println("Total Pemilih : ");tm=sc.nextInt();
        System.out.println("Total Dpt : ");td=sc.nextInt();
        
        // Menampilkan Output ke Layar
        System.out.println("Pason 1 : "+p1);
        System.out.println("Pason 2 : "+p2);
        System.out.println("Pason 3 : "+p3);
        System.out.println("Pason 3 : "+p3);
    }
    
}
