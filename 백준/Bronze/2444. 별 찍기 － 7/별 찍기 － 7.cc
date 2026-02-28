#include <iostream>
using namespace std;
int main(void)
{
    int a;
    cin >> a;
    for (int i = 0; i < a; i++)
    {
        for (int j = 0; j < a - i - 1; j++)
            cout << " "; 
        for (int j = 0; j < 2 * i + 1; j++)
            cout << "*"; 
        cout << endl;
    } 
    for (int i = a - 2; i >= 0; i--)
    {
        for (int j = 0; j < a - i - 1; j++)
            cout << " "; 
        for (int j = 0; j < 2 * i + 1; j++)
            cout << "*"; 
        if(i != 0)
        cout << endl;
    }
}