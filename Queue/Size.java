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
        void size(int queue[],int rear,int front)
        {
            int size=rear-front+1;
            System.out.println("size of the Queue: "+size);
        }
    }
        class Size
        {
            public static void main(String str[])
            {
                int queue[]=new int[1000];
                queue o7=new queue();
                int front=0;
                int rear=4;
                queue[0]=123;
                queue[1]=124;
                queue[2]=321;
                queue[3]=567;
                queue[4]=623;
                System.out.println("Traversing the Queue:");
                o7.traverse(queue,rear,front);
                System.out.println("Size Operation:");
                o7.size(queue,rear,front);
                
            }
        }