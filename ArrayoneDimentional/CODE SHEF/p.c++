#include<iostream>
#include<vector>
#include<queue>
#include<string>
using namespace std;
int main(){
     int n,q;
	     cin>>n>>q;
	     string str;
	     cin>>str;
	     int m=1;
	     int count=0;
	     for(int i=0;i<n-1;i++){
	         if(str[i]!=str[i+1]){
	             count++;
	             m=max(m,count);
	             count=0;
	         }else{
	             count++;
	         }
	     }
	     count++;
	     m=max(m,count);
	     char prev=str[n-1];
	     cout<<m<<" ";
	     while(q>0){
	         char ch;
	         cin>>ch;
	         if(ch==prev){
	             count++;
	             m=max(m,count);
	         }else{
	             prev=ch;
	             count=1;
	              m=max(m,count);
	         }
	         cout<<m<<" ";
	         q--;
	     }
	     
    return 0;
}