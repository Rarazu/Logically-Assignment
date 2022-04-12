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
public class GanjilGenap {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Angka:");
        int angka = input.nextInt();
        
        if (angka % 2 == 1) {
            System.out.println("Ganjil");
        } else if (angka % 2 == 0) {
            System.out.println("Genap");
        }
    }
}
