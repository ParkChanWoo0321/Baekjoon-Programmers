#include <iostream>
#include <string>
using namespace std;
int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    string s;
    cin >> s;
    bool ok = true;
    int l = 0, r = (int)s.size() - 1;
    while (l < r) {
        if (s[l] != s[r]) {
            ok = false;
            break;
        }
        l++;
        r--;
    }
    cout << (ok ? 1 : 0);
}