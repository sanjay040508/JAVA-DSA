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
    void enqueue(int queue[],int rear,int front,int element)
    {
        int size=queue.length;
        if(rear==size-1)
        {
            System.out.println("Queue overflow");
            return;
        }
        if(front==-1)
        {
            front=0;
        }
        rear=rear+1;
        queue[rear]=element;
    }
    void dequeue(int queue[],int rear,int front)
    {
       
        if(front>rear)
        {
            System.out.println("Queue underflow");
        
        }
        else
        {
            front=front+1;
        }
    }
    void peek(int queue[],int rear)
        {
            if(rear==-1)
            {
                System.out.println("Queue underflow");
            }
            else
            {
                System.out.println("Peek element:" +queue[rear]);
            }
        }
        boolean isFull(int queue[],int rear,int max)
        {
            if(rear==max)
            {
                System.out.println("Queue is full");
                return true;
            }
            else
            {
                System.out.println("Queue is not full");
                return false;
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
        void size(int queue[],int rear,int front)
        {
            int size=rear-front+1;
            System.out.println("size of the Queue: "+size);
        }
}
class QueueOperationsCompileTime
{
    public static void main(String str[])
    {
        int queue[]=new int[1000];
        queue O1=new  queue();
        int rear=4;
        int front=0;
        queue[0]=111;
        queue[1]=222;
        queue[2]=333;
        queue[3]=444;
        queue[4]=555;
        System.out.println("Traversing of the Queue: "); 
        O1.traverse(queue,rear,front);
        System.out.println();

        System.out.println("Before enqueue operation: "); 
        O1.traverse(queue,rear,front);
        O1.enqueue(queue,rear,front,999);
        rear=rear+1;
        System.out.println();

        System.out.println("After enqueue operation:");
        O1.traverse(queue,rear,front);
        System.out.println();

        System.out.println("Before dequeue operation: "); 
        O1.traverse(queue,rear,front);
        O1.dequeue(queue,rear,front);
        front=front+1;
        System.out.println();

        System.out.println("After dequeue operation:");
        O1.traverse(queue,rear,front);
        System.out.println();

        System.out.println("Peek operation:");
        O1.peek(queue,rear);
        System.out.println();

        System.out.println("IsFull operation:");
        System.out.println(O1.isFull(queue,rear,100));
        System.out.println();

        System.out.println("Isempty operation:");
        System.out.println(O1.isEmpty(queue,rear));
        System.out.println();

        System.out.println("Size Operation:");
        O1.size(queue,rear,front);
    }
}