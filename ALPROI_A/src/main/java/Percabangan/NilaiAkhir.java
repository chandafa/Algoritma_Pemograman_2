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
public class NilaiAkhir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values
        System.out.print("Input UTS: ");
        double uts = scanner.nextDouble();
        System.out.print("Input UAS: ");
        double uas = scanner.nextDouble();
        System.out.print("Input TUGAS: ");
        double tugas = scanner.nextDouble();
        System.out.print("Input Hadir: ");
        double hadir = scanner.nextDouble();

        // Calculate final score
        double finalScore = 0.3 * uts + 0.3 * uas + 0.3 * tugas + 0.1 * hadir;

        // Determine grade index
        char index;
        if (finalScore >= 80) {
            index = 'A';
        } else if (finalScore >= 70) {
            index = 'C';
        } else if (finalScore >= 60) {
            index = 'D';
        } else if (finalScore < 60) {
            index = 'E';
        } else {
            index = 'B'; // Handle score between -80 and 60 (inclusive)
        }

        // Output result
        System.out.println("Grade Index: " + index);
    }

}
