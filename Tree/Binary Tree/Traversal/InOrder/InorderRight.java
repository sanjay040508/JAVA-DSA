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
class InorderRight
{
    Node root;
    public static void main(String str[])
{
InorderRight bt=new InorderRight();
bt.root=new Node(10);
bt.root.right=new Node(30);
bt.root.right.left=new Node(60);
bt.root.right.right=new Node(70);
System.out.println("Inorder Traversal:");
aa O1=new aa();
O1.inorder(bt.root);
}
}