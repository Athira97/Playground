#include<stdio.h>
int main()
{
  //Type your code here
  int num;
  scanf("%d",&num);
  int f= num/100;
  int t= num%10;
  int res=f+t;
  printf("%d",res);
  return 0;
}