import java.util.List;

public class Butterfly extends Bug {

	public Butterfly(String name, int x, int y, int en) {
		super("Butterfly", name, 'B', x, y, en);
	}

	public void move(String dir) {
		super.move(dir);
		super.move(dir);
	}

	protected String smellFood(World w) {
		List<Plant> nearbyPlants = w.getPlantsInRange(getX(), getY(), 6);
		nearbyPlants.sort(new BestPlantComparator(getX(), getY()));
		if (nearbyPlants.size() > 0) {
			Plant p = nearbyPlants.get(0);
			if (Math.random() < 0.5) {
				if (p.getY() < getY())
					return "N";
				if (p.getY() > getY())
					return "S";
			}
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
