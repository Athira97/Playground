#include<stdio.h>
int main()
{
  //fill the code
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){
  	scanf("%d ",&a[i]);
  }
  int largest=a[0];
  for(int i=1;i<n;i++){
    	if(largest<a[i]){
        	largest=a[i];
        }
   }
  printf("%d",largest);
  return 0;
}