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
class PreorderMix
{
    Node root;
    public static void main(String str[])
{
PreorderMix bt=new PreorderMix();
bt.root=new Node(10);
bt.root.left=new Node(20);
bt.root.right=new Node(30);
bt.root.left.right=new Node(50);
bt.root.right.left=new Node(60);
System.out.println("Preorder Traversal:");
xx O1=new xx();
O1.preorder(bt.root);
}
}