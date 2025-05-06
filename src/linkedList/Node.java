package linkedList;

public class Node {

	Object data;
	Node next;
	Node prev;

	Node(Object data, Node next) {
		this.data = data;
		this.next = next;
	}

	public Node(Object data, Node next, Node prev) {
		super();
		this.data = data;
		this.next = next;
		this.prev = prev;
	}

	public Node traverse() {
		Node lastNode = this;
		while (lastNode.next != null && lastNode.next != this) {
			lastNode = lastNode.next;
		}
		return lastNode;
	}

}
