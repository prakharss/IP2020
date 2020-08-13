// 1) C++ implementation to merge k sorted linked lists 
// | Using MIN HEAP method 
#include <bits/stdc++.h> 
using namespace std; 

struct Node { 
	int data; 
	struct Node* next; 
}; 

struct compare1 { 
	bool operator()(struct Node* a, struct Node* b) 
	{ 
		return a->data > b->data; 
	} 
}; 

struct Node* mergeKSortedLists(struct Node* arr[], int k) 
{ 
	struct Node *head = NULL, *last; 
	priority_queue<Node*, vector<Node*>, compare1> pq; 
	/*
		priority_queue<int> pq_mx;   //max_heap by default
		priority_queue<int, vector<int> , greater<int> > pq_mn;   //this is the syntax for min heap
	*/
	
	for (int i = 0; i < k; i++) 
		if (arr[i] != NULL) 
			pq.push(arr[i]); 

	while (!pq.empty()) { 
		struct Node* top = pq.top(); 
		pq.pop(); 

		if (top->next != NULL) 
			pq.push(top->next); 

		if (head == NULL) { 
			head = top; 
			last = top; 
		} 

		else { 
			last->next = top; 
			last = top; 
		} 
	} 

	return head; 
} 

void printList(struct Node* head) 
{ 
	while (head != NULL) { 
		cout << head->data << " "; 
		head = head->next; 
	} 
} 

struct Node* newNode(int data) 
{ 
	struct Node* new_node = new Node(); 
	new_node->data = data; 
	new_node->next = NULL; 

	return new_node; 
} 
 
int main() 
{ 
	int k = 3; 
	int n = 4; 

	Node* arr[k]; 

	arr[0] = newNode(1); 
	arr[0]->next = newNode(3); 
	arr[0]->next->next = newNode(5); 
	arr[0]->next->next->next = newNode(7); 

	arr[1] = newNode(2); 
	arr[1]->next = newNode(4); 
	arr[1]->next->next = newNode(6); 
	arr[1]->next->next->next = newNode(8); 

	arr[2] = newNode(0); 
	arr[2]->next = newNode(9); 
	arr[2]->next->next = newNode(10); 
	arr[2]->next->next->next = newNode(11); 

	struct Node* head = mergeKSortedLists(arr, k);
	printList(head); 

	return 0; 
} 
