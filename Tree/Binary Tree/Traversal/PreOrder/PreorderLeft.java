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
class PreorderLeft
{
    Node root;
    public static void main(String str[])
{
PreorderLeft bt=new PreorderLeft();
bt.root=new Node(10);
bt.root.left=new Node(20);
bt.root.left.left=new Node(40);
bt.root.left.right=new Node(50);
System.out.println("Preorder Traversal:");
xx O1=new xx();
O1.preorder(bt.root);
}
}