#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int num,count=0;
  scanf("%d",&num);
  int temp=num;
  while(temp>0){
  temp=temp/10;
    count++;
  }
  int sec = num/pow(10,count-2);
  int secDigit= sec%10;
  printf("%d",secDigit);
	return 0;
}