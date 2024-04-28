#include<iostream>
#include<vector>
#include<queue>
#include<math.h>
#include <climits>
using namespace std;
int solve(int x,int y,int h){
    
}
int main(){
    int n;
    cin>>n;
    int arr[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            cin>>arr[i][j];
        }
    }
    queue<pair<int,int>> q;
    int m=INT_MIN;
    q.push({n-1,0});
    while(q.size()>0){
        int x=q.size();
        int sum=0;
        while(x>0){
            pair<int, int> p = q.front();
            sum+=arr[p.first][p.second];
            q.pop();
            if(x==1){
                if(p.first-1>=0){
                    q.push({p.first-1,p.second});
                }
                if(p.second+1<n){
                    q.push({p.first,p.second+1});
                }
            }else{
                if(p.first-1>=0){
                    q.push({p.first-1,p.second});
                }
            }
            x--;
        }
        m=max(m,sum);
    }
    cout<<m;
    return 0;
    

}