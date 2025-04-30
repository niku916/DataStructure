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

	public CommonNode traverse() {
	    CommonNode lastNode = this;
	    while (lastNode.next != null && lastNode.next != this) {
	    	lastNode = lastNode.next;
	    }
	    return lastNode;
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
