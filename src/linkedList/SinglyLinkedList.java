package linkedList;

public class SinglyLinkedList {

	Node head;

	public void add(Object data) {
		if (head == null) {
			head = new Node(data, null);
		} else {
			Node curr = head.traverse();
			curr.next = new Node(data, null);
		}
	}

	

	public String printSingly() {
		StringBuilder sb = new StringBuilder();
		sb.append("Node[data: ").append(head.data);

		Node current = head.next;
		while (current != null && current != head) {
			sb.append(", next: Node[data: ").append(current.data);
			current = current.next;
		}

		if (current == head) {
			sb.append(", next: (").append(head.data).append(")");
		} else {
			sb.append(", next: null");
		}

		return sb.toString();
	}

}
