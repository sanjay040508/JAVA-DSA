class Queueitem
{
    int val;
    int priority;

    Queueitem(int v, int p)
    {
        val = v;
        priority = p;
    }
}

class xy
{
    Queueitem PQ[];
    int front, rear;

    void traverse()
    {
        System.out.println("Front = " + front);

        if(front == -1)
        {
            System.out.println("Priority Queue is empty");
        }
        else
        {
            System.out.println("value\tpriority");

            for(int i = front; i <= rear; i++)
            {
                System.out.println(PQ[i].val + "\t" + PQ[i].priority);
            }
        }

        System.out.println("Rear = " + rear);
    }

    void enqueue(int v, int p)
    {
        rear++;

        if(front == -1)
        {
            front = 0;
        }

        PQ[rear] = new Queueitem(v, p);
    }

    void dequeue()
    {
        if(front == -1)
        {
            System.out.println("Priority Queue is empty");
            return;
        }

        int i = front;

        for(int j = front + 1; j <= rear; j++)
        {
            if(PQ[j].priority > PQ[i].priority)
            {
                i = j;
            }
        }

        
        System.out.println("Deleted value = " + PQ[i].val);
        System.out.println("Deleted priority = " + PQ[i].priority);

        while(i < rear)
        {
            PQ[i] = PQ[i + 1];
            i++;
        }

        rear=rear-1;

        if(rear < front)
        {
            front = -1;
            rear = -1;
        }
    }
}

class Dequeue
{
    public static void main(String str[])
    {
        xy O2 = new xy();

        O2.PQ = new Queueitem[10];
        O2.front = -1;
        O2.rear = -1;

        System.out.println("Before Enqueue operation:");
        O2.traverse();

        O2.enqueue(11, 1);
        O2.enqueue(22, 3);
        O2.enqueue(33, 4);
        O2.enqueue(88, 6);

        System.out.println("\nAfter Enqueue operation:");
        O2.traverse();

        System.out.println("\nAfter Dequeue operation:");
        O2.dequeue();
        O2.traverse();
    }
}