import java.util.ArrayList;
import java.util.Scanner;

public class EntryPoint {

	public static Bug makeUserBug() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter species:");
		String species = scan.nextLine();
		System.out.println("Enter name:");
		String name = scan.nextLine();
		System.out.println("Enter symbol:");
		char symbol = scan.nextLine().charAt(0);
		System.out.println("Enter x:");
		int x = scan.nextInt();
		System.out.println("Enter y:");
		int y = scan.nextInt();
		System.out.println("Enter energy:");
		int energy = scan.nextInt();

		return new Bug(species, name, symbol, x, y, energy);
	}

	public static void main(String[] args) {
		World w = new World(20, 10);
		for (int i = 0; i < 5; i++) {
			w.drawWorld();
			w.updateWorld();
		}
	}

}
