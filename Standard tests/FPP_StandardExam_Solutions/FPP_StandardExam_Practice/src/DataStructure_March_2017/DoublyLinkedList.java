package DataStructure_March_2017;

public class DoublyLinkedList {

	Node header;

	DoublyLinkedList() {
		header = new Node();
	}

	// adds to the end of the list
	public void addLast(String item) {
		// implement

		if (item == null) {
			return;
		}
		Node toBeAddedNode = new Node();
		toBeAddedNode.value = item;

		if (header.next == null) {
			header.next = toBeAddedNode;
			toBeAddedNode.previous = header;
		} else {
			Node lastNode = header.next;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}
			lastNode.next = toBeAddedNode;
			toBeAddedNode.previous = lastNode;

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
	}

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addLast("Bob");
		list.addLast("Harry");
		list.addLast("Steve");
		System.out.println(list);
	}
}
