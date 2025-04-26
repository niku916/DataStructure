package NewDoublyLinkedList;

public class NodeImpl {

	public static void main(String[] args) {
		Node node = new Node();
		node.addAtBeginning("Nishant");
		Node add = node.add("Shaswat");
		 node.add("Mukul");
		// node.add("Vinit");
		// node.add("Ashish");
		// node.add("Siddhant");
		System.err.println(add);
	}
}
