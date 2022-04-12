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
public class Jumlah {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Angka :");
        int angka = input.nextInt();
        int i = 1;
        int jumlah = 0;
        
        while(i <= angka){
            jumlah += i;
            i++;
        }
        System.out.println("Penjumlahan :");
        System.out.println(jumlah);
    }
}
