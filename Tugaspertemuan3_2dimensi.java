/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan3_2dimensi;

/**
 *
 * @author USER
 */
public class Tugaspertemuan3_2dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] array ={{5,6,1,7}, {8,1,2,9}, {5,4,7,1}, {8,3,7,5}};
for (int baris = 0; baris < 4; baris++) {
    for (int kolom = 0; kolom < 4; kolom++) {
       System.out.print(array[baris][kolom]+"   ");
       }
System.out.println("");
}
    }

    
}
