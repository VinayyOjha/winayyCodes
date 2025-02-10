#include<bits/stdc++.h>
using namespace std;
double p(double x){
    return (3*x-1)/(x*x);
}
int main(){
    int k=0; 
    double x1,x0; 
    double eps=1e-5; 
    cout<<"Enter the initial guess x0";
    cin>>x0;
    x1=x0;
    do{
        k++;
        x0=x1;
        x1=p(x0);
    }while(fabs(x1-x0)>eps);
    cout<<" One root is "<<x1<<" obtained at "<<k<<" th iteration ";
}