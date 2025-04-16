package doublyLinkList;

public class Node {
	int data;
	Node prev;
	Node next;

	public Node(int data) {
		super();
		this.data = data;
		this.prev = null;
		this.next = null;
	}

	public void addNode(int data) {
		Node headNode = this;
		Node newNode = new Node(data);
		
		headNode.setNext(newNode);
		newNode.getNext().setPrev(headNode.getNext());
	}

	public static void main(String[] args) {
		Node headNode = new Node(4);
		headNode.addNode(15);
		// headNode.addNode(5);
		System.out.println(headNode);
	}

	public String toString() {
		return "Node [prev=" + prev + ", data=" + data + ", next=" + next + "]";
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
