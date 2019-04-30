#include <stdio.h>
int main() {
	//Type your code
  	int n,Str=0,i;
  	scanf("%d",&n);
  	int temp=n;
  	while(n>0){
    	int last = n%10;
      	int fact=1;
      	for(i=1;i<=last;i++){
        	fact = fact*i;
        }
      	Str=Str+fact;
      	n=n/10;
    }
  n=temp;
  if(n==Str){
  	printf("Yes");
  }else{
  	printf("No");
  }
	return 0;
}