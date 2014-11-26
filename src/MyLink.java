
public class MyLink<T> {

	
	T t;
	MyLink<T> next;
	
	public MyLink(T a)
	{
		this.t=a;
		next=null;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public MyLink<T> getNext() {
		return next;
	}
	public void setNext(MyLink<T> next) {
		this.next = next;
	}
	
}

