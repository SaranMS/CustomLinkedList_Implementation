
public class SingleNode {

	private int data;
	private SingleNode next;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public SingleNode getNext() {
		return next;
	}
	public void setNext(SingleNode next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return  data + "";
	}
	
	
}
