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
class bb
{
    void postorder(Node n)
    {
        if(n==null)
        {
            return;
        }
        
        postorder(n.left);
        postorder(n.right);
        System.out.print(n.data+"  ");
    }
}
class PostorderRight
{
    Node root;
    public static void main(String str[])
{
PostorderRight bt=new PostorderRight();
bt.root=new Node(10);
bt.root.right=new Node(30);
bt.root.right.left=new Node(60);
bt.root.right.right=new Node(70);
System.out.println("Postorder Traversal:");
bb O1=new bb();
O1.postorder(bt.root);
}
}