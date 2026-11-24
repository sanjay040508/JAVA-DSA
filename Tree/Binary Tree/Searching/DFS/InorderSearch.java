class Node
{
    int data;
    Node left, right;
    Node(int value)
    {
        data = value;
        left = null;
        right = null;
    }
}

class qq
{
    Node root;
    void inorder(Node root)
    {
    if(root == null)
      return;
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
    }
   void search(Node root, int value, String location)
    {
        if(root == null)
            return;

        if(root.data == value)
        {
            System.out.println(value + " is found in " + location);
        }

        search(root.left, value, location + ".left");
        search(root.right, value, location + ".right");
    }
}

class InorderSearch
{
    public static void main(String[] args)
    {
        qq bt = new qq();

        bt.root = new Node(10);
        bt.root.left = new Node(20);
        bt.root.right = new Node(30);
        bt.root.left.left = new Node(40);
        bt.root.left.right = new Node(50);

        System.out.println("Inorder DFS:");
        bt.inorder(bt.root);
        System.out.println("\n");

        System.out.println("Searching element:");
        bt.search(bt.root, 30, "root");
    }
}