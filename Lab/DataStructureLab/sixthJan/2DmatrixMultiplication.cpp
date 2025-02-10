// Program to execute matrix multiplication
#include <iostream>
using namespace std;

int main(){

    int r1, c1, r2, c2;
    cout << "Enter number of rows and coloumns for matrix1: ";
    cin >> r1 >> c1;
    cout << "Enter number of rows and coloumns for  matrix2: ";
    cin >> r2 >> c2;
 
    double a[r1][c1] = {0};
    *a[3];

    double b[r2][c2];
    *b[3];

    if (c1 != r2) {
        cout << "Multiplication not possible!!";
        return 0;
    }
    double c[r1][c2] = {0};

    cout << "Enter the elements of the first array: " << endl;
    for (int i = 0; i < r1; i++)
    {
        for (int j = 0; j < c1; j++)
        {
            cin >> *(*(a + i) + j);
        }
        
    }
    
    cout << "Enter the elements of the second array: " << endl;
    for (int i = 0; i < r2; i++)
    {
        for (int j = 0; j < c2; j++)
        {
            cin >> *(*(b + i) + j);
        }
        
    }

    cout << "Resultant Matrix: " << endl;
    for (int i = 0; i < r1; i++){
        for (int j = 0 ; j < c2; j++){
            for (int k = 0; k < c1; k++){
                *(*(c + i) + j) += *(*(a + i) + k) * (*(*(b + k) + j));
            }
        }
    } 
    
    for (int i = 0; i < r1; i++){
        for (int j = 0; j < c2; j++){
            cout << *(*(c + i) + j) << " ";
        }
        cout << endl;
    }

    return 0;
}