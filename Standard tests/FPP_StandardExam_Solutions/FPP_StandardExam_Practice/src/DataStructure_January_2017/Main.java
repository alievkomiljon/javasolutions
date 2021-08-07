package DataStructure_January_2017;

public class Main {

	public static void main(String[] args) throws QueueException {
		ArrayQueueImpl q = new ArrayQueueImpl();
		// q.peek();
		for (int i = 0; i < 15; i++)
			q.enqueue(i);
		for (int i = 0; i < 10; i++)
			q.dequeue();
		System.out.println(q.size());

	}

}
