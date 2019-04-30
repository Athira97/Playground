#include <stdio.h>
int main() {
	//Type your code
  int n, i, num=1;
  scanf("%d",&n);
  
  for(i=1;i<=n;i++){
  	printf("%d\n",num);
    num=num+2;
  }
	return 0;
}