
public class Pair<T1, T2> {
	private T1 left;
	private T2 right;
	
	public Pair(T1 l, T2 r) {
		left = l;
		right = r;
	}
	
	public T1 getLeft() {
		return left;
	}
	
	public T2 getRight() {
		return right;
	}
}
