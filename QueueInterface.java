
public interface QueueInterface<T> {
	public boolean isEmpty();
	
	public T dequeue();
	public void enqueue(T element);
}
