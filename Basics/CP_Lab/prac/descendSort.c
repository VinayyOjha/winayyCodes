#include<stdio.h>
void sort(int arr[], int n);
void main(){
    int arr[3] = {3, 18, 21};
    sort(arr , 3);
    return 0;
}

void sort(int arr1[], int n){
    int i, j;
    for (i = 0; i <= n-2; i++){
        for(j = 0; j < n-i-1; j++){
            if (j > i){
                int temp = arr1[i];
                arr1[i] = arr1[j];
                arr1[j] = temp;
            }
        }
    }
}