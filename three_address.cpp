#include <iostream>
#include <string>

using namespace std;
// a = b + c * d

int main() {
    string a = "a";
    string b = "b";
    string c = "c";
    string d = "d";
    string temp1 = "t1";
    string temp2 = "t2";

    // Generating three address code
    cout << temp1 << " = " << c << " * " << d << endl;
    cout << temp2 << " = " << b << " + " << temp1 << endl;
    cout << a << " = " << temp2 << endl;

    return 0;
}
