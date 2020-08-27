import java.util.*;

public class World {
	private ArrayList<Bug> bugs = new ArrayList<Bug>();
	
	private int width;
	private int height;
	
	public World(int w, int h) {
		width = w;
		height = h;
		for (int i = 0; i < 10; i++) {
			int x = (int)(Math.random() * width);
			int y = (int)(Math.random() * height);
			if (Math.random() < 0.5) {
				addBug(new Butterfly("bob", x, y, 50));
			} else {
				addBug(new Beetle("bob", x, y, 50));
			}
		}
	}
	
	public void addBug(Bug b) {
		if (b.getX() < 0 || b.getX() >= width
				|| b.getY() < 0 || b.getY() >= height) {
			return;
		}
		bugs.add(b);
	}
}
