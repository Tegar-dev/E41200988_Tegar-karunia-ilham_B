/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_menampilkan.bilangan.genap_for;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Tugas_MenampilkanBilanganGenap_for {

 
public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        
     int awal;
        int akhir;
        
        System.out.println("      MENAMPILKAN BILANGAN GENAP DARI KECIL HINGGA BESAR ");
        System.out.println("                         SELAMAT DATANG  ");

        System.out.print("Masukkan nilai awal: ");
        awal = input.nextInt();
        System.out.print("Masukkan nilai akhir: ");
        akhir = input.nextInt();
        System.out.println("------------------------------------------------------------------");
        
        System.out.println("Bilangan Genap");
        for (int i = awal; i <= akhir; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        
        
    }
    
}
