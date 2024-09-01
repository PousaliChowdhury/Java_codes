// Sum of smallest & largest element of array

import java.util.Scanner;

public class A16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<smallest)
                smallest = arr[i];
            else if(arr[i]>largest)
                largest = arr[i];
        }

        System.out.println(smallest+largest);
    }
}
