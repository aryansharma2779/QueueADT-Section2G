package main;

import java.util.Scanner;

class QueueADT
{

    int[] queue = new int[10];
    int front = -1;
    int rear = -1;
    int size = queue.length;

 void enqueue(int value)
    {
        if(isFull())
        {
            System.out.println("Queue is Full");
        }
        else
        {
            front=front+1;
            queue[front]=value;
        }
    }

    void dequeue()
    {
        int deleted = 0;

       if(isEmpty())
       {
           System.out.println("QUEUE is Empty cant delete the input.");

       }
       else {

           deleted=queue[front];
           queue[front] = 0;
           front = front - 1;
           System.out.println( "Deleted Number is " + deleted);
       }


    }

    void peek()
    {
        if(isEmpty())
    {
        System.out.println("QUEUE IS EMPTY");
    }
        else
        {
        int item = 0;
        item=queue[front];
            System.out.println("LATEST ELEMENT IS " +item);
    }}

    int size()
    {
        int size = 0;
        size = rear + 1;
        return size;
    }

    boolean isEmpty()
    {
        if((front==-1) && (rear==-1))
        {
            return true;
        }
        else{
            return false;
        }

    }

    boolean isFull()
    {
        if(front==queue.length-1)
        {
            return true;
        }
        else
        {
        return false;
    }
    }
    void showQueue()
    {
        for (int i = 0; i <= front; i++) {
            System.out.println(queue[i]);
        }
            }

    public static void main(String[] args) {

     Scanner scan=new Scanner(System.in);
        QueueADT a=new QueueADT();
        int ch;
        do {
        System.out.println("*********OPTIONS***********");
        System.out.println("1- ENQUEUE");
        System.out.println("2- DEQUEUE");
        System.out.println("3- SHOWQUEUE");
            System.out.println("4- LATEST VALUE");
        System.out.println("5- EXIT");
            System.out.println("------ENTER YOUR CHOICE-------");
        ch=scan.nextInt();

            switch (ch) {
                case 1:

                    System.out.println("Enter number you want to enter");
                    int x;
                    x = scan.nextInt();
                    a.enqueue(x);
                    break;

                case 2:
                    //System.out.println("");
                    a.dequeue();
                    break;


                case 3:

                    a.showQueue();
                    break;

            case 4:

                a.peek();
                break;
        }
        }while(ch!=5);

    }
}
