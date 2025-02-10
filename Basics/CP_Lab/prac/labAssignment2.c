
#include <stdio.h>
#include <math.h>
void calMin(int arr[]);
void calMax(int arr[]);
void calSumAndAverage(arr);
void calFactorial(n);
void checkPrime(n);
calBinary(n);
calGCD_LCM(number1, number2);

int main() {
    // Write C code here
    int arr[2] = {2, 4};
    int n = 4;
    
    calMin(arr);
    calMax(arr);
    calSumAndAverage(arr);
    calFactorial(n);
    checkPrime(n);
    calGCD_LCM(52, 10);
    return 0;
}

// Function to calculate minimum number int the aray
void calMin(int arr[]){
    int min = arr[0];
    int i;
    
    for(i = 1; i < 2; i++){
        if(arr[i] < min) min = arr[i];
    }
    printf("The minimum number in the array is: %d", min);
}

// Function to calculate maximum number int the aray
void calMax(int arr[]){
    int max = arr[0];
    int i;
    
    for(i = 1; i < 2; i++){
        if(arr[i] > max) max = arr[i];
    }
    printf("\nThe maximum number in the array is: %d", max);
}

// Function to calculate sum and average of numbers
void calSumAndAverage(int arr[]){
    float average = 0;
    int sum = 0;
    int i; int j;
    // float array[11];
    
    for(j = 0; j < 2; j++){
        sum += arr[j];
    }
    
    average = ((float)sum) / 2;
    printf("\nThe sum and average of the given array is %d and %f", sum, average);
}

// Function to calculate factorial of numbers
void calFactorial(int n){
    int i;
    int ans = 1;
    for(i = n; i > 0; i--){
        ans *= i; 
    }
    printf("\nThe factorial of %d is %d ", n, ans);
}

// Function to check prime or not
void checkPrime(int n){
    int count = 0;
    int i;
    
    for(i = 2; i <= sqrt(n); i++){
        if((n % i) == 0) count += 1; break;
    }
    
    if(count == 0) printf("\nPrime!");
    if(count == 1) printf("\nNot Prime!");
}

// Function to calculate binary of a decimal number
void calBinary(int n){
    int arr[6] = {0, 0, 0, 0, 0, 0};
    int i;
    int a = sizeof(arr) / sizeof(arr[0])
    while(n != 1){
        int value = n % 2;
        arr[i] = value;
        n /= 2;
    }
    printf("The binary equivalnet o fthe given number is : ");
    for(i = a; i >= 0; i--){
        printf("%d", arr[i]);
    }
}

void calGCD_LCM(int number1, int number2){
    int gcd = 1;
    while(number1 > 0 && number2 > 0){
        if (number1 > number2) number1 = number1 % number2;
        else number2 = number2 % number1;
    }

    if(number1 == 0) {
        gcd = number2;
        printf("The GCD of the two numbers is %d ", number2);
    }
    else {
        gcd = number1;
        printf("The GCD of the two numbers is %d ", number2);
    }

    printf("The LCM of the two numbers is %d ", ((number1 * number2) / gcd));
}