#include<bits/stdc++.h>
using namespace std;

int stc[100];
int top = -1;
void push(int a){
    if(top==99) return;
    top++;
    stc[top]=a;
}
int pop(){
    if(top==-1) return 0;
    int a= stc[top];
    top--;
    return a;
}
int Top(){
    if(top==-1) return 0;
    return stc[top];
}
bool isEmpty(){
    return top==-1?true:false;
}
int main(){
    int i,a;
    cout<<"how many elements do you want to insert ? ";
    for (cin>> i;i;i--)
    {
        cin>>a;
        push(a);
    }
    cout<<pop()<<endl;
    cout<<Top()<<endl;
    cout<<isEmpty()<<endl;

    return 0;
}