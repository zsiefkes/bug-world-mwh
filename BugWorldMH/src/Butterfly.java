
public class Butterfly extends Bug {

	public Butterfly(String name, int x, int y, int en) {
		super("Butterfly", name, 'B', x, y, en);
	}
	
	public void move(String dir) {
		super.move(dir);
		super.move(dir);
	}
	
	// Could rename this to move instead:
	public void jump(String dir) {
		if ("N".equals(dir))
			setY(getY() - 2);
		if ("S".equals(dir))
			setY(getY() + 2);
		if ("W".equals(dir))
			setX(getX() - 2);
		if ("E".equals(dir))
			setX(getX() + 2);
	}

}
