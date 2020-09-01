import java.util.ArrayList;
import java.util.List;

// The Worm class is a little buggy, but it does show
// one way of going about this.
public class Worm extends Bug {
	private int length;
	private List<Pair<Integer, Integer>> tail = new ArrayList<>();
	
	public Worm(int l, String n, int x, int y, int e) {
		super("Worm", n, 'w', x, y, e);
		this.length = l;
		tail.add(new Pair<>(x, y));
	}
	
	public void move(String dir) {
		// Add a new segment to the tail, as long
		// as it's actually new
		if (tail.get(0).getLeft() != getX()
				|| tail.get(0).getRight() != getY())
			tail.add(0, new Pair<>(getX(), getY()));
		// Trim the last segment of the tail
		if (tail.size() > length)
			tail.remove(tail.size() - 1);
		super.move(dir);
		// If we moved back on ourselves, just undo the move.
		// This is not especially reliable!
		if (tail.size() > 1 && tail.get(1).getLeft() == getX()
				&& tail.get(1).getRight() == getY()) {
			this.setX(tail.get(0).getLeft());
			this.setY(tail.get(0).getRight());
		}
	}
	
	public boolean contains(int x, int y) {
		// This is an ugly hack to make the head & tail
		// look different - don't do this!
		// It works because we know how drawWorld works,
		// but it is a bad idea.
		if (x == getX() && y == getY()) {
			this.setSymbol('W');
			return true;
		}
		this.setSymbol('w');
		for (Pair<Integer, Integer> p : tail) {
			if (p.getLeft() == x && p.getRight() == y)
				return true;
		}
		return false;
	}

}
