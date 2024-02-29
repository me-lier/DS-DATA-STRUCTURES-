#include<iostream>
using namespace std;
void s_sort(int *arr , int n){
    for(int i=0; i<n-1; i++){
        int min=i;
        for(int j=i+1; j<n; j++){
            if(arr[min]>arr[j]){
                swap(arr[min],arr[j]);
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
    int n;
    cin>>n;
    int arr[n];
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }
    s_sort(arr,n);
    for(int i=0; i<n; i++){
        cout<<arr[i];
    }
}
