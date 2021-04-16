/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection_sort;

/**
 *
 * @author Tegar karunia ilham
 */
public class Selection_Sort {

 
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[]){  
        int[] arr1 = {9,14,3,2,43,11,58,22};  
        System.out.println("sebelum Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1);  
         
        System.out.println("sesudah Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
    }  
}

          //implementasikan dengan kata-kata

//[9,14,3,2,43,11,58,22]

//[2,14,3,9,43,11,58,22]

//[2,3,14,9,43,11,58,22]

//[2,3,9,14,43,11,58,22]

//[2,3,9,11,14,22,43,58]

//[2,3,9,11,14,22,43,58]