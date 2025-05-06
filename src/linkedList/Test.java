package linkedList;

public class Test {

	public static void main(String[] args) {

		SinglyLinkedList list2 = new SinglyLinkedList();
		list2.add("10");
		list2.add("20");
		list2.add("30");
		list2.add("40");
		list2.add("50");
		list2.add("60");
		System.err.println(list2.printSingly());

		DoublyLinkedList list3 = new DoublyLinkedList();
		list3.add("Nishant");
		list3.add("Jayant");
		list3.add("Vinit");
		list3.add("Siddhant");
		list3.add("Mukul");
		list3.add("Vivek");
		System.out.println(list3.printDoubly());

		CircularLinkedList list4 = new CircularLinkedList();
		list4.add("Ashish");
		list4.add("Shaswat");
		list4.add("Tarun");
		list4.add("Kamal");
		list4.add("Pawan");
		list4.add("Sagar");

		System.err.println(list4.printCircular());

	}

}
