int main()
{
    struct node *root = new node(1);
    root->left = new node(2);
    root->right = new node(3);
    /* 
          1
        /  \
       2    3 
     */
    root->left->left = new node(4);
    root->left->right = new node(5);

    /* 
          1
        /  \
       2    3 
     /  \
    4    5

     */
}

preOrder(struct node *root)
{
    if (root == null)
        return;

    cout << root->data << " ";
    preOrder(root->left);
    preOrder(root->right);
}

inOrder(struct node *root)
{
    if (root == null)
        return;

    inOrder(root->left);
    cout << root->data << " ";
    inOrder(root->right);
}

postOrder(struct node *root)
{
    if (root == null)
        return;

    postOrder(root->left);
    postOrder(root->right);
    cout << root->data << " ";
}