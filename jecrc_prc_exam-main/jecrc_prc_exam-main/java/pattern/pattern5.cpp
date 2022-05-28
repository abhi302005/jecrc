#include <iostream>
#include <conio.h>

using namespace std;

int main(int argc, char const *argv[])
{
    int len = 5;
    for (int i = 1; i <= len; i++)
    {
        for (int j = 1; j <= len; j++)
        {
            if (j <= len - i)
            {
                cout << " ";
            }
            else
            {
                cout << "*";
            }
        }
        cout << endl;
    }
    return 0;
}
