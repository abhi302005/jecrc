#include <iostream>
#include <conio.h>

using namespace std;

int main(int argc, char const *argv[])
{
    /* inverted half pyramid */
    int len = 5;
    for (int i = len; i >= 1; i--)
    {
        for (int j = i; j >= 1; j--)
        {
            cout << "*";
        }
        cout << endl;
    }

    return 0;
}
