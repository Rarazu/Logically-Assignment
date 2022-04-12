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
public class LebihBesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Angka Pertama :");
        int pertama = input.nextInt();
        System.out.println("Masukkan Angka Kedua :");
        int kedua = input.nextInt();
        
        if (pertama > kedua) {
            System.out.println("Angka yang lebih besar adalah "+pertama);
        } else if (pertama < kedua) {
            System.out.println("Angka yang lebih besar adalah "+kedua);
        }
    }
    
}
