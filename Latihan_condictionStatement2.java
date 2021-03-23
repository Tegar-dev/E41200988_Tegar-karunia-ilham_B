/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_condictionstatement2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Latihan_condictionStatement2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat variabel dan Scanner
String lampu;
Scanner scan = new Scanner (System. in);
//mengambil input
System.out.print ("Inputkan nama warna: ") ;
lampu = scan.nextLine();

switch (lampu) {
    case "merah":
         System.out.println ("Lampu merah, berhenti ! ") ;
         break;
    case "kuning ":
         System.out.println ("Lampu kuning, harap hati-hati! ");
          break;
    case "hijau" :
         System.out.println ("Lampu hijau, s1lahkan jalan! ") ;
         break;
default:
System.out. println ("Wazna lampu salah ! ") ;
     }
   }
}
    
    

