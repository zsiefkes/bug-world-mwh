import java.util.Comparator;

public class BestPlantComparator implements Comparator<Plant> {
	private int x, y;
	
	public BestPlantComparator(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	private int distance(int ox, int oy) {
		return Math.abs(ox - x) + Math.abs(oy - y);
	}
	
	@Override
	public int compare(Plant arg0, Plant arg1) {
		// First find bigger
		if (arg0.getSize() > arg1.getSize())
			return -1;
		if (arg0.getSize() < arg1.getSize())
			return 1;
		// Then find nearer
		int d1 = distance(arg0.getX(), arg0.getY());
		int d2 = distance(arg1.getX(), arg1.getY());
		if (d1 < d2)
			return -1;
		if (d1 > d2)
			return 1;
		// It's a tie
		return 0;
	}


}
