import java.util.Scanner;

// Interface
interface QueueImpl
{
    void insert(int data);
    void delete();
    void display();
}

// Class implementing the interface
class QueueDemo implements QueueImpl
{
    int queue[] = new int[10];
    int front = -1;
    int rear = -1;

    // Insert operation
    public void insert(int data)
    {
        try
        {
            if(rear == 9)
            {
                throw new Exception("Queue Overflow");
            }

            if(front == -1)
            {
                front = 0;
            }

            rear++;
            queue[rear] = data;

            System.out.println("Inserted element: " + data);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    // Delete operation
    public void delete()
    {
        try
        {
            if(front == -1 || front > rear)
            {
                throw new Exception("Queue Underflow");
            }

            System.out.println("Deleted element: " + queue[front]);
            front++;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    // Display operation
    public void display()
    {
        if(front == -1 || front > rear)
        {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Queue elements are:");

        for(int i = front; i <= rear; i++)
        {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }
}

// Main class
public class lab5_1

{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        QueueDemo q = new QueueDemo();

        int choice, value;

        do
        {
            System.out.println("\n------ Queue Menu ------");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    q.insert(value);
                    break;

                case 2:
                    q.delete();
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    System.out.println("Program terminated");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }while(choice != 4);
    }
}