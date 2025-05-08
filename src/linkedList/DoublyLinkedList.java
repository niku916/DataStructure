package linkedList;

public class DoublyLinkedList {

	Node headNode;

	public void add(String name) {

		if (headNode == null) {
			headNode = new Node(name, null, null);

		} else {
			Node currNode = headNode.traverse();
			Node tempNode = new Node(name, null, currNode);
			currNode.next = tempNode;

		}

	}

	public String printDoubly() {
		StringBuilder sb = new StringBuilder();
		Node current = headNode;
		do {
			String prev = (String) ((current.prev != null) ? current.prev.data
					: "null");
			String next = (String) ((current.next != null) ? current.next.data
					: "null");
			sb.append("[Prev: ").append(prev).append(", data: ")
					.append(current.data).append(", Next: ").append(next)
					.append("]");
			current = current.next;
			if (current != headNode)
				sb.append(" , ");
		} while (current != null && current != headNode);
		return sb.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		DoublyLinkedList other = (DoublyLinkedList) obj;
		Node currentThis = headNode;
		DoublyLinkedList currentOther = other;
		return isequals(currentThis, currentOther);
	}

	public boolean isequals(Node currentThis, DoublyLinkedList currentOther) {
		if (currentThis == null && currentOther == null) {
			return true;
		}
		if (currentThis == null || currentOther == null) {
			return false;
		}
		if (currentThis.data != currentOther.headNode.data) {
			return isequals(currentThis.next, currentOther.headNode.next);
		}
		return isequals(currentThis.next, currentOther);
	}

}
