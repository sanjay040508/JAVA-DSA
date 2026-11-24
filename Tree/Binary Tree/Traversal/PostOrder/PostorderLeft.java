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
class PostorderLeft
{
    Node root;
    public static void main(String str[])
{
PostorderLeft bt=new PostorderLeft();
bt.root=new Node(10);
bt.root.left=new Node(20);
bt.root.left.left=new Node(40);
bt.root.left.right=new Node(50);
System.out.println("Postorder Traversal:");
bb O1=new bb();
O1.postorder(bt.root);
}
}