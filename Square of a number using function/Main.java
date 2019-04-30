#include<stdio.h>
int square(int n){
	int res = n*n;
  	return res;
}
int main() {
   // Type your code here
  int n;
  scanf("%d",&n);
  int result=square(n);
  printf("%d",result);
   return 0;
}