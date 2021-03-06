
/*Problem statement:
You have been given a vector/list 'ARR' consisting of ‘N’ integers. You are also given a positive integer ‘K’.
Let’s define a vector/list 'CONCAT' of size 'N * K' formed by concatenating 'ARR' ‘K’ times. For example, if 'ARR' = [0, -1, 2] and 'K' = 3, then 'CONCAT' is given by [0, -1, 2, 0, -1, 2, 0, -1, 2].
Your task is to find the maximum possible sum of any non-empty subarray (contagious) of 'CONCAT'.
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Integer;
import java.lang.Math;

public class MaxSubSumKConcaten {
    /*
     * @param args
     */
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            int T = in.nextInt();//test input
      
            for(int b=0;b<T;b++){
                 int N = in.nextInt(); //arry size
                 int K = in.nextInt();  //how many times to concat
                 int c;
                 
                 ArrayList<Integer> ARR = new ArrayList<Integer>(N);

                 for(c=0;c<N;c++){
                    int d= in.nextInt();

                     ARR.add(c, d); // array input 
                     
                    }
   System.out.print(maxSubSumKConcat(ARR,N,K));
}
        }


    }
    public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
		int[] Concat = new int[n*k];
        
        for(int i=0;i<k;i++){
        
            for(int j=0;j<n;j++){
              int p = arr.get(j);
                Concat[j] =p;
                } 
        }
        int Csum =0;
        int Msum =Integer.MIN_VALUE;
       
        for(int c=0;c < Concat.length;c++){
            Csum = Csum+ Concat[c%n];
            Msum = Math.max(Msum,Csum);
            if(Csum <0){
                Csum = 0;
            }
        }
        if(Msum<0){return 0;}
        else 
            return Msum;
	}
    

}
