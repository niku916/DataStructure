package CircularLinkedList;

public class CommonImpl {

	public static void main(String[] args) {

		CommonNode headnNode = new CommonNode("Nishant", null);
		headnNode.add("VIVEK");
		headnNode.add("Siddhant");
		headnNode.add("Ashish");
		headnNode.add("Vinit");
		headnNode.add("Mukul");
		headnNode.add("Jayant");
		System.out.println(headnNode);
		headnNode.insertByIndex("Kamal", 2);
		System.out.println(headnNode);
		headnNode.deleteByIndex(2);
		System.out.println("headnNode-----" + headnNode);
		// System.out.println(headnNode.size());

		CommonNode headnNode1 = new CommonNode("Nishant", null);
		headnNode1.add("VIVEK");
		headnNode1.add("Siddhant");
		headnNode1.add("Ashish");
		headnNode1.add("Vinit");
		headnNode1.add("Mukul");
		headnNode1.add("Jayant");
		System.out.println("headnNode1------" + headnNode1);
		System.out.println("headnNode-------" + headnNode);
		boolean equals = headnNode.equals(headnNode1);
		System.out.println("kdshfjdshfuki..."+equals);
		System.out.println(headnNode1.isequals(headnNode));
		System.out.println(headnNode1.contains("Jayant"));

		// CircularDoublyNode circularDoublyNode = new CircularDoublyNode(null,
		// "Nishant", null);
		// circularDoublyNode.add("Vivek");
		// circularDoublyNode.add("Siddhant");
		// circularDoublyNode.add("Ashish");
		// circularDoublyNode.add("Vinit");
		// circularDoublyNode.add("Mukul");
		// circularDoublyNode.add("Jayant");
		// System.out.println(circularDoublyNode);
		// CircularDoublyNode insertByIndex =
		// circularDoublyNode.insertByIndex("Kamal", 2);
		// System.out.println(insertByIndex);

	}
}
