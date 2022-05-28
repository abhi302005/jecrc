#include <iostream>
#include <conio.h>

using namespace std;

int main(int argc, char const *argv[])
{
    /* 
***** *****
****   ****
***     ***
**       **
*         *
*         *
**       **
***     ***
****   ****
***** ***** */
    int n = 5;
    for (int i = 1; i <= n; i++)
    {
        // space
        for (int j = (n - i) + 1; j >= 1; j--)
        {
            cout << "*";
        }
        // for right side
        for (int j = i; j >= 1; j--)
        {

            cout << " ";
        }
        // left side
        for (int j = 2; j <= i; j++)
        {

            cout << " ";
        }
        for (int j = 1; j <= (n - i) + 1; j++)
        {
            cout << "*";
        }

        cout << endl;
    }
    ////////////////////////////////////////
    ////////////////////////////////////////
    for (int i = n; i >= 1; i--)
    {
        // space
        for (int j = (n - i) + 1; j >= 1; j--)
        {
            cout << "*";
        }

        // for right side
        for (int j = i; j >= 1; j--)
        {
            cout << " ";
        }
        // left side
        for (int j = 2; j <= i; j++)
        {
            cout << " ";
        }
        for (int j = 1; j <= (n - i) + 1; j++)
        {
            cout << "*";
        }

        cout << endl;
    }
    return 0;
}
