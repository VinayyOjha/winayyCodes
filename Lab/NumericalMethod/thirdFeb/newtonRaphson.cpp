#include <iostream> 
#include <cmath>
#include <stdlib.h>
using namespace std;
float f(float x)
{
    return (x * x * x - 3 * x + 1);
}
float fd(float x)
{
    return (3 * x * x - 3);
}
int main()
{
    int k = 0;
    float x1, x0;
    float tol = 1e-5;
    float f(float x);
    float fd(float x);
    cout << "\nEnter the initial guess x0 ";
    cin >> x0;
    x1 = x0;
    do
    {
        k++;
        x0 = x1;
        x1 = x0 - f(x0) / fd(x0);
    } while (fabs(x1 - x0) > tol);
    cout << "One root is " << x1 << " obtained at " << k << " th iteration ";
}