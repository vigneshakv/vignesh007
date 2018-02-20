#include <stdio.h>
void main()
{int a,b,c,larger=0;printf("\n enter 3 numbers : ");scanf("%d%d%d",&a,&b,&c);larger=a;if(b>larger)larger=b;if(c>larger)larger=c;printf("\nThe larger number is %d",larger);}
