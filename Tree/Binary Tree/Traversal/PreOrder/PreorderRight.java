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
class PreorderRight
{
    Node root;
    public static void main(String str[])
{
PreorderRight bt=new PreorderRight();
bt.root=new Node(10);
bt.root.right=new Node(30);
bt.root.right.left=new Node(60);
bt.root.right.right=new Node(70);
System.out.println("Preorder Traversal:");
xx O1=new xx();
O1.preorder(bt.root);
}
}