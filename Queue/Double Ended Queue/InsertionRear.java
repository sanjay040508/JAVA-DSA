class kk
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
int insertrear(int deque[], int front, int rear, int val, int size)
{
    if((front == 0 && rear == size-1) || (front == rear+1))
    {
        System.out.println("Deque is full");
    }
    else if(front == -1 && rear == -1)
    {
        front = rear = 0;
        deque[rear] = val;
    }
    else if(rear == size-1)
    {
        rear = 0;
        deque[rear] = val;
    }
    else
    {
        rear = rear + 1;
        deque[rear] = val;
    }
    return rear;
}
}

class InsertionRear
{
    public static void main(String str[])
    {
        kk O1 = new kk();

        int deque[] = new int[100];

        int front = 0;
        int rear = 3;
        int size = 5;
        deque[0]=905;
        deque[1] = 231;
        deque[2] = 782;
        deque[3] = 981;

        System.out.println("Before insertion at rear:");

        O1.traverse(deque, front, rear, size);

        rear=O1.insertrear(deque,front, rear,56789,size);

        System.out.println("After insertion at rear:");

        O1.traverse(deque,front, rear, size);
    }
}