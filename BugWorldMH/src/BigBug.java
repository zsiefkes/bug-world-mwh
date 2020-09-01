
public class BigBug extends Bug {

	private int width, height;
	
	public BigBug(int w, int h, String sp, String n, char sym, int x, int y, int e) {
		super(sp, n, sym, x, y, e);
		this.width = w;
		this.height = h;
	}
	
	public boolean contains(int x, int y) {
		if (x < getX()) return false;
		if (x >= getX() + this.width) return false;
		if (y < getY()) return false;
		if (y >= getY() + this.height) return false;
		return true;
	}
	
	protected boolean onObstacle(World w) {
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				if (w.obstacleAt(getX() + i, getY() + j))
					return true;
			}
		}
		return false;
	}
}
