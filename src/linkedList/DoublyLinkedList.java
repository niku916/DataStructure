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

}
