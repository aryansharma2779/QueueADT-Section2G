package main;

public class QueueADT
{

	int[] queue = new int[10];
	int front = -1;
	int rear = -1;
	int size = queue.length;

	void enqueue(int value)
	{
	}

	int dequeue()
	{
		int deleted = 0;


		return deleted;
	}

	int peek()
	{
		int item = 0;

		return item;
	}

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
		return false;
	}

}
