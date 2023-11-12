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

void insertathead(int data){
    struct node *new_node=(struct node*) malloc(sizeof(struct node));
    new_node->next=head;
    new_node->data=data;
    head=new_node;
}

void insertatpos(int k, int data){
    struct node *new_node=(struct node*) malloc(sizeof(struct node));
    new_node->data=data;
    struct node *temp=head;
    while(temp!=NULL && k!=0){
        temp=temp->next;
        k--;
    }
    struct node *temp1=temp->next;
    new_node->next=temp1;
    temp->next=new_node;
}

void deleteathead(){
    struct node *temp=head;
    temp=temp->next;
    head=temp;
}

void deleteatpos(int k){
    struct node *temp=head;
    k=k-2;
    while(temp!=NULL && k!=0){
        temp=temp->next;
        k--;
    }
    struct node *temp1=temp->next;
    temp->next=temp1->next;
}

void deletealter(){
    struct node *curr=head;
    while(curr!=NULL && curr->next!=NULL){
        struct node *temp=curr->next;
        curr->next=curr->next->next;
        free(temp);
        curr=curr->next;
    }
}

void updateat(int k, int data){
    struct node *temp=head;
    while(temp!=NULL && k!=0){
        temp=temp->next;
        k--;
    }
    temp->data=data;
}

void deletedupl(){
    struct node *temp=head;
    while(temp!=NULL){
        while(temp->next && temp->data==temp->next->data){
            struct node *temp1=temp->next;
            temp->next=temp->next->next;
            free(temp1);
        }
        temp=temp->next;
    }
}

void reverse(){
    struct node *prevptr=NULL;
    struct node *curr=head;
    while(curr!=NULL){
        struct node *nextptr=curr->next;
        curr->next=prevptr;
        prevptr=curr;
        curr=nextptr;
    }
    head=prevptr;

}

struct node* reverserecurr(struct node *head){
    struct node *temp=reverserecurr(head->next);
    temp->next->next=head;
    temp->next=NULL;
    return temp;
}

void print(){
    struct node* temp=head;
    while(temp!=NULL){
        cout<<temp->data;
        temp=temp->next;
    }
    cout<<"\n";
}

void reverseprint(struct node *head){
    if(head==NULL) return;
    
    reverseprint(head->next);
    cout<<head->data;
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
    // insertathead(66);
    // updateat(3,55);

    print();

    // deleteathead();
    // insertatpos(2,99);
    // deleteatpos(2);
    // deletealter();
    // deletedupl();
    // print();
    // reverseprint(head);
    head=reverserecurr(head);
    print();
    
}
