#include <iostream>
using namespace std;
int main(void)
{
    int a[9];
    int max=0;
    int maxindex=0;
    for(int i=0;i<9;i++)
    {
        cin>>a[i];
        if(a[i]>max){
            max=a[i];
            maxindex=i+1;
        }
    }
    cout<<max<<endl;
    cout<<maxindex;
}