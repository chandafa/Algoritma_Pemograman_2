/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Record;

import java.util.Scanner;

/**
 *
 * @author CHAN
 */
public class Titik {
    float x,y;
    public static void main(String[] args) {
        Titik T= new Titik();
        Titik T2= new Titik();
        
        
//      ini adalah titik kesatu
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Titik Pertama");
        System.out.print("x : ");T.x=sc.nextFloat();
        System.out.print("y : ");T.y=sc.nextFloat();
        
        System.out.println("<"+T.x+" : "+T.y+">");
        
        
        
//      ini adalah titik kedua
//        System.out.println("Titik Kedua");
//        System.out.print("x : ");T2.x=sc.nextFloat();
//        System.out.print("y : ");T2.y=sc.nextFloat();
//        
//        System.out.println("x : "+T2.x);
//        System.out.println("y : "+T2.y);
    }
}
