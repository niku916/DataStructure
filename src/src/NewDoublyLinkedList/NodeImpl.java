package NewDoublyLinkedList;

public class NodeImpl {

	public static void main(String[] args) {
		Node node = new Node();

		node.add("Mukul");
		node.add("Vinit");
		node.add("Ashish");
		node.addback("Siddhant");
		node.addback("Nishant");
		System.out.println(node);
		System.out.println(node.size());
		node.inserByIndex(1, "Vaibhav");
		System.out.println(node);
		System.out.println(node.size());
		node.deleteByIndex(1);
		System.out.println(node);
		System.out.println(node.size());
	}
}
