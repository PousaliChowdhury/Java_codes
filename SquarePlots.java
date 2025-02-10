package Ac;
// CEO buys plots find out which plots are square shapes

import java.util.*;

public class SquarePlots {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int area[] = new int[n];

        for(int i=0; i<n; i++){
            area[i] = s.nextInt();
        }

        int count = 0;

        for(int i=0; i<area.length; i++){
            double sqrt = Math.sqrt(area[i]);
            if(sqrt == Math.floor(sqrt)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
