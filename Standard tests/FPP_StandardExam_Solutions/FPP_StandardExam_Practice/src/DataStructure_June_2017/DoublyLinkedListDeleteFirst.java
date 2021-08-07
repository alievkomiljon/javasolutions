package DataStructure_June_2017;

public class DoublyLinkedListDeleteFirst {

	Node header;

	public DoublyLinkedListDeleteFirst() {
		header = new Node();
	}

	// removes the node at position 1 and returns
	// the string contained in that node
	public String deleteFirst() {
		if (isEmpty() || header.next.next == null)
			throw new IllegalStateException("there is no element at index one");

		String ret = header.next.value;
		Node nextTop = header.next.next;
		header.next = nextTop;
		nextTop.previous = header;
		return ret;

		/*
		 * Node prevT = header.next; String val = prevT.next.value; Node nextT =
		 * prevT.next.next; if (nextT == null) { prevT.next = null; } else { prevT.next
		 * = nextT; nextT.previous = prevT; }
		 * 
		 * return val;
		 */
	}

	public boolean isEmpty() {
		// implement
		if (header.next == null)
			return true;
		else
			return false;
	}

	// adds to the end of the list
	public void addLast(String item) {
		Node next = header;
		while (next.next != null) {
			next = next.next;
		}
		Node n = new Node();
		n.value = item;
		next.next = n;
		n.previous = next;

	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		return sb.toString();

	}

	private void toString(StringBuilder sb, Node n) {
		if (n == null)
			return;
		if (n.value != null)
			sb.append(" " + n.value);
		toString(sb, n.next);
	}

	class Node {
		String value;
		Node next;
		Node previous;

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedListDeleteFirst list = new DoublyLinkedListDeleteFirst();
		list.addLast("Peter");
		list.addLast("Bob");
		list.addLast("Harry");
		list.addLast("Steve");
		String deleted = list.deleteFirst();
		System.out.println("This item was deleted: " + deleted);
		System.out.println(list);

	}
}
