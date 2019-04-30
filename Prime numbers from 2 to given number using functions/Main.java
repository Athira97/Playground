#include<stdio.h>
void prime(int  n){
	for(int i=2;i<=n;i++){
    	for (int j=2; j<=i; j++)   // Changed upper bound
        {
    		if (i == j)  // Changed condition and reversed order of if:s
      printf("%d\n",i);
    else if (i%j == 0)
      break;
    	 
    	}
    }
}
int main(){
    // Type your code here
  int n;
  scanf("%d",&n);
  prime(n);
    return 0;
}
