
public class QueueNode<T> {
	//instance variables
	private T info;
	private QueueNode<T> link;
	
	//constructors
	public QueueNode(T info) {
		this.info = info;
		link = null;
	}
	
	//methods
	public void setInfo(T info) {
		this.info = info;
	}
	
	public T getInfo() {
		return info;
	}
	
	public void setLink(QueueNode<T> link) {
		this.link = link;
	}
	
	public QueueNode<T> getLink() {
		return link;
	}
}
