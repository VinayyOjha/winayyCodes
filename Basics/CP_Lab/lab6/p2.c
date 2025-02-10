#include <stdio.h>
int main(){
    int n = 6;
    rec(n, 1, 1);
    
    // printf("Shobit is a handsome boy! \n");
    return 0;
}

void rec(int n, int a , int b){
    if (n == 0) {
        // printf("Sanjay is a handsome boy!\n");
        return;
    }

    int c = a + b;
    if (a == 1 && b == 1){
        printf("%d \n", a); n--;
        printf("%d \n", b); n--;
    }


    printf("c: %d \n", c);
    a = b;
    b = c;

    rec(n-1, a, b);
}