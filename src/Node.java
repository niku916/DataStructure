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

	public Node backwardForward() {
		Node lastNode = this;
		if (lastNode.prev == null) {
			return lastNode;
		}
		return lastNode.prev.backwardForward();
	}

	public void add(int data) {
		Node lastNode = this.forwardTravverse();
		Node newNode = new Node(data, this,null);
		lastNode.setNext(newNode);
		

	}

	public static void main(String[] args) {
		Node doublyLinkedList = new Node(11,null,null);
		doublyLinkedList.add(15);
		doublyLinkedList.add(10);
		System.out.println(doublyLinkedList);
	}

	@Override
	public String toString() {
		String nextString = "";
		if (this.next != null) {
			nextString = this.next.toString();
		}
		return data + (nextString.equals("") ? "" : " , " + nextString);
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
