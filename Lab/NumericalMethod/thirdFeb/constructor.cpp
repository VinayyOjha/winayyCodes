#include<iostream>
using namespace std;

class Student{
    private:
        int sId;
        string name;
        string addr;
        string *courses;
    
    public:
        Student(int id, string name, string addr, string courses[]){
            sId = id;
            this->addr = addr;
            this->courses = courses;
        }

        void display(){
            
        }
};

int main(){


    int id; int n;
    int id; string name, addr;
    cout<<"Enter the ID: " <<endl;
    cin >> id;
    cout<<"Enter student name " <<endl;
    cin>>name;
    cout<<"Enter student address: " <<endl;
    cin>>addr;
    cout<<"Number of courses enrolled: " <<endl;
    cin>>n;

    string courses[n];
    for (int i = 0; i < n; i++)
    {
        cin>>courses[i];
    }
    
    Student vinay(id, name, addr, courses);

    return 0;
}