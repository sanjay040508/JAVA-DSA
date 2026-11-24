class node
{
    int data;
    node left,right;
    node(int val)
    {
        this.data=val;
        left=null;
        right=null;
    }
}
class bintree
{
    node root;;
    int height(node n)
    {
        if(n==null)
        {
            return -1;
        }
        int leftheight=height(n.left);
        int rightheight=height(n.right);
        return(1+Math.max(leftheight,rightheight));
    }
}
class Treeheight
{
    public static void main(String str[])
{
    int h1,h2;
    bintree t=new bintree();
    t.root=new node(10);
    t.root.left=new node(20);
    t.root.right=new node(30);
    t.root.left.left=new node(40);
    t.root.left.right=new node(50);
    t.root.left.left.left=new node(60);
    h1=t.height(t.root);
    System.out.println("Height of the root node:"+h1);
    h2=t.height(t.root.left);
    System.out.println("Height of the node 20:"+h2);
}
}