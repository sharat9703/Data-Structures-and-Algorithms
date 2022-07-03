/*You are given an array of integers ARR[] of size N consisting of zeros and ones. You have to select a subset and flip bits of that subset. You have to return the count of maximum one’s that you can obtain by flipping chosen sub-array at most once.
A flip operation is one in which you turn 1 into 0 and 0 into 1.*/





import java.util.*;

import java.lang.Math;
public class SubarrayFlipbitsSum {	
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();//test input
       
        for(int b=0;b<T;b++){
             int N = in.nextInt(); //arry size
           
             int[] ARR = new int[N];
             for(int c=0;c<N;c++){
                 ARR[c] = in.nextInt();// array input 
                                 }
           int t =  flipBits(ARR,N);
           System.out.print(t);
                           }
   }

public static int flipBits(int[] arr, int n) {
            int count=0;
            int cSum=0;
            int Msum = Integer.MIN_VALUE;
            int val=0;
           
       int index_value = search(arr,0);     
             if(index_value == -1){
                 for (int i=0;i<n;i++){
                     if(arr[i]==1){
                         count++;
                     }
                 }
                 return count;
             }
             else {
                    for(int i =0;i<n;i++){ 
                                    
                                if(arr[i]==1){
                                    count++;
                                    val = -1;
                                    }
                                else{
                                    val = 1;
                                }
                                cSum =cSum+ val;
                                Msum = Math.max(Msum,cSum);
                                if(cSum<0){ cSum = 0;}
                                    
                                }
                        if(Msum <0){ return 0;}
                        else
                            return Msum + count;
                 }
        }
    public static int search(int[] array, int key){
          for(int i=0;i<array.length;i++){
              if(array[i]==key){
                  return i;
              }
          }
          return -1;
    }
    
}
