// Program to print sum of array using pointers.
#include <iostream>
using namespace std;

int main(){
    int sum = 0;
    int arr[10];
    int *ptr = arr;
    int size = -1;

    cout << "Enter the size of the array: " << endl;
    cin >> size;

    for(int i = 0; i < size; i++){
        cin >> *(ptr + i);
        sum += *(ptr + i);
    }

    cout << "The sum is: " << sum;

    return 0;
}