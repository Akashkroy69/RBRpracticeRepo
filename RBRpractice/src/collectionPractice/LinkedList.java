package collectionPractice;

import java.util.Scanner;

public class LinkedList<E> {
	
	private static LinkedList<?> headLinkedList;
	LinkedList<E> nextNode, lastNode;
	private E data;

	public LinkedList() {
		nextNode = null;
		headLinkedList = null;

	}

	// At the time of instantiating a new object one node will be created
	public LinkedList(E data) {
		this.data = data;
		nextNode = null;

	}

	public LinkedList<E> insert(E data) {
		LinkedList<E> newNodeLinkedList = new LinkedList<E>(data);

		if (headLinkedList == null) {
			headLinkedList = newNodeLinkedList;
			lastNode = newNodeLinkedList;
		} else {
			LinkedList<E> tempLinkedList = (LinkedList<E>) headLinkedList;

			while (tempLinkedList.nextNode != null) {
				tempLinkedList = tempLinkedList.nextNode;

			}
			tempLinkedList.nextNode = newNodeLinkedList;
			lastNode = newNodeLinkedList;
		}
		return (LinkedList<E>) headLinkedList;
	}

	public void printNodeElements(LinkedList<E> headLinkedList) {
		if (headLinkedList == null) {
			System.out.println("Linked List is empty.");
			return;

		} else {
			LinkedList<E> temp = headLinkedList;

			System.out.println(" Here are the elements in the Linked List");
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.nextNode;
			}
		}
		return;
	}

	public LinkedList<E> deleteNode(E data) {
		LinkedList<E> tmpNode;
		if (headLinkedList == null) {
			System.out.println("The Linked list is empty.");

			return (LinkedList<E>) headLinkedList;
		}
		if (headLinkedList.data == data) {
			tmpNode = (LinkedList<E>) headLinkedList;
			headLinkedList = headLinkedList.nextNode;
			return tmpNode;
		} else if (headLinkedList == lastNode) {

			System.out.println("The last element has been deleted.");
			headLinkedList = lastNode = null;
			return (LinkedList<E>) headLinkedList;

		} else if (lastNode.data == data) {

			tmpNode = (LinkedList<E>) headLinkedList;
			while (!tmpNode.nextNode.equals(lastNode)) {
				tmpNode = tmpNode.nextNode;
			}
			LinkedList<E> retuLinkedList = lastNode;
			tmpNode.nextNode = null;
			lastNode = tmpNode;
			return retuLinkedList;
		} else {
			tmpNode = (LinkedList<E>) headLinkedList;
			while (tmpNode.nextNode.data != data) {
				tmpNode = tmpNode.nextNode;
				if (tmpNode.nextNode == lastNode) {
					System.out.println("Number is not in the list.");
					return null;

				}
			}
			LinkedList<E> tempLinkedList2 = tmpNode.nextNode.nextNode;
			LinkedList<E> returLinkedList = tmpNode.nextNode;
			tmpNode.nextNode = tempLinkedList2;
			return returLinkedList;

		}
	}

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
			linkedList.printNodeElements((LinkedList<Integer>)headLinkedList);
			if (LinkedList.headLinkedList != null && linkedList.lastNode != null) {
				System.out.println("\nhead node is:" + LinkedList.headLinkedList.data + "\nlast node is: "
						+ linkedList.lastNode.data);

			} else {
				System.out.println("End of operation.");
			}

		}

	}

}
