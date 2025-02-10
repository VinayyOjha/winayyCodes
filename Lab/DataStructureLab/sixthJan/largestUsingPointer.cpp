// Program to find the largest number using pointer.
#include <iostream>
using namespace std;

int main(){
    int a[10] = {0};
    int size = -1;
    int *ptr = a;
    int largest = -1;

    cout << "Enter the size of the array: ";
    cin >> size;

    for(int i = 0; i < size; i++){
        cin >> *(ptr + i);
    }

    largest = *ptr;
    for(int i = 0; i < size; i++){
        if(*(ptr + i) > largest){
            largest = *(ptr + i);
        }
    }

    cout << "The largest number is: " << largest << endl;

    return 0;
}