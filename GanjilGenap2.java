/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logically;

import java.util.Scanner;

/**
 *
 * @author zahraurava
 */
public class GanjilGenap2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka:");
        int angka = input.nextInt();

        int array[] = {4, 6, 1, 3, angka};
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.println("Ganjil");
            } else if (array[i] % 2 == 0) {
                System.out.println("Genap");
            }
        }
    }
}
