package week3;

public class Node {
	
	private String item;
	private Node link;
	
	public Node() {
		link = null;
		item = null;
	}
	
	public Node(String newItem) {
		setData(newItem);
	}
	
	public Node(String newItem,Node linkValue) {
		setData(newItem); link=linkValue;
	}
	
	public void setData(String newItem) {
		item = newItem;
	}
	
	public void setLink(Node newLink) {
		link=newLink;
	}
	
	public String getItem() {
		return item;
	}
	
	public Node getLink() {
		return link;
	}
}
