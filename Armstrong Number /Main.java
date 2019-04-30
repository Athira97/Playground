#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  	int n,count,i,armSum=0;
  	scanf("%d",&n);
  	int temp = n;
  	while(temp>0){
      	temp=temp/10;
      	count++;
    }
  	temp=n;
  	while(n>0){
    	int last = n%10;
      	armSum=armSum+pow(last,count);
      	n=n/10;
    }
  	n=temp;
  	if(n==armSum){
    	printf("Armstrong Number");
    }else{
    	printf("Not an Armstrong Number");
    }
	return 0;
}