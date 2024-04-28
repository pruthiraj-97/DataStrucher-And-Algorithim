#include<iostream>
#include<vector>
#include<math.h>
using namespace std;
int main(){
    vector<int> arr={1,2,5};
    int sum=11;
    vector<int> dp(sum+1,1e9);
    dp[0]=0;
    for(int i=1;i<=sum;i++){
        for(int j=0;j<arr.size();j++){
            if(arr[j]<=i){
                dp[i]=min(dp[i],1+dp[i-arr[j]]);
            }
        }
    }
    cout<<dp[sum];
    return 0;
}