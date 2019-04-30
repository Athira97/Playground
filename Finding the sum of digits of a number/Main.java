#include <stdio.h>
int main() {
	//Type your code
  int num, sum=0, temp;
  scanf("%d",&num);
  
  while(num>0){
  	temp=num%10;
    num=num/10;
    sum=sum+temp;
  }
  
  printf("%d",sum);
	return 0;
}