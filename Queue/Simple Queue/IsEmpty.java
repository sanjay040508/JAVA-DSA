class queue
{
    void traverse(int queue[],int rear,int front)
    {
        if(rear!=-1)
        {
            System.out.println("Rear = "+ (rear));
        }
        while(rear>=front)
        {
            
            System.out.println(queue[rear]);
            rear=rear-1;
            
        }
         if(front!=-1)
            {

            System.out.println("Front =  "+(front));
            }
        }
        boolean isEmpty(int queue[],int rear)
        {
            if(rear==-1)
            {
                System.out.println("Queue is Empty");
                return true;
            }
            else
            {
                System.out.println("Queue is not Empty");
                return false;
            }
        }
    }
    class IsEmpty
    {
        public static void main(String str[])
{
                int queue[]=new int[1000];
                queue o4=new queue();
                int front=0;
                int rear=4;
                queue[0]=451;
                queue[1]=808;
                queue[2]=374;
                queue[3]=901;
                queue[4]=721;
                System.out.println("Traversing the Queue:");
                o4.traverse(queue,rear,front);
                System.out.println("IsEmpty operation:");
                System.out.println(o4.isEmpty(queue,rear));
}    
    }