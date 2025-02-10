package Ac;
// People marching
// NOTE* - matrix(n rows, 3 columns), ith barrier (xi, yi, di), people who wants to pass through points lying on line segment connect (xi, yi) & (xi+d, yi)

import java.util.Scanner;

public class MarchingPeople {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][3];

        // Reading input values
        for (int i = 0; i < n; i++) { //row
            for (int j = 0; j < 3; j++) { //column
                arr[i][j] = sc.nextInt();
            }
        }

        int points[][] = new int[n][2];
        for(int i=0; i<n; i++){
            points[i][0] = 0;
            points[i][1] = 0;
        }

        //step 1
        for(int i=0; i<n; i++){
            points[i][0] = arr[i][0];
            points[i][1] = arr[i][0]+arr[i][2];//d=2
        }

        int totalpeopleblocked = 0;

        //step 2
        int start = points[0][0];
        int end = points[0][1];

        for(int i=0; i<n; i++){
            if(points[i][0] <= end) { // Compare with 'end', not 'points[i-1][1]'
                end = Math.max(end, points[i][1]); // Update 'end' to the maximum value
            }else{
                //step 3 -> Calculate no. of people blocked calculate simultaneously
                totalpeopleblocked += end - start + 1;
                start = points[i][0];
                end = points[i][1];
            }
        }

        totalpeopleblocked += end - start + 1;
        
        System.out.println(totalpeopleblocked);
    }
}
