#include <iostream>
#include <conio.h>

using namespace std;

int main(int argc, char const *argv[])
{
    int len = 5;
    for (int i = 1; i <= len; i++)
    {
        for (int j = 1; j <= i; j++)
            cout << i;
        cout << endl;
    }
    return 0;
}