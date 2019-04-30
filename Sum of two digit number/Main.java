#include<stdio.h>
int main()
{
  //Type your code here
  int num;
  scanf("\n%d",&num);
  int f=num/10;
  int s= num%10;
  printf("%d",f+s);
  return 0;
}