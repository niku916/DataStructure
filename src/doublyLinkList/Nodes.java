package doublyLinkList;

public class Nodes {
	String name;
	Node prev;
	Node next;

	public Nodes() {
	}

	public Nodes(String name, Node prev, Node next) {

		this.name = name;
		this.prev = prev;
		this.next = next;
	}

	@Override
	public String toString() {
		return "Nodes [prev=" + prev + ", data=" + name + ", next=" + next
				+ "]";
	}

}
