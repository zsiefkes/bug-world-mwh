
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
	private int id;
	
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