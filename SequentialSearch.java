/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequential_search;

/**
 *
 * @author  Tegar karunia ilham
 */
public class SequentialSearch {

       public static void main(String[] args) {
       int[] exampleVariableOne = {12, 9, 6, 7, 4, 5, 3, 0, 1};
       int target = 4;
       sequentialSearch(exampleVariableOne, target);
       
    }
public static void sequentialSearch(int[] parameterone, int parameterTwo){
   int index = -1;
// searches each index of the array until it reaches the last index
   for (int i = 0; i <parameterone.length; i++) {
       if (parameterone[i] == parameterTwo) {
// if the target is found, int index is set as the value of i and
// the for loopis terminated
      index = i;
      break;
     }
}
        if (index == -1) {
      System.out.println("Your target integer does not exist in the array");
}       else {
         System.out.println("your target integer is in index" + index  + " of the array");
       }
    }
}