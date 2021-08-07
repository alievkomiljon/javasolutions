package DataStructure_March_2018;

public class MinDoublyLinkedList {

	Node header;

	public MinDoublyLinkedList() {
		header = new Node();
	}

	public void add(String item) {
		// implement
		Node current = header;
		Node n = new Node();
		n.value = item;

		String nextNodeValue = "";
		if (current.next != null) {
			nextNodeValue = current.next.value;

			if (item.compareTo(nextNodeValue) < 0) {
				n.previous = current;
				n.next = current.next;
				current.next.previous = n;
				current.next = n;
			} else {
				current = current.next;
				n.previous = current;
				n.next = current.next;
				if (current.next != null)
					current.next.previous = n;
				current.next = n;
			}
		} else {
			n.previous = current;
			n.next = current.next; // current.next is null & n.next is null also
			current.next = n;
		}
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

		public Node(String value, Node next, Node previous) {
			this.value = value;
			this.next = next;
			this.previous = previous;
		}

		public Node() {

		}
	}

	public static void main(String[] args) {
		MinDoublyLinkedList list = new MinDoublyLinkedList();

		list.add("bob");
		System.out.println(list);
		list.add("harry");
		System.out.println(list);
		list.add("steve");
		System.out.println(list);
		list.add("anne");
		System.out.println(list);

	}
}
