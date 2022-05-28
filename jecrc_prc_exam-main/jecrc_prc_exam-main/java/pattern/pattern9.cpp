#include <iostream>
#include <conio.h>

using namespace std;
/* 
    1
   212
  32123
 4321234
543212345 */
int main(int argc, char const *argv[])
{
    int n = 5;
    for (int i = 1; i <= n; i++)
    {
        // space
        for (int j = (n - i); j >= 1; j--)
        {
            cout << " ";
        }
        // for right side
        for (int j = i; j >= 1; j--)
        {
            cout << j;
        }
        // left side
        for (int j = 2; j <= i; j++)
        {
            cout << j;
        }
        cout << endl;
    }
    return 0;
}
