// A C++ program to demonstrate STL sort() using 
// our own comparator 
#include<bits/stdc++.h> 
using namespace std; 

// Compares two intervals according to staring times. 
bool compare1(int x, int y) 
{ 
	return (x>y); 
} 

int main() 
{ 
	int arr[] = {1, 4, 2, -1, -10, 3, -5}; 
	int n = sizeof(arr)/sizeof(arr[0]); 

	sort(arr, arr+n, compare1); 
	for (int i=0; i<n; i++) 
		cout << arr[i] <<" ";
	
	return 0; 
} 
