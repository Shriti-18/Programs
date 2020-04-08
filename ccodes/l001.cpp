#include<iostream>
#include<stdio.h>

using namespace std;

void printIncreasing(int a,int b){
    if(a==b+1)
    return;
    cout<<a<<" ";
    printIncreasing(a+1,b);
   
}
void printIncDec(int a,int b){
    if(a==b+1)
    return ;

    if(a%2==0)
    cout<<a<<" ";

    printIncDec(a+1,b);
    
    if(a%2!=0)
    cout<<a<<" ";

}
void solve(){
    int a,b;
    cin>>a>>b;
   // printIncreasing(a,b);
   printIncDec(a,b);
}

int main(){
    solve();
    return 0;
}