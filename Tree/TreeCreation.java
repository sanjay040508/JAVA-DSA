class node
{
    int data;
    node left;
    node right;
    node(int d)
    {
        this.data = d;
        left = null;
        right = null;
    }
}
class binarytree
{
    node root;
    binarytree()
    {
        root = null;
    }
    void create(node root)
    {
    if(root != null)
    {
        System.out.println("          " + root.data);
        System.out.println();
        
        System.out.println("      " + root.left.data+ "       " + root.right.data);
        System.out.println();
        
        System.out.println("   " + root.left.left.data + "   " + root.left.right.data + "   " + root.right.left.data+ "   " + root.right.right.data);
    }
}
}
class TreeCreation
{
    public static void main(String[] args)
    {
        binarytree bt = new binarytree();
        bt.root = new node(11);
        bt.root.left = new node(22);
        bt.root.right = new node(33);
        bt.root.left.left = new node(44);
        bt.root.left.right = new node(55);
        bt.root.right.left = new node(66);
        bt.root.right.right = new node(77);
        System.out.println("Binary Tree Creation:");
        bt.create(bt.root);
    }
}