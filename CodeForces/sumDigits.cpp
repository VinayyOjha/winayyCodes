#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int n;
    string A;
    int sum = 0;

    cin>>n;
    cin >> A;

    for (char digit : A){
        sum += (digit - '0');
    }

    cout<<sum<<endl;
    return 0;
}
