#include <iostream>

int sum(int x, int y) { return x + y; }
int sub(int x, int y) { return x - y; }
int mult(int x, int y) { return x * y; }
int divi(int x, int y) { if (y != 0) return x / y; else return 0; }

int main() {
    int (*ope[4])(int, int); // Define an array of function pointers
    ope[0] = sum;
    ope[1] = sub;
    ope[2] = mult;
    ope[3] = divi;

    int x, y, choice, result;
    printf("Enter two integer numbers: ");
    scanf("%d %d", &x, &y);
    printf("Enter 0 to sum, 1 to subtract, 2 to multiply, or 3 to divide: ");
    scanf("%d", &choice);
    result = ope[choice](x, y);
    printf("%d", result);
    return 0;
}