
public class Element<T> {

	T value;
	int priority;
	
	private Element(T value,int priority) {
		this.value=value;
		this.priority=priority;
	}
}
