#include<iostream>
#include<vector>
#include<math.h>
using namespace std;
int main(){
    int n=17;
    vector<int> dp(n+1);
    for(int i=1;i<=9&&i<dp.size();i++){
        dp[i]=1;
    }
    for(int i=1;i<=n;i++){
        int x=i;
        while(x>0){
            int t=x%10;
            if(t==0) continue;
            dp[i]=min(dp[i],1+dp[i-t]);
            cout<<"**";
            x=x/10;
        }
    }
    cout<<dp[n];
    return 0;
}