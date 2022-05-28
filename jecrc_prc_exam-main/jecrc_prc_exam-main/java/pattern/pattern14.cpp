#include <iostream>
#include <conio.h>
using namespace std;

/* 

*        *
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
*        *

 */
int main(int argc, char const *argv[])
{
    int n = 5;
    for (int i = 1; i <= n; i++)
    {
        int empSpc = 2 * n - 2 * i;
        for (int j = 1; j <= i; j++)
        {
            if (j == 1 || j == i)
                cout << "*";
            else
                cout << " ";
        }
        //////////////////////_____space______////////////////////////////
        for (int j = 1; j <= empSpc; j++)
            cout << " ";
        //////////////////////////////////////////////////
        for (int j = 1; j <= i; j++)
        {
            if (j == 1 || j == i)
                cout << "*";
            else
                cout << " ";
        }
        cout << endl;
    }
    /////////////////////////////////////////////////////
    for (int i = n; i >= 1; i--)
    {
        int empSpc = 2 * n - 2 * i;
        for (int j = 1; j <= i; j++)
        {
            if (j == 1 || j == i)
                cout << "*";
            else
                cout << " ";
        }
        //////////////////////_____space______////////////////////////////
        for (int j = 1; j <= empSpc; j++)
            cout << " ";
        //////////////////////////////////////////////////
        for (int j = 1; j <= i; j++)
        {
            if (j == 1 || j == i)
                cout << "*";
            else
                cout << " ";
        }
        cout << endl;
    }
    return 0;
}
