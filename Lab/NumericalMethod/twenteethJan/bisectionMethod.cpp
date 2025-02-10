// Program to find the root of the equation using bisection method

#include <iostream>
using namespace std;

double FaFb(float a){
    return (a*a*a - a - 1);
}
int main(){
    double a, b;
    cout << "Enter thē values of the interval: "<< endl;
    cin >> a >> b;
    
    while(true){
        if (FaFb(a) * FaFb(b) < 0){
            break;
        }
        else {
            cout << "Enter the values of a and b :";
            cin >> a >> b;
        }
    }

    while (true){
        if (a == b){
            break;
        }
        int c = (a  + b) / 2;
        
    }
}