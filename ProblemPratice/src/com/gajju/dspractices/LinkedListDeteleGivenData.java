package com.gajju.dspractices;

public class LinkedListDeteleGivenData {

	private int data;
	private LinkedListDeteleGivenData next;

	public LinkedListDeteleGivenData(int data) {
		this.data = data;
		this.next = null;
	}

	public LinkedListDeteleGivenData() {

	}

	LinkedListDeteleGivenData head = null;

	public void push(int data) {
		LinkedListDeteleGivenData dataNode = new LinkedListDeteleGivenData(data);
		/// Node node
		if (head == null) {
			head = new LinkedListDeteleGivenData(data);
			return;

		}
		dataNode.next = null;
		LinkedListDeteleGivenData temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = dataNode;
		return;

	}

	public int deteteGivenData(int data) {
		LinkedListDeteleGivenData temp = head;
		if (temp == null) {
			return 0;
		}
		if(temp.data==data)
		{
			head=temp.next;
			return temp.data;
		}
		LinkedListDeteleGivenData prev = null;
		while (temp != null && temp.data != data) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null)
			System.out.println("data not present in the list");
		int deletedData = temp.data;
		prev.next = temp.next;
		temp = prev;
		return deletedData;

	}

	public void printList() {
		LinkedListDeteleGivenData temp = head;
		if (temp == null) {
			System.out.println("linked List is Empty !");
		}
		while (temp != null) {
			System.out.println("data:" + temp.data);
			temp = temp.next;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListDeteleGivenData node = new LinkedListDeteleGivenData();
		node.push(5);
		node.push(6);
		node.push(7);
		node.push(8);
		node.push(9);
		node.push(10);
		node.printList();
		System.out.println("dateledData:" + node.deteteGivenData(10));
		node.printList();

	}

}
