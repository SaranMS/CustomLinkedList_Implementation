
public class SingleLinkedList {

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

	public void createSingleLinkedList(int value) {
		head = new SingleNode();
		SingleNode node = new SingleNode();
		node.setData(value);
		node.setNext(null);
		head = node;
		tail = node;
		size = 1;
	}

	public void addToSingleLinkedList(int nodeValue, int location) {
		/*
		 * 1) First loc - As the head 2) Last loc - As the tail 3) Middle
		 * 
		 */
		SingleNode node = new SingleNode();
		node.setData(nodeValue);
		if (location == 0) {
			node.setNext(head);
			head = node;
		} else if (location >= size) {
			node.setNext(null);
			tail.setNext(node);
			tail = node;
		} else {
			SingleNode temp = head;
			for (int i = 0; i < location - 1; i++) {
				temp = temp.getNext();
			}
			temp.setNext(node);
			
			node.setNext(temp.getNext());
		}
		size++;
	}

	public boolean ifLinkedListExist() {
		if (size > 0) {
			return true;
		}
		return false;
	}

	public void traverseLinkedList() {
		SingleNode temp = head;
		for(int i=0;i<getSize()-1;i++) {
			System.out.println(" "+temp.getData());
			temp=temp.getNext();
		}
	}
	
	public void deleteNodeAt(int location) {
		if(location==0) {
			head = head.getNext();
			size--;
			if(size==0) {
				tail = null;
			}
		}
		else if(location>=size) {
			SingleNode temp =head;
			for(int i=0;i<size-1;i++) {
				temp = temp.getNext();
				
			}
			temp.setNext(null);
			tail=temp;
			size--;
		}
		else {
			SingleNode temp =head;
			for(int i=0;i<location-1;i++) {
				temp = temp.getNext();
				
			}
			temp.setNext(temp.getNext().getNext());
			size--;
		}
	}
}
