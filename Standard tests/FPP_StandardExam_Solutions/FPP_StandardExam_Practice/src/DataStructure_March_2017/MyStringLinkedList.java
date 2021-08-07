package DataStructure_March_2017;

public class MyStringLinkedList {
	Node header;

	public MyStringLinkedList() {

		header = new Node(null, null, null);
	}

	// Add method for FPP March2018 Standard Test
	// this method works by comparing the item to add with the o's element in the
	// list
	public void add(String item) {
		if (header.next == null) {
			header.next = new Node(null, header, item);
		} else {
			Node current = header.next;
			if (current.value.compareTo(item) < 0) {
				Node n = new Node(current.next, current, item);
				if (current.next != null) {
					n.next = current.next;
					current.next.previous = n;
					current.next = n;
				} else {
					current.next = n;
				}
			} else {
				Node n = new Node(current, header, item);
				header.next = n;
				current.previous = n;
			}
		}
	}

	public void addLast(String item) {
		if (header.next == null) {
			header.next = new Node(null, header, item);
		} else {
			Node temp = header.next;
			// Node last = null;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(null, temp, item);

		}
	}

	public String removeMax() {
		if (header.next == null) {
			return null;
		}
		Node temp = header.next;
		Node current = null;
		String value = temp.value;
		while (temp != null) {
			if (temp.value.compareTo(value) >= 0) {
				current = temp;
				value = temp.value;

			}
			temp = temp.next;
		}
		if (current.next != null) {
			current.previous.next = current.next;
			current.next.previous = current.previous;
			current = null;
		} else {
			current.previous.next = null;
			current = null;
		}
		return value;
	}

	public String removeMin() {
		if (header.next == null) {
			return null;
		}
		Node temp = header.next;
		Node current = null;
		String value = temp.value;
		while (temp != null) {
			if (temp.value.compareTo(value) <= 0) {
				current = temp;
				value = temp.value;

			}
			temp = temp.next;
		}
		if (current.next != null) {
			current.previous.next = current.next;
			current.next.previous = current.previous;
			current = null;
		} else {
			current.previous.next = null;
			current = null;
		}
		return value;
	}

	public void insert(String s, int pos) {
		Node temp = getNode(pos);
		if (header.next == null && pos == 0) {
			header.next = new Node(header.next, header, s);
		} else if (temp != null) {
			Node node = new Node(temp, temp.previous, s);
			temp.previous.next = node;
			temp.previous = node;
		} else {
			Node current = header.next;
			Node lastNode = current;
			while (current != null) {
				if (current.next == null) {
					lastNode = current;
				}
				current = current.next;
			}
			lastNode.next = new Node(lastNode.next, lastNode, s);
		}

	}

	private Node getNode(int pos) {
		if (pos < 0 || pos > size()) {
			return null;
		}
		Node temp = header;
		for (int i = 0; i <= pos; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public int size() {
		Node temp = header;
		int count = 0;
		while (temp.next != null) {
			++count;
			temp = temp.next;
		}
		return count;
	}

	public boolean remove(String data) {
		Node temp = findNode(data);
		if (isEmpty() || temp == null) {
			return false;
		}
		if (temp.next == null) {
			temp.previous.next = null;
			temp = null;
		} else {
			temp.previous.next = temp.next;
			temp.next.previous = temp.previous;
			temp = null;
		}
		return true;
	}

	public Node findNode(String s) {
		if (isEmpty()) {
			return null;
		}
		Node temp = header.next;
		Node current = null;
		while (temp != null) {
			if (temp.value.equals(s)) {
				current = temp;
			}
			temp = temp.next;
		}
		return current;
	}

	public boolean find(String s) {
		if (isEmpty()) {
			return false;
		}
		Node temp = header.next;
		while (temp != null) {
			if (temp.value.equals(s)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public boolean isEmpty() {
		if (header.next == null) {
			return true;
		}
		return false;
	}

	public void sort() {
		if (isEmpty() || size() == 1) {
			return;
		}
		Node current = header;
		while (current.next != null) {
			current = current.next;
			Node min = minNode(current);
			swap(current, min);

		}
	}

	public Node minNode(Node n) {
		Node minNode = n;
		Node current = n;
		String minVal = n.value;
		while (current != null) {
			if (current.value.compareTo(minVal) < 0) {
				minVal = current.value;
				minNode = current;
			}
			current = current.next;
		}
		return minNode;
	}

	public void swap(Node n1, Node n2) {
		String temp = n1.value;
		n1.value = n2.value;
		n2.value = temp;
	}

	public boolean search(String s) {
		boolean found = recSearch(0, size() - 1, s);
		return found;
	}

	public boolean recSearch(int min, int max, String s) {
		int mid = (min + max) / 2;
		if (get(mid).equals(s)) {
			return true;
		}
		if (min > mid) {
			return false;
		}
		if (s.compareTo(get(mid)) < 0) {
			return recSearch(min, mid - 1, s);
		} else {
			return recSearch(mid + 1, max, s);
		}
	}

	public String get(int pos) {
		Node node = getNode(pos);
		return (node != null ? node.value : null);
	}

	@Override
	public String toString() {
		String str = "";
		Node temp = header.next;
		while (temp != null) {
			str += temp.value + "-->";
			temp = temp.next;
		}
		return "[" + str + "]";
	}

	class Node {
		String value;
		Node next;
		Node previous;

		public Node(Node next, Node previous, String value) {
			this.next = next;
			this.previous = previous;
			this.value = value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList linked = new MyStringLinkedList();
		linked.add("mike");
		System.out.println(linked);
		linked.add("bill");
		System.out.println(linked);
		linked.add("tom");
		System.out.println(linked);
		linked.add("anne");
		System.out.println(linked);
		linked.add("chris");
		System.out.println(linked);
		linked.add("nigus");
		System.out.println(linked);
		linked.add("seli");
		System.out.println(linked);
		// remove max
		System.out.println("\n");
		System.out.println(linked.removeMax());
		System.out.println(linked);
		System.out.println(linked.removeMax());
		System.out.println(linked);
		System.out.println(linked.removeMax());
		System.out.println(linked);
		System.out.println(linked.removeMax());
		System.out.println(linked);
		System.out.println(linked.removeMax());
		System.out.println(linked);
		System.out.println(linked.removeMax());
		System.out.println(linked);
		System.out.println(linked.removeMax());
		System.out.println(linked);

		System.out.println("\n");

		linked.add("mike");
		System.out.println(linked);
		linked.add("bill");
		System.out.println(linked);
		linked.add("tom");
		System.out.println(linked);
		linked.add("anne");
		System.out.println(linked);
		linked.add("chris");
		System.out.println(linked);
		linked.add("nigus");
		System.out.println(linked);
		linked.add("seli");
		System.out.println(linked);
		// remove min
		System.out.println("\n");
		System.out.println(linked.removeMin());
		System.out.println(linked);
		System.out.println(linked.removeMin());
		System.out.println(linked);
		System.out.println(linked.removeMin());
		System.out.println(linked);
		System.out.println(linked.removeMin());
		System.out.println(linked);
		System.out.println(linked.removeMin());
		System.out.println(linked);
		System.out.println(linked.removeMin());
		System.out.println(linked);
		System.out.println(linked.removeMin());
		System.out.println(linked);
		// addLast`
		linked.addLast("mike");
		System.out.println(linked);
		linked.addLast("bill");
		System.out.println(linked);
		linked.addLast("tom");
		System.out.println(linked);
		linked.addLast("bob");
		System.out.println(linked);
		linked.addLast("yoni");
		System.out.println(linked);

	}
}
