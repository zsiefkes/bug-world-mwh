import java.util.*;

public class World {
	private ArrayList<Bug> bugs = new ArrayList<Bug>();
	
	private int width;
	private int height;
	
	public World(int w, int h) {
		width = w;
		height = h;
	}
	
	public void addBug(Bug b) {
		bugs.add(b);
	}
}
