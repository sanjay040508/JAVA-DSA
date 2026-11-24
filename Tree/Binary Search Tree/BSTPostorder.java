
class Node
{
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}

class tree
{
    void postorder(Node root)
    {
        if(root == null)
        return;
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    boolean search(Node root, int val, String pos)
    {
        if(root == null)
            return false;

        if(root.data == val)
        {
            System.out.println("Element found at position " + pos);
            return true;
        }

        if(val < root.data)
            return search(root.left, val, pos + ".left");
        else
            return search(root.right, val, pos + ".right");
    }
}

class BSTPostorder
{
    Node root;

    public static void main(String str[])
    {
        BSTPostorder bt = new BSTPostorder();

        bt.root = new Node(50);
        bt.root.left = new Node(30);
        bt.root.right = new Node(70);
        bt.root.left.left = new Node(20);
        bt.root.left.right = new Node(40);
        bt.root.right.left = new Node(60);
        bt.root.right.right = new Node(80);

        int value = 60;

        tree O1 = new tree();

        System.out.println("Binary search tree traversal:");
        O1.postorder(bt.root);
        System.out.println("\n");
        System.out.println("Searching in binary search tree:");
        System.out.println("Searching Element :" + value);

        if(!O1.search(bt.root, value, "root"))
        System.out.println("Element not foundin BSt");
    }
}