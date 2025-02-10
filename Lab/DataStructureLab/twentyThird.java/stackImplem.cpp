#include <iostream>
using namespace std;

struct Stack{
    int size;
    int top = -1;
    int *arr;

    void push(int val){
        if (top == size - 1) {
            cout << "Stack Overflow!\n";
            return;
        }
        top++;
        arr[top] = val;
    }

    void pop() {
        if (top == -1) {
            cout << "Stack Underflow!\n";
            return;
        }
        int item = arr[top];
        top--;
        cout << "Popped element is: " << item << endl;
    }
    
    void display(){
        for(int i = top; i >= 0; i--){
            cout << arr[i] << " ";
        }
    }

    int peek(){
        if (top == -1) return -1;
        return arr[top];
    }

    void isEmpty(){
        if (top == -1) cout << "The Stack is empty!\n" ;
    }
    
    void isFull(){
        if (top == size) cout<< "The Stack is full!\n";
    }
};

int main(){
    Stack s;
    s.size = 10;
    s.top = -1;
    s.arr = new int[s.size];

    // s.isFull();
    s.push(20);
    s.push(40);
    s.push(30);
    // s.push(28);
    s.pop();
    // s.push(0);
    // s.pop();
    // s.isEmpty();
    // s.push(2);
    // s.push(14);
    // s.push(90);
    // s.display();
    s.peek();
    s.pop();
    s.pop();
    s.pop();
    return 0;
}

// int mul(int a, int b){ return a * b;}
// int divi(int a, int b){ return a / b;}
// int add(int a, int b){ return a + b;}
// int sub(int a, int b){ return a - b;}

// bool operand (char c){return (c >= '0' || c <= '9');}

// class Stack{
//     int top;
//     int size;
//     int* arr;

//     public:
//         Stack(int a){
//         top = -1;
//         size = a;
//         arr = new int[a];
//     }

//     void push(int el){
//         if (top == size - 1){
//             cout << "Stack Overflow!";
//             return;
//         }
//         arr[++top] = el;
//     }

//     int pop(){
//         if (top == -1){
//             return -1;
//         }
//         return arr[top--];
//     }

//     int peek(){
//         if (top == -1) return -1;
//         return arr[top];
//     }

//     int topEl(){
//         return arr[top];
//     }
// };

// int postfixEvaluation(Stack &s, string str){
//     int n = str.length();
//     int i = 0; int res;

//     while (i < n){
//         if (operand(str[i])) s.push(str[i] - '0');
//         else{
//             int a = s.pop();
//             int b = s.pop();
//             cout << "A = " << a << " " << "B = " << b;
//             if (str[i] == '*') res = mul(b, a);
//             if (str[i] == '/') res = divi(b, a);
//             if (str[i] == '+') res = add(b, a);
//             else res = sub(b, a);

//         }
//         cout << res << endl;
//         s.push(res);
//         i++;
//     }

//     return s.topEl();
// }


// int main(){
//     string str  = "";
//     cout << "Enter the postfix expressiom: " << endl;
//     getline(cin, str);

//     Stack s(10);
//     cout << "The result of the given expression is:" << postfixEvaluation(s, str);
//     return 0;
// }