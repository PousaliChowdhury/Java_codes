// Next Smaller Number
// NOTE* - Search the whole array find the next smaller number and print it, if there is no smaller number after this then print -1

import java.util.*;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        Stack<Integer> s = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] output = new int[n];

        for(int i=n-1; i>=0; i--){
            int x = arr[i];
            if ((n==0))
                return;
            if(s.size()>0 && x<s.peek())
                s.pop();
             if(s.size() == 0)
                output[i] = -1;
            else if(s.size() > 0)
                output[i] = s.peek();
            s.push(x);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(output[i] + " ");
        }
        
    }
}
