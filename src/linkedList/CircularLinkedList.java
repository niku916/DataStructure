package linkedList;

public class CircularLinkedList {
	Node head;

	public void add(String name) {

		if (head == null) {
			head = new Node(name, null, null);
		} else {
			Node currNode = head.traverse();
			Node newNode = new Node(name, head, currNode);
			currNode.next = newNode;
			head.prev = newNode;
		}
	}

	public String printCircular() {
		StringBuilder sb = new StringBuilder();
		Node current = head;
		do {
			String prev = (String) ((current.prev != null) ? current.prev.data
					: "null");
			String next = (String) ((current.next != null) ? current.next.data
					: "null");
			sb.append("[Prev: ").append(prev).append(", data: ")
					.append(current.data).append(", Next: ").append(next)
					.append("]");
			current = current.next;
			if (current != head)
				sb.append(" , ");
		} while (current != null && current != head);
		return sb.toString();
	}

}
