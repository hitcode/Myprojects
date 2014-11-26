
public class BST<T extends Comparable<T>> {

	private T t;
	BST<T> left;
	BST<T> right;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public BST<T> getLeft() {
		return left;
	}
	public void setLeft(BST<T> left) {
		this.left = left;
	}
	public BST<T> getRight() {
		return right;
	}
	public void setRight(BST<T> right) {
		this.right = right;
	}
	
	public BST(T t1)
	{
		this.t=t1;
		left=null;
		right=null;
	}
	
}
