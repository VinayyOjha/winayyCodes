// Cpp program to accept and print 1D array using pointer.
#include <iostream>
using namespace std;

int main(){
    int a[10] = {0};
    int size = -1;
    int *ptr = a;

    cout << "Enter the size of the array: ";
    cin >> size;

    for(int i = 0; i < size; i++){
        // cout << "Enter the element " << i << ": ";
        cin >> *(ptr + i);
    }

    for (int i = 0; i < size; i++){
        cout << *(ptr+i) << " ";
    }

    return 0;
}