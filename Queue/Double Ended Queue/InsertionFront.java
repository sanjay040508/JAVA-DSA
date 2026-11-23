class ss
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

    int insertfront(int deque[],int front,int rear,int val,int size)
    {
        if ((front == 0 && rear == size - 1) || (front == rear + 1))
        {
            System.out.println("Deque is full");
        }
        else if (front == -1 && rear == -1)
        {
            front = rear = 0;
            deque[front] = val;
        }
        else if (front == 0)
        {
            front = size - 1;
            deque[front] = val;
        }
        else
        {
            front = front - 1;
            deque[front] = val;
        }
        return front;
    }
}

class InsertionFront
{
    public static void main(String str[])
    {
        ss O1 = new ss();

        int deque[] = new int[100];

        int front = 1;
        int rear = 3;
        int size = 5;

        deque[1] = 231;
        deque[2] = 782;
        deque[3] = 981;

        System.out.println("Before insertion at front:");

        O1.traverse(deque, front, rear, size);

        front=O1.insertfront(deque,front, rear,1000,size);

        System.out.println("After insertion at front:");

        O1.traverse(deque,front, rear, size);
    }
}