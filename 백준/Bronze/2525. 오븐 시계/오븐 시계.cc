#include <iostream>
using namespace std;
int main(void)
{
    int h,m,plus,hplus,hour,minute;
    cin>>h>>m;
    cin>>plus;
    hplus=(m+plus)/60;
    if((m+plus)%60==0)
    {
        minute=0;
    }
    else
    {
        minute=(m+plus)%60;
    }
    if((h+hplus)%24==0)
    {
        hour=0;
    }
    else
    {
        hour=(h+hplus)%24;
    }
    cout<<hour<<" "<<minute<<endl;
}