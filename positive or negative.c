#include<stdio.h>
void main()
{
    int a;
    printf("enter a number : \n");
    scanf("%d",&a);
    if(a>0)
    printf("number : %d is positive\n",a);
    else if(a<0)
    printf("number : %d is negative\n",a);
    else 
    printf("number : %d is zero\n",a);
}


