#include <stdio.h>
int main() {
	// Type your code here
  int n;
	scanf("%d", &n);
  int num=1;
	for(int i = 1; i <= n; i++){
	    for(int space = 1; space <= n - i; space++){
	         printf(" ");
	    }
	    for(int j = 1; j <= i; j++){
	        printf("%d ",num);
          num++;
	    }
	     printf("\n");
	}
	return 0;
}