import java.util.Scanner;

public class Menu {

	public static String menu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose an operation: ");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Exit");
        String choice = scanner.nextLine();
        return choice;
	}
	
}
