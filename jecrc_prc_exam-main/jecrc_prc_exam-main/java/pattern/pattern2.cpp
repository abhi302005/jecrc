#include <iostream>
#include <conio.h>

using namespace std;
/*
****
*  *
*  *
*  *
**** */
int main(int argc, char const *argv[])
{
    /* hollow rectangle */
    int row, col;
    cout << "enter the number of row and column\n";
    cin >> row >> col;
    for (int i = 1; i <= row; i++)
    {
        for (int j = 1; j <= col; j++)
        {
            if (i == row || i == 1 || j == 1 || j == col)
                cout << "*";
            else
                cout << " ";
        }
        cout << endl;
    }
    return 0;
}
