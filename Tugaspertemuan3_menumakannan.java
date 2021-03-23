/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan3_menumakannan;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Tugaspertemuan3_menumakannan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nama;
        String Nomormenu;

Scanner scan = new Scanner(System.in);

//header
System.out.println("CAFE CERIA)");
System.out.println("ANEKA MINUMAN");
System.out.println("--------------------");
System.out.println("SPECIAL MENU:");
System.out.println("1. soft drinks");
System.out.println("2. mix juice");
System.out.println("3. Nescafe ");
System.out.println("4. soda milk");
System.out.println("5. Tea ");
System.out.println("--------------------");
System.out.println("masukkan Nama pembeli:" );
Nama = scan.nextLine();

//body
System.out.println("silahkan masukkan pilihan anda:");
Nomormenu = scan.nextLine();
switch (Nomormenu){
    case "1":
       System.out.println(" minuman yang anda pesan adalah soft drink:");
       System.out.println("pesanan akan segera kami antar");
       System.out.println("Terima kasih " +Nama+ " telah berkunjung dicafe ceria" );
        
        break;
        
    case "2":
         System.out.println("minuman yang anda pesan adalah softmix juice");
         System.out.println("pesanan akan segera kami antar");
         System.out.println("Terima kasih "+Nama+" telah berkunjung dicafe ceria" );
        break;
        
    case "3":
        
        System.out.println("minuman yang anda pesan adalah Nescafe");
        System.out.println("pesanan akan segera kami antar");
        System.out.println("Terima kasih " +Nama+ " telah berkunjung dicafe ceria" );
        break;
        
    case "4":
        System.out.println("minuman yang anda pesan adalah soda milk");
        System.out.println("pesanan akan segera kami antar");
         System.out.println("Terima kasih " +Nama+ " telah berkunjung dicafe ceria" );
        break;
        
    case "5":
        System.out.println("minuman yang anda pesan adalah Tea");
        System.out.println("pesanan akan segera kami antar");
         System.out.println("Terima kasih " +Nama+ " telah berkunjung dicafe ceria" );
        
        break;
           
    default:
         System.out.print("please Dech,pilih No 1,2,3,4 dan 5 aja ya");
  
     
     
}
    }
}

        

    
    

