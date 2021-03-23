/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_aray.pkg2dimensi;

/**
 *
 * @author USER
 */
public class Latihan_Aray2dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] array ={{4,2,1,5}, {9,6,5,7,8}, {5,2,1,5,10}};
for (int baris = 0; baris < 4; baris++) {
    for (int kolom = 0; kolom < 4; kolom++) {
       System.out.print(array[baris][kolom]+"   ");
       }
System.out.println("");
}
    }
}

    

