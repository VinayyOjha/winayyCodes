#include <stdio.h>

int main(){
    int number;
    printf("ENTER A THREE DIGIT NUMBER: ");
    scanf("%d", &number);

    digitsInWords(number);
}

void digitsInWords(int number){
    int arr[3] = {0, 0, 0};
    int i = 0, j;

    while(number != 0){
        arr[i] = number % 10;
        number /= 10;
        i++;
    }

    for(j = 2; j >= 0; j--){
        if (arr[j] == 0) printf("ZERO ");
        else if (arr[j] == 1) printf("ONE ");
        else if (arr[j] == 2) printf("TWO ");
        else if (arr[j] == 4) printf("FOUR ");
        else if (arr[j] == 5) printf("FIVE ");
        else if (arr[j] == 3) printf("THREE ");
        else if (arr[j] == 6) printf("SIX ");
        else if (arr[j] == 7) printf("SEVEN ");
        else if (arr[j] == 9) printf("NINE ");
        if (arr[j] == 8) printf("EIGHT ");
    }
}