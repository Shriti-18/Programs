#include<iostream>
#include<stdio.h>
using namespace std;

int main(){
    for(int i=0;i<10;i++)
    {
        cout<<"\n";
        for(int j=0;j<i;j++)
        cout<<"* ";
    }


    cout<<endl;
    system("pause");
    return 0;
}