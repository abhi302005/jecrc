#include<iostream>
#include<conio.h>
#include<stdlib.h>
//#include<stdio.h>

using namespace std;

main(){
	int a[10];
	for (int i = 0; i<10; i++){
	cin>> a[i];
	}
	cout << "enter the vlaue for search\t";
	int value;
	cin>> value;
	
	int mid =(0+10)/2;
	cout <<"mid "<< mid;
	if(value < mid){
		for(int i = 0; i<mid; i++){
			if(a[i]== value){
			cout<< "location "<< i<< "\tvalue "<< a[i];
			break;
			}
		}
	} else if (value > mid){
		for(int i = mid+1; i<10; i++){
			if(a[i]== value){
			cout<< "location "<< i<< "\tvalue "<< a[i];
			break;
			}
		}
	} else if (value == a[mid]){
		cout<< "location "<< mid<< "\tvalue "<< a[mid];
	}else{
				cout<< "\nvalue not found";
	}
	
}
