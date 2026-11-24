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

class rr
{
    Node root;
    void postorder(Node root)
    {
    if(root == null)
      return;
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data + " ");
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

class PostorderSearch
{
    public static void main(String[] args)
    {
        rr bt = new rr();

        bt.root = new Node(10);
        bt.root.left = new Node(20);
        bt.root.right = new Node(30);
        bt.root.left.left = new Node(40);
        bt.root.left.right = new Node(50);

        System.out.println("Postorder DFS:");
        bt.postorder(bt.root);
        System.out.println("\n");

        System.out.println("Searching element:");
        bt.search(bt.root, 50, "root");
    }
}