#include <iostream>
using namespace std;
int main(void)
{
    int a[42]={0,};
    int b;
    int j=0;
    for(int i=0;i<10;i++)
    {
        cin>>b;
        a[b%42]++;
    }
    for(int i=0;i<42;i++){
        if(a[i]!=0){
            j++;
        }
    }
    cout<<j<<endl;
}