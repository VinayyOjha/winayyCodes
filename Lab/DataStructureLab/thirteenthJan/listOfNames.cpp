#include <iostream>
#include <algorithm>
using namespace std;

string* mergeSortArray(string *listOfNames, int size){
    if (size == 1) return listOfNames;

    int mid = size/2;
    string *left = mergeSortArray(listOfNames, mid);
    string *right = mergeSortArray(listOfNames + mid, size - mid);
    // Merging logic should be added here
    // For now, just returning the left part for simplicity
    return merge(left, right);
}

string* merge(string* first, string* second){
        string* mix = new string[first->size() + second->size()];

        int i = 0, j=0, k=0;
        
        while (i < first->size() && j < second->size()) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            }

            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first->size()) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second->size()) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

int main(){
    int size;
    cout << "Enter size:"; cin >> size;
    string *listOfNames = new string[size];
    for (int i = 0; i < size; i++){
        cin >> listOfNames[i];
    }

    // sort(listOfNames, listOfNames + listOfNames->size());
    string *sortedNames = mergeSortArray(listOfNames, size);
    for (int i = 0; i < size; i++){
        cout << sortedNames[i] << endl;
    }
    delete[] listOfNames;
    delete[] sortedNames; 
}
