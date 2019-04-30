#include <stdio.h>
int maxim(int a, int b, int c){
	int max;
  int secMax=a;
  if(a<b){
  	secMax=b;
  }
  if(secMax>c){
  	max=secMax;
  }else{
  	max=c;
  }
  return max;
}

int main(){
	// Type your code here
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  int max=maxim(a,b,c);
  printf("%d",max);
  	return 0;
}