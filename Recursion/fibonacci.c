#include <stdio.h>


int main(){
    
printf("Enter the element to be found:\n");

int g;
scanf("\n%d",&g);

int fibonacci = fib(g);

printf("\n%d th element is:\n%d",g,fibonacci);
/*int arr[100];

for(int i=0;i<g+1;i++){     ///to print all the elements of the fibonacci seriess
    arr[i]= fib(i);
}
for (int i = 0; i < g+1; i++)
{
  printf("\nFibonacci series %dth element :%d",i,arr[i]); */
//}


return 0;
}

int fib(int k){
    if(k<=1){
    return k;
    }
    else if (k>1)
    {
        return fib(k-1)+fib(k-2);
    }
    else
    return -1;  
}