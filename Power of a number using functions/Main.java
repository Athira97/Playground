#include<stdio.h>
#include <math.h>
int power(int b, int e){
	int power=pow(b,e);
  return power;
}

int main(){
    // Type your code here
  int b,e;
  scanf("%d%d",&b,&e);
  int pow=power(b,e);
  printf("%d",pow);              
  	return 0;
}