import java.util.Scanner;

public class EntryPoint {
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter species:");
		String species = scan.nextLine();
		
		System.out.println("X coordinate");
		int x = scan.nextInt();
		System.out.println("Y coordinate");
		int y = scan.nextInt();
		// discard empty end of line
		scan.nextLine();
		
		System.out.println("species: " + species + "x " + x + "y " + y);

	}

}
