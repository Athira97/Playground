#include<stdio.h>
int sonums(int n){
	int sum=0;
  for(int i=1;i<=n;i++){
  	sum=sum+i;
  }
  return sum;
}
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
  int sum=sonums(n);
  printf("%d",sum);
  	return 0;
}