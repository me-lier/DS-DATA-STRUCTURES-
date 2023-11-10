#include<iostream>
using namespace std;

struct node{
    int data;
    struct node *next;
};

struct node *head=NULL;


void insert(int data){
    struct node *new_node=(struct node*) malloc(sizeof(struct node));
    new_node->data=data;
    new_node->next=NULL;
    if(head==NULL){
        head=new_node;
    }else if(head!=NULL){
        struct node* temp=head;
        while(temp->next!=NULL){
            temp=temp->next;
        }
        temp->next=new_node;
    }
}

void print(){
    struct node* temp=head;
    while(temp!=NULL){
        cout<<temp->data;
        temp=temp->next;
    }
}
int main(){
    int n;
    cin>>n;
    while(n!=0){
        n--;
        int i;
        cin>>i;
        insert(i);
    }
    print();
    
}
