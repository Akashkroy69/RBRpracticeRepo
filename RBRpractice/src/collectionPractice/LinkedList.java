package collectionPractice;

import java.util.Scanner;

public class LinkedList<E> {
	
	static LinkedList<?> headLinkedList;
	LinkedList<E> nextNode, lastNode;
	E data;

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

	

}
