package CircularLinkedList;

public class CommonImpl {

	public static void main(String[] args) {

		// CommonNode headnNode = new CommonNode("Nishant", null);
		// headnNode.add("VIVEK");
		// headnNode.add("Siddhant");
		// headnNode.add("Ashish");
		// headnNode.add("Vinit");
		// headnNode.add("Mukul");
		// headnNode.add("Jayant");
		// System.out.println(headnNode);
		// headnNode.insertByIndex("Kamal", 2);
		// System.out.println(headnNode);
		// headnNode.deleteByIndex(2);
		// System.out.println(headnNode);
		// System.out.println(headnNode.size());

		CircularDoublyNode circularDoublyNode = new CircularDoublyNode(null,
				"Nishant", null);
		circularDoublyNode.add("Vivek");
		circularDoublyNode.add("Siddhant");
		circularDoublyNode.add("Ashish");
		circularDoublyNode.add("Vinit");
		circularDoublyNode.add("Mukul");
		circularDoublyNode.add("Jayant");
		System.out.println(circularDoublyNode);
		CircularDoublyNode insertByIndex = circularDoublyNode.insertByIndex("Kamal", 2);
		System.out.println(insertByIndex);

	}
}
