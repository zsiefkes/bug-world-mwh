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
		Bug b = new Bug();
		System.out.println(b.toText());
		Bug c = new Bug("spider", "charlotte", '*', 7, 13, 50);
		System.out.println(c.toText());
		b = makeUserBug();
		System.out.println(b.toText());
	}

}
