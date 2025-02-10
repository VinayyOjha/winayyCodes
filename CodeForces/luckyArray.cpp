#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int n;
    cin>>n;

    int a[n]; int min = INT_MAX;
    for (int i = 0; i < n; i++){
        cin>>a[i];
        if (a[i] < min) min = a[i];
    }

    int count = 0;
    for (int i = 0; i < n; i++){
        if (a[i] == min) count++;
    }
    
    if (count&1 == 1) cout<<"Lucky";
    else cout << "Unlucky";

    return 0;
}
