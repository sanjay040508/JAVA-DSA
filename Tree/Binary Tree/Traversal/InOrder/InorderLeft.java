class Node
{
    int data;
    Node left,right;
    Node(int val)
{
    data=val;
    left=null;
    right=null;
}
}
class aa
{
    void inorder(Node n)
    {
        if(n==null)
        {
            return;
        }
        inorder(n.left);
        System.out.print(n.data+"  ");
        inorder(n.right);
    }
}
class InorderLeft
{
    Node root;
    public static void main(String str[])
{
InorderLeft bt=new InorderLeft();
bt.root=new Node(10);
bt.root.left=new Node(20);
bt.root.left.left=new Node(40);
bt.root.left.right=new Node(50);
System.out.println("Inorder Traversal:");
aa O1=new aa();
O1.inorder(bt.root);
}
}