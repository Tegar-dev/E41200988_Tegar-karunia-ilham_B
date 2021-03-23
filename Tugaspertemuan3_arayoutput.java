/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan3_arayoutput;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Tugaspertemuan3_arayoutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //membuat variable dan Scaner
int[] harga= new int[5];
String nama;
String hadiah;
int sum = 0;
Scanner scan = new Scanner(System.in);

//header
System.out.println("Kharisma Agung Plaza (KAP)");
System.out.println("promo Belanja Berhadiah");
System.out.println("khusus Pembelian 5 Barang Pertama");
System.out.println("Dengan harga minimum Rp 10000,00");
System.out.println("-------------------------------");
System.out.print("masukkan nama pembeli ");
nama = scan.nextLine();

//body
System.out.println("");
System.out.print("masukkan harga barang ke-1");
harga [0] = scan.nextInt();
System.out.println("masukkan harga barang ke-2");
harga [1] = scan.nextInt ();
System.out.print("masukkan harga barang ke-3");
harga [2] = scan.nextInt();
System.out.print("masukkan harga barang ke-4");
harga [3] = scan.nextInt ();
System.out.print ("Masukkan harga barang ke-5 ");
harga [3] = scan.nextInt ();



for (int i =0; i < harga.length; i++) {
sum = sum + harga[i];
}
System.out.println("Total harga pembelian atas nama "+ nama +" adalah Rp"
+ sum);


if (sum >= 100000){
hadiah = "Cantik";
} else if (sum >= 75000){
hadiah = "Bing Kaca";
} else if (sum >= 50000){
hadiah = "Rinso 250 gram";
} else if (sum >= 25000){
hadiah = "Tanggo";
} else if (sum >= 20000){
hadiah = "Tictac";
} else if (sum >=10000){
hadiah = "Sachet escast.";
} else {
hadiah = "Anda tidsk mendapatkan hadiah karena tidak memenuhi kriteria pembelian";
}

System.out.println("");
System.out.println("selamat....");
System.out.println("Anda mendapatkan buah "+hadiah);
   
    //Footer
    
    System.out.println("----------------------------------");
    System.out.println ("Terima kasih");
    System.out.println ("Anda sudah belanja di kharisma Agung plaza");
    
    }
    
}

    
    

