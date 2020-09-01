import java.util.Comparator;

public class NearestBugComparator implements Comparator<Bug> {

	private int x, y;
	
	public NearestBugComparator(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	private int distance(int ox, int oy) {
		return Math.abs(ox - x) + Math.abs(oy - y);
	}
	
	@Override
	public int compare(Bug o1, Bug o2) {
		int d1 = distance(o1.getX(), o1.getY());
		int d2 = distance(o2.getX(), o2.getY());
		if (d1 < d2)
			return -1;
		if (d1 > d2)
			return 1;
		return 0;
	}

}
