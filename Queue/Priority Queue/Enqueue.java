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

class xx
{
    Queueitem PQ[];
    int front, rear;
    void traverse()
    {
        System.out.println("Front = " + front);

        if(front == -1)
        {
            System.out.println("priority Queue is empty");
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
            front = 0;

        PQ[rear] = new Queueitem(v, p);
    }
}
class Enqueue
{
  public static void main(String str[])
    {
        xx O1= new xx();

        O1.PQ = new Queueitem[10];
        O1.front = -1;
        O1.rear = -1;
        System.out.println("Before Enqueue operation:");
        O1.traverse();

        O1.enqueue(10, 1);
        O1.enqueue(20, 3);
        O1.enqueue(30, 2);

        System.out.println("\nAfter Enqueue operation:");
        O1.traverse();
    }
}