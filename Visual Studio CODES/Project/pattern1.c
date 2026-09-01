#include <stdio.h>
int main()
{
    int size = 9;
    for(int i = 0; i<size-1 ; i++)
    {
        for(int k = size-i-1; k>=0 ; k--)
            printf(" ");
        for(int j = 0; j<=i ; j++)
            printf(" *");
      printf("\n");
    }
    //printf("\n");
    for(int i = 0; i<size ; i++)
    {
        for(int k = 0; k<i ; k++)
            printf(" ");
        for(int j = size-i -1; j>=0 ; j--)
            printf(" *");  
     printf("\n");
    }
    return 0;
}