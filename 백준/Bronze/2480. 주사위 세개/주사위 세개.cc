#include <iostream>
using namespace std;
int main(void)
{
    int a, b, c;
    cin >> a >> b >> c;
    if (a == b && b == c) { cout << 10000 + a * 1000 << endl; }
    else if (a == b && b != c) { cout << 1000 + a * 100 << endl; }
    else if (b == c && a != c) { cout << 1000 + b * 100 << endl; }
    else if (a == c && a != b) { cout << 1000 + c * 100 << endl; }
    else if (a > b && b > c) { cout << a * 100 << endl; }
    else if (a > c && c > b) { cout << a * 100 << endl; }
    else if (b > a && a > c) { cout << b * 100 << endl; }
    else if (b > c && c > a) { cout << b * 100 << endl; }
    else if (c > a && a > b) { cout << c * 100 << endl; }
    else if (c > b && b > a) { cout << c * 100 << endl; }
}