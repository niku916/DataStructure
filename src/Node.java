package doublyLinkList;

public class Node {
	int data;
	Node prev;
	Node next;

	public Node() {
	}

	private Node(int data, Node prev, Node next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}

	public Node forwardTravverse() {
		Node lastNode = this;
		if (lastNode.next != null) {
			lastNode = lastNode.next.forwardTravverse();
		}
		return lastNode;
	}

	public Node backwardTravverse() {
		Node currNode = this;
		if (currNode.prev == null) {
			return currNode;
		}
		return currNode.prev.backwardTravverse();
	}

	public int size() {
		int index = 0;
		try {
			index = 1 + this.next.size();
		} catch (NullPointerException n) {
			index = 0;
		}

		return index;
	}

	public void add(int data) {
		Node lastNode = this.forwardTravverse();
		Node newNode = new Node(data, lastNode, null);
		lastNode.setNext(newNode);

	}
	
	public void addBackward(int data) {
		Node lastNode = this.backwardTravverse();
		Node newNode = new Node(data, null, lastNode);
		lastNode.setPrev(newNode);

	}

	public static void main(String[] args) {
		Node doublyLinkedList = new Node();
		System.out.println(doublyLinkedList.size());
		doublyLinkedList.add(15);
		//doublyLinkedList.addBackward(10);
		System.out.println(doublyLinkedList);
		System.out.println(doublyLinkedList.size());
	}

	@Override
	public String toString() {
		String nextString = "";
		if (this.next != null) {
			nextString = this.next.toString();
		}

		String prev = (this.prev != null) ? String.valueOf(this.prev.data)
				: "null";
		String next = (this.next != null) ? String.valueOf(this.next.data)
				: "null";

		String currentNode = "[Prev: " + prev + ", Data: " + data + ", Next: "
				+ next + "]";
		return currentNode + (nextString.equals("") ? "" : " , " + nextString);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
