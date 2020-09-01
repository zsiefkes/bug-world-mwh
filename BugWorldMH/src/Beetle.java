import java.util.List;

public class Beetle extends Bug {

	public Beetle(String n, int x, int y, int e) {
		super("Beetle", n, '.', x, y, e);
	}

	public Beetle() {
		super();
		setSpecies("Beetle");
		setSymbol('.');
	}
	
	protected String smellFood(World w) {
		List<Bug> nearbyBugs = w.getBugsInRange(getX(), getY(), 6);
		nearbyBugs.remove(this);
		if (nearbyBugs.size() > 0) {
			Bug p = nearbyBugs.get(0);
			if (p.getX() < getX())
				return "W";
			if (p.getX() > getX())
				return "E";
			if (p.getY() < getY())
				return "N";
			if (p.getY() > getY())
				return "S";
		}
		return super.smellFood(w);
	}


}
