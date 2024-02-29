#include<iostream>
using namespace std;
void b_sort(int *arr , int n){
    for(int i=0; i<n; i++){
        for(int j=0; j<n-i-1; j++){
            if(arr[j]>arr[j+1]){
                swap(arr[j],arr[j+1]);
            }
        }
    }
}
void swap(int &a, int &b){
    a=a+b;
    b=a-b;
    a=a-b;
}
int main(){
    int size;
    cin>>size;
    int arr[n];
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }
    b_sort(arr,n);
    for(int i=0; i<n; i++){
        cout<<arr[i];
    }
}
