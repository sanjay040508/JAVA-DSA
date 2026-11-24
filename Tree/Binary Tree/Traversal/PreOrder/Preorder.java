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
class xx
{
    void preorder(Node n)
    {
        if(n==null)
        {
            return;
        }
        System.out.print(n.data+"  ");
        preorder(n.left);
        preorder(n.right);
    }
}
class Preorder
{
    Node root;
    public static void main(String str[])
{
Preorder bt=new Preorder();
bt.root=new Node(10);
bt.root.left=new Node(20);
bt.root.right=new Node(30);
bt.root.left.left=new Node(40);
bt.root.left.right=new Node(50);
bt.root.right.left=new Node(60);
bt.root.right.right=new Node(70);
System.out.println("Preorder Traversal:");
xx O1=new xx();
O1.preorder(bt.root);
}
}