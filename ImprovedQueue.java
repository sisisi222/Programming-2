
public class ImprovedQueue<T> implements QueueInterface<T> {
	//instance variable
	private QueueNode<T> front;
	
	//constructors:
	public ImprovedQueue() {
		front = null;
	}
	
	//methods
	@Override
	public boolean isEmpty() {
		if(front == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public T dequeue() {
		if(isEmpty() == true) {
			return null;
		}
		else {
			T frontElement;
			frontElement = front.getInfo();
			front = front.getLink();
			return frontElement;
		}
	
	}
	
	@Override
	public void enqueue(T element) {		
		QueueNode<T> newNode = new QueueNode<T>(element);
		QueueNode<T> rear = new QueueNode<T>(element);
		if(isEmpty() == true) {
			front = newNode;
			rear = newNode;
		}
		else {
			rear.setLink(newNode);
			rear = newNode;
		}
	}
}
