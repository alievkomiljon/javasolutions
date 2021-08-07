package DataStructure_January_2017;

public class ArrayQueueImpl {

	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;

	public int peek() throws QueueException {
		// Implement
		if (isEmpty())
			throw new QueueException("The queue is empty");
		return arr[front];
	}

	public void enqueue(int obj) {
		// implement
		if (front == -1)
			front++;
		if (isFull())
			resize();
		arr[rear++] = obj;
	}

	private void resize() {
		int[] temp = new int[arr.length * 2];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}

	private boolean isFull() {
		return rear == arr.length;
	}

	public int dequeue() throws QueueException {
		// implement
		if (isEmpty())
			throw new QueueException("The queue is empty");
		int first = arr[front];
		front++;
		return first;
	}

	public boolean isEmpty() {
		// implement
		return (front == -1 || front >= rear);
	}

	public int size() {
		// implement
		if (isEmpty())
			return 0;
		return rear - front;
	}

}
