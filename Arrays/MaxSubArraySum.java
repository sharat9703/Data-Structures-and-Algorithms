//print the max of subarray sum

import java.util.* ;
import java.io.*; 
import java.lang.Math;

public class MaxSubArraySum {
	
	public static long maxSubarraySum(int[] arr, int n) {
       long curSum = 0;
       long MaxSum = Integer.MIN_VALUE;
        for(int i=0; i < n; i++){
          
            curSum = curSum + arr[i];
          
            MaxSum = Math.max(MaxSum, curSum);
            
            if(curSum<0){curSum =0; }
        }

        if(MaxSum <0) {return 0;}
        
        return MaxSum;
	}
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       int N = in.nextInt();
      int[] ARR = new int[N];
       for(int j=0;j<N;j++){
         ARR[j] = in.nextInt();
       }
       
      System.out.println(maxSubarraySum(ARR,N)); 
   }
    
    
}
