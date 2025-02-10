package Ac;
// Find MaxElement & MaxIndex of the array

import java.util.Scanner;

public class MaxEleIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        //base case
        if(arr.length==0)
            return;

        int maxIndex = 0;
        int maxElement = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]>maxElement){
                maxElement = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("maxElement = " + maxElement);
        System.out.println("maxIndex = " + maxIndex);
    }
}
