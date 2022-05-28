#include<iostream>
#include<conio.h>
#include<stdlib.h>


using namespace std;

// declaring the variable
main(){
int a[10];

// taking the input
for(int i=0; i<10; i++ ){
	cin>> a[i];
}
for(int i = 0; i<10; i++){
	cout << a[i];
}
// searching
int value;
cin>> value;
for( int i=0; i<10;i++){
if(a[i]== value){
	cout<< "location"<< i<< "\tvalue"<< a[i];
	break;
}	else{
	continue;
}
}
}

