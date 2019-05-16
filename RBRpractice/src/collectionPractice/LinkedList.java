package collectionPractice;

import java.util.Scanner;

import javax.xml.stream.events.EndDocument;

public class LinkedList {
	private static LinkedList headLinkedList;
	LinkedList nextNode, lastNode;
	private int data;

	public LinkedList() {
		nextNode = null;
		headLinkedList = null;

	}

	// At the time of intantiating a new object one node will be created
	public LinkedList(int data) {
		this.data = data;
		nextNode = null;

	}

	public LinkedList insert(int data) {
		LinkedList newNodeLinkedList = new LinkedList(data);

		if (headLinkedList == null) {
			headLinkedList = newNodeLinkedList;
			lastNode = newNodeLinkedList;
		} else {
			LinkedList tempLinkedList = headLinkedList;

			while (tempLinkedList.nextNode != null) {
				tempLinkedList = tempLinkedList.nextNode;

			}
			tempLinkedList.nextNode = newNodeLinkedList;
			lastNode = newNodeLinkedList;
		}
		return headLinkedList;
	}

	public void printNodeElements(LinkedList headLinkedList) {
		if (headLinkedList == null) {
			System.out.println("Linked List is empty.");
			return;

		} else {
			LinkedList temp = headLinkedList;

			System.out.println(" Here are the elements in the Linked List");
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.nextNode;
			}
		}
		return;
	}

	public LinkedList deleteNode(int data) {
		LinkedList tmpNode;
		if (headLinkedList == null) {
			System.out.println("The Linked list is empty.");

			return headLinkedList;
		}
		if (headLinkedList.data == data) {
			LinkedList tempNode = headLinkedList;
			headLinkedList = headLinkedList.nextNode;
			return tempNode;
		} else if (headLinkedList == lastNode) {

			System.out.println("The last element has been deleted.");
			headLinkedList = lastNode = null;
			return headLinkedList;

		} else if (lastNode.data == data) {

			tmpNode = headLinkedList;
			while (!tmpNode.nextNode.equals(lastNode)) {
				tmpNode = tmpNode.nextNode;
			}
			LinkedList retuLinkedList = lastNode;
			tmpNode.nextNode = null;
			lastNode = tmpNode;
			return retuLinkedList;
		} else {
			tmpNode = headLinkedList;
			while (tmpNode.nextNode.data != data) {
				tmpNode = tmpNode.nextNode;
				if (tmpNode.nextNode == lastNode) {
					System.out.println("Number is not in the list.");
					return null;

				}
			}
			LinkedList tempLinkedList2 = tmpNode.nextNode.nextNode;
			LinkedList returLinkedList = tmpNode.nextNode;
			tmpNode.nextNode = tempLinkedList2;
			return returLinkedList;

		}
	}

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();

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
		linkedList.printNodeElements(LinkedList.headLinkedList);
		System.out.println("---------------------------------------------------");

		for (int i = 0; i < n; i++) {
			System.out.println("enter the number to delete: ");
			int dataToDelete = scanner.nextInt();
			linkedList.deleteNode(dataToDelete);
			System.out.println("Here is the list after deleting the node: ");
			linkedList.printNodeElements(headLinkedList);
			if (LinkedList.headLinkedList!=null&&linkedList.lastNode!=null) {
				System.out.println("\nhead node is:"+LinkedList.headLinkedList.data+"\nlast node is: "+linkedList.lastNode.data);
				
			}
			else {
				System.out.println("End of operation.");
			}
			

		}

	}

}
