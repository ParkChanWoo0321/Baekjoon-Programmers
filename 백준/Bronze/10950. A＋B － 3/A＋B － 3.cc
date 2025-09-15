#include <iostream>
using namespace std;
int main(void)
{
    int count, a, b, i, j;
    cin >> count;
    int c[256];
    for (i = 0; i < count; i++)
    {
        cin >> a >> b;
        c[i] = a + b;
    }
    for (j = 0; j < count; j++)
    {
        cout << c[j]<<endl;
    }
}