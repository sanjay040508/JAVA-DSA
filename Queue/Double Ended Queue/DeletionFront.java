class ee
{
    void traverse(int deque[], int front, int rear, int size)
    {
        System.out.println("Front = " + front);

        if (front == -1 && rear == -1)
        {
            System.out.println("Deque is empty");
            return;
        }
        while (rear >= front)
        {
            System.out.println(deque[front]);
            front = front + 1;
        }
        System.out.println("Rear = " + rear);
    }
    int deletefront(int deque[],int front, int rear,int size)
   {
    if (front == -1 && rear == -1)
    {
        System.out.println("Deque is empty");
    }
    else if (front == rear)
    {
        System.out.println("Deleted element = " + deque[front]);
        front = rear = -1;
    }
    else
    {
        System.out.println("Deleted element = " + deque[front]);
        front = front + 1;
    }

    return front;
}
}

class DeletionFront
{
    public static void main(String str[])
    {
        ee O1 = new ee();

        int deque[] = new int[100];

        int front = 0;
        int rear = 3;
        int size = 5;
        deque[0] = 341;
        deque[1] = 231;
        deque[2] = 782;
        deque[3] = 981;

        System.out.println("Before Deletion at front:");

        O1.traverse(deque, front, rear, size);

        front=O1.deletefront(deque,front, rear,size);

        System.out.println("After deletion at front:");

        O1.traverse(deque,front, rear, size);
    }
}