#include <stdio.h>
void main()
{
    char word,z,Z,A,a;
    printf("\nenter word : ");
    scanf("%c",&word);
    if((word>='a'&&word<='z')||(word>='A'&&word<='Z'))
    printf("\n %c is an alphabet",word);
    else
    printf("\n %c is not alphabet",word);
}
