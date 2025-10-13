#include <iostream>
using namespace std;
int main(void)
{
    int b[1024] = { 0 };
    int c[1024] = { 0 };
    int i = 0;
    while (1)
    {
        cin >> b[i] >> c[i];
        if (b[i] + c[i] == 0)
        {
            break;
        }
        i++;
    }
    i = 0;
    while (1)
    {
        if (b[i] + c[i] == 0)
        {
            break;
        }
        cout << b[i] + c[i] << endl;
        i++;
    }
}