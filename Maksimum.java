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
public class Maksimum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka:");
        int angka = input.nextInt();

        int array[] = {4, 6, 1, 3, angka};
        
        int maksimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if(maksimum < array[i]){
                maksimum = array[i];
            }
        }
        System.out.println("Nilai Maksimum :" +maksimum);
    }
}
