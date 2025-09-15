#include <iostream>
using namespace std;
int main(void)
{
    int money,count,money1,count1,i;
    int allmoney=0;
    cin>>money;
    cin>>count;
    for(i=0;i<count;i++)
    {
        cin>>money1>>count1;
        allmoney+=(money1*count1);
    }
    if(allmoney==money)
    {
        cout<<"Yes"<<endl;
    }
    else
    {
        cout<<"No"<<endl;
    }
}