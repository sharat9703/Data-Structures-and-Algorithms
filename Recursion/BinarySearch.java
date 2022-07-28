import java.util.*;

public class BinarySearch{
    public static void main(String[] args) {

    int[] arr = {23,43,54,65,76,87,98,123,134,152,198};
    
    int target1;
    Scanner in = new Scanner(System.in);
    target1 = in.nextInt();
    in.close();
    int bs = BSearch(arr,arr[0],arr[arr.length-1],target1);

    boolean exists = (bs == target1);
    
    System.out.print("does "+target1+" exist?:"+exists);

    }

    public static int BSearch(int[] array, int left_idx, int right_idx,int target) {
        
        if(left_idx>right_idx){
            return -1;
        }
    
        else
        {
         int middle = (left_idx+right_idx)/2;
           if(middle == target){
             return middle;
        }
        
        else if(middle>target){
            return BSearch(array,left_idx,middle-1,target);
        }
        
        else{
        return BSearch(array,middle+1,right_idx,target);
           }
 }
    }
}