#include<iostream>
#include<conio.h>
#include<vector>

using namespace std;

vector<vector<char>>maze={{'S','0','0','0'},
                            {'0','0','0','0'},
                            {'0','0','0','E'}};

bool checkValid(int i,int j){
    if(maze[i][j]=='0' && i<3 && j<4)
    {
        maze[i][j]='1';
        return true;
    }
    else
    {
        return false;
    }
}

void FindPath(int si,int sj,int ei,int ej){
    if((si==ei) && (sj==ej)){
        cout<<"("<<si<<","<<sj<<") -> ";
        return;
    }
    cout<<"("<<si<<","<<sj<<") -> ";
    if(checkValid(si+1,sj))
        FindPath(si+1,sj,ei,ej);
    if(checkValid(si,sj+1))
        FindPath(si,sj+1,ei,ej);

}
vector<string> mazepath_HVD_01(int sr,int sc,int er,int ec){

    if(sr==er && sc==ec)
    {
        vector<string> base;
        base.push_back("");
        return base;
    }

    if(sc+1<=ec){
        count+=mazepath_HVD_01
    }
    if(sr+1<=er){

    }

}
 
void solve(){
    
    int sr=0, sc=0, er=2,ec=2;
    vector<string>ans;
    ans=mazepath_HVD_01(sr,sc,er,ec);
    //ans=mazepath_HBD_01(sr,sc,er,ec);

}

int main(){

    solve();
    return 0;

}
