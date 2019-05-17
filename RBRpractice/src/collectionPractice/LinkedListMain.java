package collectionPractice;

import java.util.Scanner;

public class LinkedListMain {
	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("How many elements you want to enter: ");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the data :");

			int data = scanner.nextInt();
			linkedList.insert(data);

		}

		/*
		 * while(string.equals("y")) {
		 * System.out.println("Do you want to enter a node in the Linked List:");
		 * string=scanner.nextLine(); System.out.println("Enter the data: "); int data =
		 * scanner.nextInt(); linkedList.insert(data); } //
		 */
		System.out.println("---------------------------------------------------");
		linkedList.printNodeElements((LinkedList<Integer>) LinkedList.headLinkedList);
		System.out.println("---------------------------------------------------");

		for (int i = 0; i < n; i++) {
			System.out.println("enter the number to delete: ");
			int dataToDelete = scanner.nextInt();
			linkedList.deleteNode(dataToDelete);
			System.out.println("Here is the list after deleting the node: ");
			linkedList.printNodeElements((LinkedList<Integer>)LinkedList.headLinkedList);
			if (LinkedList.headLinkedList != null && linkedList.lastNode != null) {
				System.out.println("\nhead node is:" + LinkedList.headLinkedList.data + "\nlast node is: "
						+ linkedList.lastNode.data);

			} else {
				System.out.println("End of operation.");
			}

		}

	}

}
