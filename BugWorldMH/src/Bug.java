
public class Bug {
	// species (String), name (String), a symbol (char),
	// horizontal position called x (int),
	//vertical position called y (int), energy (int),
	//and a unique ID (int)
	private String species;
	private String name;
	private char symbol;
	private int x;
	private int y;
	private int energy;
	private static int counter = 0;
	private int id = counter++;
	
	public Bug(String sp, String n, char sym, int x, int y, int e) {
		species = sp;
		name = n;
		symbol = sym;
		this.x = x;
		this.y = y;
		energy = e;
	}
	
	public Bug() {
		species = "bug";
		name = "fred";
		symbol = 'b';
		this.x = 5;
		this.y = 10;
		energy = 100;		
	}
	
	public void move(String dir) {
		if ("N".equals(dir))
			y--;
		if ("S".equals(dir))
			y++;
		if ("W".equals(dir))
			x--;
		if ("E".equals(dir))
			x++;
	}
	
	public void tick(World w) {
		int oldX = x;
		int oldY = y;
		String dir = this.smellFood(w);
		this.move(dir);
		int i = 0;
		while (i < 10 && (x < 0 || x >= w.getWidth() || y < 0 || y >= w.getHeight()
				|| this.onObstacle(w))) {
			x = oldX;
			y = oldY;
			this.moveRandom();
			i++;
		}
	}
	
	protected boolean onObstacle(World w) {
		return w.obstacleAt(x, y);
	}

	/** Returns true if this bug contains the point (x, y). **/
	public boolean contains(int x, int y) {
		return x == this.x && y == this.y;
	}
	
	protected String smellFood(World w) {
		// Didn't smell any food - try a random direction
		double d = Math.random();
		if (d < 0.25)
			return "N";
		else if (d < 0.5)
			return "S";
		else if (d < 0.75)
			return "W";
		else
			return "E";
	}
	
	public void moveRandom() {
		double d = Math.random();
		if (d < 0.25)
			move("N");
		else if (d < 0.5)
			move("S");
		else if (d < 0.75)
			move("W");
		else
			move("E");
	}
	
	public String toString() {
		return species + " '" + name + "'";
	}
	
	public String toText() {
		return "Species: " + species +
				"\nName: " + name +
				"\nSymbol: " + symbol +
				"\nx: " + x +
				"\ny: " + y +
				"\nenergy: " + energy +
				"\nid: " + id;
	}
	
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSymbol() {
		return symbol;
	}
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
