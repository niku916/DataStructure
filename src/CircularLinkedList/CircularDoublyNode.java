package CircularLinkedList;

public class CircularDoublyNode {

	CircularDoublyNode prev;
	String name;
	CircularDoublyNode next;

	public CircularDoublyNode add(String name) {
		CircularDoublyNode lastNode = this.traverse(); // [null,Nishant,null]
		CircularDoublyNode newNode = new CircularDoublyNode(lastNode, name,
				this);
		lastNode.setNext(newNode);
		this.setPrev(newNode);
		return lastNode;
	}

	
	////
	public CircularDoublyNode traverse() {
		CircularDoublyNode lastNode = this;
		while (lastNode.next != null && lastNode.next != this) {
			lastNode = lastNode.next;
		}
		return lastNode;
	}

	public CircularDoublyNode traverse(int index) {
		CircularDoublyNode lastNode = this;
		while (index != 0 && lastNode.next != null && lastNode.next != this) {
			index--;
			lastNode = lastNode.next;
		}
		return lastNode;
	}

	public CircularDoublyNode insertByIndex(String name, int index) {
		CircularDoublyNode lastNode = this.traverse(index - 1); // [null,Nishant,null]
		CircularDoublyNode newNode = new CircularDoublyNode(lastNode, name, null);
		newNode.setNext(lastNode.getNext());
		lastNode.setNext(newNode);
		return lastNode;
	}

	public CircularDoublyNode(CircularDoublyNode prev, String name,
			CircularDoublyNode next) {
		this.prev = prev;
		this.name = name;
		this.next = next;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		CircularDoublyNode current = this;
		do {
			String prev = (current.prev != null) ? current.prev.name : "null";
			String next = (current.next != null) ? current.next.name : "null";
			sb.append("[Prev: ").append(prev).append(", Name: ")
					.append(current.name).append(", Next: ").append(next)
					.append("]");
			current = current.next;
			if (current != this)
				sb.append(" , ");
		} while (current != null && current != this);
		return sb.toString();
	}

	public CircularDoublyNode getPrev() {
		return prev;
	}

	public void setPrev(CircularDoublyNode prev) {
		this.prev = prev;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CircularDoublyNode getNext() {
		return next;
	}

	public void setNext(CircularDoublyNode next) {
		this.next = next;
	}

}
