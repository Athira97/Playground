#include<stdio.h>
int main()
{
  //Type your code here
  int n,elem1,elem2;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){
  	scanf("%d",&a[i]);
  }
  scanf("%d",&elem1);
  scanf("%d",&elem2);
  int flag1=0,flag2=0;
  for(int i=0;i<n;i++){
  	if(elem1==a[i]){
    	printf("%d\n",i);
      	flag1=1;
      break;
    }
  }
  for(int i=0;i<n;i++){
  	if(elem2==a[i]){
    	printf("%d\n",i);
      	flag2=1;
      break;
    }
  }
  if(flag1==0){
    printf("%d\n",-1);
  }
  if(flag2==0){
    printf("%d\n",-1);
  }
  
  
  return 0;
}