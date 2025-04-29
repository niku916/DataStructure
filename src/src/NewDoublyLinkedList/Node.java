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

	public Node deleteByIndex(int index) {
		Node currNode = this;
		Node deletedNode = null;
		Node traversedNode = currNode.traverserByIndex(index);
		deletedNode = traversedNode.getNext();
		traversedNode.setNext(traversedNode.getNext().getNext());
		return deletedNode;
	}

	public Node traverserByIndex(int index) {

		Node currNode = this;
		index--;
		if (index != 0 && currNode.next != null) {
			currNode = currNode.next.traverserByIndex(index);
		}

		return currNode;
	}

	public Node traverseByName(String name) {
		Node currNode = this;
		if (this.name == name) {
			return currNode;
		}
		return currNode.next.traverseByName(name);
	}

	public Node addback(String name) {
		Node lastNode = this.backwardTraversal();
		Node tempNode = new Node(lastNode, name, lastNode.next);
		lastNode.next = tempNode;
		return lastNode;
	}

	public Node backwardTraversal() {
		Node lastNode = this;
		if (lastNode.prev == null) {
			return lastNode;
		}
		return lastNode.prev.backwardTraversal();
	}

	public Node inserByIndex(int index, String name) {
		Node indexedNode = this.traverserByIndex(index);
		Node nextNode = indexedNode.next;
		Node tempNode = new Node(indexedNode, name, nextNode);
		indexedNode.setNext(tempNode);
		return tempNode;

	}

	public int size() {
		Node currNode = this;
		int sixe = 0;
		try {

			sixe = 1 + currNode.next.size();

		} catch (NullPointerException e) {
			sixe = 0;
		}

		return sixe;
	}

	@Override
	public String toString() {
		String prevStr = (prev == null) ? "null" : "[Prevois Name: "
				+ prev.name + "]";
		String nextStr = (next == null) ? "null" : next.toString();

		return "Node [prev=" + prevStr + ", name=" + name + ", next=" + nextStr
				+ "]";
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
