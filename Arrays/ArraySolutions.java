import java.util.*;

public class ArraySolutions{
    public static void main(String[] args) {
      /*int[] a1 = new int[6];
      int count = 1;
      for(int i=0;i<a1.length;i++){
          a1[i] = count;
          count++;

      }   
      for(int j=0; j<a1.length;j++){
          System.out.println(a1[j]);
      }*/
      //////////////////////////////////
      /*int[][] a2 = new int[3][4];
      int count = 1;
      for(int i=0;i<a2.length;i++){
          for(int j=0;j<a2[i].length;j++){
              a2[i][j] = count;
              count++;
          }
        }
          for(int k=0;k<a2.length;k++){
              for(int l=0;l<a2[k].length;l++){
              System.out.print(a2[k][l]+"      ");
          }
          System.out.println();
        }*/
         /////////////
         
         int a[] = new int[] {2,4,6,8,1,3,5,7,9,0};

         for(int i=0;i<a.length;i++){
             System.out.print(a[i]+"\t");
         }
         //Arrays.sort(a);  quicksort
         System.out.println("\n");
         for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }  

        int indexValue = search(a,8);

        System.out.println("\nindex value  is\t"+indexValue);


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
