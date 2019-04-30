#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int num, count=0;
  scanf("%d",&num);
  
  int lastDig=num%10;
  int temp = num;
  while(temp>0){
  	temp=temp/10;
    count++;
  }
 double firstDig = num/pow(10,count-1);
  
  int sum= firstDig+lastDig;
  printf("%d",sum);
	return 0;
}