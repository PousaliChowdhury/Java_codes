package Ac;
import java.util.*;

public class MaxSubarray {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int nums[] = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = s.nextInt();
            }
            
            maxSubArray(nums);
                    }
        
            public static int maxSubArray(int[] nums) {
            int n = nums.length;
    
            int sum = 0;
            int max = Integer.MIN_VALUE; // max = 0 is also fine
    
            for(int i=0; i<n; i++){
                if(sum<0)
                    sum = 0;
    
                sum += nums[i];
                max = Math.max(sum,max);
                
            }
    
            return max;
        }
    
}
