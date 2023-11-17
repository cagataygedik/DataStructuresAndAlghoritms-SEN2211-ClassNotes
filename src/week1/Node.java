package week1;

public class Node {
	
	private String item;
	private int count;
	private Node link;
	
	public Node() {
		link = null;
		item = null;
		count = 0;
	}
	
	public Node(String newItem, int newCount, Node linkValue) {
		setData(newItem,newCount); link=linkValue;
	}
	
	public void setData(String newItem, int newCount) {
		item = newItem; count=newCount;
	}
	
	public void setLink(Node newLink) {
		link=newLink;
	}
	
	public String getItem() {
		return item;
	}
	
	public int getCount() {
		return count;
	}
	
	public Node getLink() {
		return link;
	}
	
}
