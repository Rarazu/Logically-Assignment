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
        int maksimum, jumlah, i, lokasi = 1, array[];
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        jumlah = input.nextInt();
        array = new int[jumlah];

        System.out.println("Masukkan " + jumlah + " angka");
        for (i = 0; i < jumlah; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        
        for (i = 0; i < jumlah; i++) {
            if (array[i] % 2 == 1) {
                System.out.println(array[i] + " = " + "Ganjil");
            } else if (array[i] % 2 == 0) {
                System.out.println(array[i] + " = " + "Genap");
            }
        }
    }
}
