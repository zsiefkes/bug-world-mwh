import java.util.Comparator;

public class BiggestPlantComparator implements Comparator<Plant> {

	@Override
	public int compare(Plant arg0, Plant arg1) {
		if (arg0.getSize() > arg1.getSize())
			return -1;
		if (arg0.getSize() < arg1.getSize())
			return 1;
		return 0;
	}
	
}
