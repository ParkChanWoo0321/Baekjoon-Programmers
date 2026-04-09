#include <iostream>
#include <string>
using namespace std;

int main() {
    string s;
    cin >> s;
    int cnt = 0;
    for (int i = 0; i < s.length(); ) {
        if (i + 2 < s.length() && s.substr(i, 3) == "dz=") {
            cnt++;
            i += 3;
        } else if (i + 1 < s.length() &&
                  (s.substr(i, 2) == "c=" ||
                   s.substr(i, 2) == "c-" ||
                   s.substr(i, 2) == "d-" ||
                   s.substr(i, 2) == "lj" ||
                   s.substr(i, 2) == "nj" ||
                   s.substr(i, 2) == "s=" ||
                   s.substr(i, 2) == "z=")) {
            cnt++;
            i += 2;
        } else {
            cnt++;
            i++;
        }
    }
    cout << cnt;
    return 0;
}