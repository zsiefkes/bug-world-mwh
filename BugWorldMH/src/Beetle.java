
public class Beetle extends Bug {

	public Beetle(String n, int x, int y, int e) {
		super("Beetle", n, '.', x, y, e);
	}

	public Beetle() {
		super();
		setSpecies("Beetle");
		setSymbol('.');
	}

}
