
public class Plant {
	private int size;
	private int x, y;
	
	public Plant(int size, int x, int y) {
		this.size = size;
		this.x = x;
		this.y = y;
	}
	
	public int getSize() {
		return size;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public char getSymbol() {
		return ("" + size).charAt(0);
	}
}
