#include <iostream>
using namespace std;
int main(void)
{
    int N;
    char a[101];
    int total=0;
    cin>>N;
    cin>>a;
    for(int i=0;i<N;i++)
    {
        total+=(a[i]-'0');
    }
    cout<<total<<endl;
}