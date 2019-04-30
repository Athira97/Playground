#include <stdio.h>
int gcd(int i, int j, int k){
	int least;
least = i;
while(!( (i == j) && (j == k) ) )
{
i = (i == 0 ? least : i);
j = (j == 0 ? least : j);
k = (k == 0 ? least : k);
if(i <= j)
{
if(i <= k)
least = i;
else
least = k;
}
else
{
if(j <= k)
least = j;
else
least = k;
}
i = i % least;
j = j % least;
k = k % least;
}
return least;
}

int main() {
	//Type your code here
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  int hcf=gcd(a,b,c);
  printf("%d",hcf);
	return 0;
}