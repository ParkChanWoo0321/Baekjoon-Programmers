#include <iostream>
using namespace std;
int main()
{
    int h,m;
    cin>>h>>m;
   if(h==0&&m<45)
   {
       cout<<"23 "<<60-(45-m)<<endl;        
   }
   else
   {
       if(m<45)
           cout<<h-1<<" "<<60-(45-m)<<endl;
       else
           cout<<h<<" "<<m-45<<endl;
   }
}