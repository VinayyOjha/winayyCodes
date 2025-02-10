#include <stdio.h>

long int rec(int number);

int main(){
    int n;

    printf("Enter a number: \n");
    scanf("%d", &n);
    long int a = rec(n);
    printf("\n%d", a);

    return 0;
}

long int rec(int number){
    if (number <= 1) return 1;

    return number * rec(number - 1);
}