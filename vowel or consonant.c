#include <stdio.h>
void main()
{
    char word;
    printf("\n enter word : ");
    scanf("%c",&word);
    switch(word)
    {
        case 'a':
        case 'A':
        case 'e':
        case 'E':
        case 'i':
        case 'I':
        case 'o':
        case 'O':
        case 'u':
        case 'U':
        printf("\n The %c is an vowel",word);
        break;
        default :
        printf("\n The %c is consonent",word);
    }
}
