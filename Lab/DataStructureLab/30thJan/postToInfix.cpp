// // Program to evaluate a Postfix  expression
#include<iostream>
using namespace std;

#include <iostream>
using namespace std;

class Stack {
    int top;
    int size;
    int* arr;

public:
    Stack(int a) {
        top = -1;
        size = a;
        arr = new int[a];
    }

    void push(int el) {
        if (top == size - 1) {  
            cout << "Stack Overflow!" << endl;
            return;
        }
        arr[++top] = el;
    }

    int pop() {
        if (top == -1) {
            cout << "Stack Underflow!" << endl;
            return -1;  
        }
        return arr[top--];
    }

    int peek() {
        if (top == -1) return -1;
        return arr[top];
    }

    int topEl() {
        if (top == -1) return -1;
        return arr[top];
    }
};


bool operand(char c);
int postfixEvaluation(Stack& s, string str);
int mul(int a, int b);
int divi(int a, int b);
int add(int a, int b);
int sub(int a, int b);

int postfixEvaluation(Stack& s, string str) {
    int n = str.length();
    int res;

    for (int i = 0; i < n; i++) {
        if (operand(str[i])) {
            s.push(str[i] - '0');
        }
        else {
            int a = s.pop();
            int b = s.pop();
            if (a == -1 || b == -1) return -1;  

            if (str[i] == '*') res = mul(b, a); 
            else if (str[i] == ' ') {}
            else if (str[i] == '/') {
                if (a == 0) {
                    cout << "Error: Division by zero!" << endl;
                    return -1;
                }
                res = divi(b, a);
            }
            else if (str[i] == '+') res = add(b, a);
            else res = sub(b, a);

            s.push(res);
        }
    }
    return s.topEl();
}

int mul(int a, int b) { return a * b; }
int divi(int a, int b) { return a / b; }
int add(int a, int b) { return a + b; }
int sub(int a, int b) { return a - b; }

bool operand(char c) {
    return (c >= '0' && c <= '9');
}

int main() {
    string str;
    cout << "Enter the postfix expression: ";
    cin >> str;

    Stack s(10);
    int result = postfixEvaluation(s, str);
    
    if (result != -1)
        cout << "The result of the given expression is: " << result << endl;
    
    return 0;
}
