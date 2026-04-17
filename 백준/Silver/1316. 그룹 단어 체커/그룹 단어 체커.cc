#include <iostream>
#include <string>
using namespace std;
int main() {
    int n;
    cin >> n;
    int count = 0;
    while (n--) {
        string s;
        cin >> s;
        bool seen[26] = {false};
        char prev = 0;
        bool ok = true;
        for (char cur : s) {
            if (cur != prev) {
                if (seen[cur - 'a']) {
                    ok = false;
                    break;
                }
                seen[cur - 'a'] = true;
            }
            prev = cur;
        }
        if (ok) count++;
    }
    cout << count;
}