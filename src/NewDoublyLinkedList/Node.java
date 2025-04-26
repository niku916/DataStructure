package NewDoublyLinkedList;

public class Node {
	Node prev;
	String name;
	Node next;

	public Node() {

	}

	public Node(String name) {
		this.name = name;
		this.prev = null;
		this.next = null;

	}

	public Node(Node prev, String name, Node next) {
		this.prev = prev;
		this.name = name;
		this.next = next;
	}

	public void addAtBeginning(String name) {
		Node newNode = new Node(name);
		Node firstNode = this.findFirstNode();
		firstNode.next = newNode;

	}

	public Node add(String name) {
		Node lastNode = this.forwardTraversal();
		Node tempNode = new Node(lastNode, name, null);
		lastNode.next = tempNode;
		return lastNode;
	}

	public Node findFirstNode() {
		Node findFirstNode = this;
		if (findFirstNode.prev == null && findFirstNode.next == null) {
			return findFirstNode;
		}
		return findFirstNode.next.findFirstNode();
	}

	public Node forwardTraversal() {
		Node lastNode = this;
		if (lastNode.next == null) {
			return lastNode;
		}
		return lastNode.next.forwardTraversal();
	}


	
	@Override
	public String toString() {
	    String prevStr = (prev == null) ? "null" : "[Name: " + prev.name + "]";
	    String nextStr = (next == null) ? "null" : next.toString();

	    return "Node [prev=" + prevStr + ", name=" + name + ", next=" + nextStr + "]";
	}




	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
