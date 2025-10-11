#include <iostream>
using namespace std;
int main(void)
{
    int a;
    int b[256] = {0};
    int c[256] = { 0 };
    cin >> a;
    for (int i = 0; i < a; i++)
    {
        cin >> b[i] >> c[i];
    }
    for (int j = 0; j < a; j++)
    {
        cout << "Case #" << j + 1 << ": " << b[j]+c[j] << endl;
    }
}