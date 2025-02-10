#include <iostream>
using namespace std;

int add(int a, int b){
    return a + b;
}
int sub(int a, int b){
    return a - b;
}

int calc(int a, int b, int (*op)(int,int)){
    return op(a,b);
}
int main(){
    int a = 10, b = 5;

    cout<<calc(a,b,add);
    cout<<calc(a,b,sub);
}

