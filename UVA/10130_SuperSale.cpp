#include <bits/stdc++.h>
using namespace std;
int P[101];
int W[31];
int MW[101];
int mem[1001][101];
int noOfItems;
int superSale(int i,int rem,int currentPerson)
{
	if(i==noOfItems || rem==0)
		return 0;

	int choice1;
	int choice2=0;
	int result;
	if(mem[i][rem]!=-1)
		return mem[i][rem];

	if(W[i]>rem)
	//leave this item
		result=superSale(i+1,rem,currentPerson);
	

	if(W[i]<=rem)
	{
		choice1=superSale(i+1,rem,currentPerson);
		choice2=superSale(i+1,(rem-W[i]),currentPerson)+P[i];
		result=max(choice1,choice2);
		mem[i][rem]=result;
	}
	
	return result;
}

int main()
{
	int t;
	int N;
	int G;
	int sum;
	cin>>t;
	for(int i=0;i<t;i++)
	{
		memset(P,-1,sizeof(P)/sizeof(P[0]));
		memset(W,-1,sizeof(W)/sizeof(W[0]));
		memset(MW,-1,(sizeof(MW)/sizeof(MW[0])));
		memset(mem,-1,(sizeof(mem)));
		sum=0;
		cin>>N;
		noOfItems=N;
		for(int j=0;j<N;j++)
			cin>>P[j]>>W[j];
		cin>>G;
		for(int j=0;j<G;j++)
			cin>>MW[j];
		for(int j=0;j<G;j++)
			sum+=superSale(0,MW[j],j);
		cout<<sum<<endl;
	}
}
