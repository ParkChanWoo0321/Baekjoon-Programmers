#include <iostream>
#include <cstring>
using namespace std;
int main(void)
{
    char a[1000000];
    int b = 0;
    cin.getline(a, 1000001);
    int c = strlen(a);
    for (int i = 0; i < c; i++)
    {
        if (a[i] == ' ')
        {
            b++;
        }
    }
    if (c == 0) {
        cout << 0 << endl;
        return 0;
    }
    int d = b + 1;
    if (a[0] == ' ') {
        d--;
    }
    if (a[c - 1] == ' ') {
        d--;
    }
    cout << d << endl;
}