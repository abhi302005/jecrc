#include <bits/stdc++.h>


// in C

/*struct Node_c{
  int data;
  struct Node *next;
} */
// typedef struct Node_c node;

// in C++
class Node{
public: int data;
Node *next;
};

void InsertAt_begin(int x, Node **head) {
  /* insert node at first place*/

  node *p;
  p = (node*)malloc(sizeof(node));
  p->data = x;
  p->next = Null;

  if (head == Null) {
    *head = p;
  }else{
    p->next = *head;
    *head = p;
  }
}

void traverse(Node **head){
  node *p;
  p = *head;
  while (p != Null) {
    std::cout << p->data << '\n';
    p = p->next;
  }
}

void insertAt_postition(int val,  Node **head, int pos){
  node *p, *q;
  p = (node*) malloc(sizeof(node));
  p->data = x;
  p->next = Null;
  q = *head;

  while (q->data != Null) {
    /* code */
    q = q->next;
  }
  p-next = q->next;
  q->next = p;
}

void deletion(int val,  Node **head, ) {
  node *p, *q, *s;
  p = (node*) malloc(sizeof(node));
  q =*head;
  p = *head;
  s = *head;
// find the value
  while(q->data != val){
    if(q == Null){
      std::cout << "value not found" << '\n';
      return;
      // break;
    }
    q = q->next
  }

// find the previous node and one after
  while(p->next->data !=  q->data){
    p= p->next;
    s = s->next->next;
  }

// join both node
  p->next = s;
}



int main(int argc, char const *argv[]) {
  node *head;
  InsertAt_begin(10,&head)

  return 0;
}
