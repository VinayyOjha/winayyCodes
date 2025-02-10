#include <stdio.h>

void main(){
    int n;
    printf("Enter the number of rows: ");
    scanf("%d", &n);
    int i, j;

    for (i = 1; i <= n; i++) //Rows
    {
        for (j = 1; j <= i; j++) // Coloumns and print
        {
            printf(" %d ", j);
        }
        printf("\n");
    }
}