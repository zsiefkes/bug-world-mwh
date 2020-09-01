import java.util.*;

public class World {
	private ArrayList<Bug> bugs = new ArrayList<Bug>();
	private ArrayList<Plant> plants = new ArrayList<Plant>();

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
		
		for (int i = 0; i < 10; i++) {
			int x = (int) (Math.random() * width);
			int y = (int) (Math.random() * height);
			int s = (int) (Math.random() * 10);
			plants.add(new Plant(s, x, y));
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
				if (i == bugs.size()) {
					i = 0;
					for (; i < plants.size(); i++) {
						Plant p = plants.get(i);
						if (p.getX() == x && p.getY() == y) {
							System.out.print(p.getSymbol());
							break;
						}
					}
					if (i == plants.size())
						System.out.print(' ');
				}
			}
			System.out.println('|');
		}
		System.out.print('+');
		for (int i = 0; i < width; i++)
			System.out.print('-');
		System.out.println('+');
	}
	
	public void updateWorld() {
		for (Bug b : bugs) {
			b.tick(this);
		}
	}

	public void updateWorld1() {
		for (Bug b : bugs) {
			b.moveRandom();
			if (b.getX() < 0)
				b.setX(0);
			if (b.getX() >= width)
				b.setX(width - 1);
			if (b.getY() < 0)
				b.setY(0);
			if (b.getY() >= height)
				b.setY(height - 1);
		}
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void addBug(Bug b) {
		if (b.getX() < 0 || b.getX() >= width || b.getY() < 0 || b.getY() >= height) {
			return;
		}
		bugs.add(b);
	}
	

	public void addPlant(Plant p) {
		if (p.getX() < 0 || p.getX() >= width || p.getY() < 0 || p.getY() >= height) {
			return;
		}
		plants.add(p);
	}
}
