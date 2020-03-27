
public class CircularLinkedList {

	private SingleNode head;
	private SingleNode tail;
	private int size;
	
	public SingleNode getHead() {
		return head;
	}
	public void setHead(SingleNode head) {
		this.head = head;
	}
	public SingleNode getTail() {
		return tail;
	}
	public void setTail(SingleNode tail) {
		this.tail = tail;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public void createCircularLinkedList(int value) {
		//head = new SingleNode();
		SingleNode node = new SingleNode();
		node.setData(value);
		node.setNext(node);
		head = node;
		tail = node;
		size = 1;
 	}
	
	public void insertIntoCircularLinkedList(int value, int location) {
		SingleNode node = new SingleNode();
		node.setData(value);
		if(location==0) {
			node.setNext(head);
			head = node;
			tail.setNext(node);
			size++;
		}
		else if(location>=size) {
			node.setNext(head);
			tail.setNext(node);
			tail=node;
			size++;
		}
		else {
			/*
			 * SingleNode temp = head; for(int i = 0;i <= location-1; i++) { temp =
			 * temp.getNext(); } temp.setNext(node); node.setNext(temp.getNext()); size++;
			 */
			SingleNode tempNode = head;
			int index = 0;
			while (index < location - 1) {// loop till we reach specified node
				tempNode = tempNode.getNext();
				index++;
			}// insert new node after tempNode
			node.setNext(tempNode.getNext());
			tempNode.setNext(node);		
			size++;
		}
	}
	public boolean ifLinkedListExist() {
		if (size > 0) {
			return true;
		}
		return false;
	}
	public void traverseLinkedList() {
		if (ifLinkedListExist()) {
			SingleNode tempNode = head;
			for (int i = 0; i < getSize(); i++) {
				System.out.print(tempNode.getData());
				if (i != getSize()-1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.getNext();
			}
		}else {
			System.out.println("Linked List does not exists !");
		}
		System.out.println("\n");
	}
}
