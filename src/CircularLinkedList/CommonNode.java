package CircularLinkedList;

public class CommonNode {

	String name;
	CommonNode next;

	public CommonNode add(String name) {
		CommonNode lastNode = this.traverse();
		CommonNode newNode = new CommonNode(name, this);
		lastNode.setNext(newNode);
		return newNode;
	}

	public CommonNode insertByIndex(String name, int index) {
		CommonNode lastNode = this.traverse(index - 1);
		CommonNode newNode = new CommonNode(name, lastNode.getNext());
		lastNode.setNext(newNode);
		return lastNode;
	}

	public CommonNode deleteByIndex(int index) {
		CommonNode lastNode = this.traverse(index - 1);
		lastNode.setNext(lastNode.getNext().getNext());
		return lastNode;
	}

	public CommonNode traverse() {
		CommonNode lastNode = this;
		while (lastNode.next != null && lastNode.next != this) {
			lastNode = lastNode.next;
		}
		return lastNode;
	}

	public CommonNode traverse(int index) {
		CommonNode lastNode = this;

		while (index != 0 && lastNode.next != null && lastNode.next != lastNode) {
			index--;
			lastNode = lastNode.next;
		}
		return lastNode;
	}

	public int size() {
		CommonNode firstNode = this;
		int noOfData = 0;
		while (firstNode.next != null && firstNode.next != firstNode) {
			noOfData++;
			firstNode.next = firstNode.next.next;
		}

		return noOfData;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Node[name: ").append(name);

		CommonNode current = next;
		while (current != null && current != this) {
			sb.append(", next: Node[name: ").append(current.name);
			current = current.next;
		}

		if (current == this) {
			sb.append(", next: (").append(name).append(")");
		} else {
			sb.append(", next: null");
		}

		return sb.toString();
	}

	public CommonNode(String name, CommonNode next) {
		super();
		this.name = name;
		this.next = next;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CommonNode getNext() {
		return next;
	}

	public void setNext(CommonNode next) {
		this.next = next;
	}

}
