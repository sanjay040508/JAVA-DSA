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
class cc
{
void levelorder(node n)
{
    if(n == null)
        return;

    System.out.print(n.data + " ");

    if(n.left != null)
        System.out.print(n.left.data + " ");

    if(n.right != null)
    {
        levelorder(n.right);
    }
}
}
class LevelorderLeft
{
    node root;
    public static void main(String[] args) {
        LevelorderLeft bt=new LevelorderLeft();
        bt.root=new node(10);
        bt.root.left=new node(20);
        bt.root.left.left=new node(40);
        bt.root.left.right=new node(50);
        cc O2=new cc();
        O2.levelorder(bt.root);
        
    }
}