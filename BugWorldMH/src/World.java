import java.util.*;

public class World {
	private ArrayList<Bug> bugs = new ArrayList<Bug>();

	private int width;
	private int height;

	public World(int w, int h) {
		width = w;
		height = h;
		for (int i = 0; i < 10; i++) {
			int x = (int) (Math.random() * width);
			int y = (int) (Math.random() * height);
			if (Math.random() < 0.5) {
				addBug(new Butterfly("bob", x, y, 50));
			} else {
				addBug(new Beetle("bob", x, y, 50));
			}
		}
	}

	public void drawWorld() {
		System.out.print('+');
		for (int i = 0; i < width; i++)
			System.out.print('-');
		System.out.println('+');
		for (int y = 0; y < height; y++) {
			System.out.print('|');
			for (int x = 0; x < width; x++) {
				int i;
				for (i = 0; i < bugs.size(); i++) {
					Bug b = bugs.get(i);
					if (b.getX() == x && b.getY() == y) {
						System.out.print(b.getSymbol());
						break;
					}
				}
				if (i == bugs.size())
					System.out.print(' ');
			}
			System.out.println('|');
		}
		System.out.print('+');
		for (int i = 0; i < width; i++)
			System.out.print('-');
		System.out.println('+');
	}

	public void addBug(Bug b) {
		if (b.getX() < 0 || b.getX() >= width || b.getY() < 0 || b.getY() >= height) {
			return;
		}
		bugs.add(b);
	}
}
