import java.util.Scanner;

public class InputScanner {

	public static void main(String[] args) {
		
        String choice = Menu.menu();
        if(choice.equals("5")) {
        	System.out.println("Goodbye");
        	System.exit(0);
        }else if(choice != "1" || choice != "2" || choice != "3" || choice != "4") {
            	System.out.println("Invalid option");
            	main(args);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter #1");
        String number1 = scanner.nextLine();
        System.out.println("Enter #2");
        String number2 = scanner.nextLine();
        
        int num1 = Integer.parseInt(number1);  
        int num2 = Integer.parseInt(number2);  
        if(choice.equals("1")) {
        	Addition.add(num1, num2);
        	
        	System.out.println("Would you like to go again?");
        	System.out.println("1: Yes");
        	System.out.println("2: Exit");

        	String option = scanner.nextLine();
        	if(option == "1") {
        		main(args);
        	}else if(option == "2") {
        		System.exit(0);
        	}else {
        		System.out.println("error");
        		System.exit(0);
        	}
        }else if(choice.equals("2")) {
        	Subtraction.sub(num1, num2);
        	
        	System.out.println("Would you like to go again?");
        	System.out.println("1: Yes");
        	System.out.println("2: Exit");

        	String option = scanner.nextLine();
        	if(option == "1") {
        		main(args);
        	}else if(option == "2") {
        		System.exit(0);
        	}else {
        		System.out.println("error");
        		System.exit(0);
        	}
        }else if(choice.equals("3")) {
        	Multiply.mult(num1, num2);
        	
        	System.out.println("Would you like to go again?");
        	System.out.println("1: Yes");
        	System.out.println("2: Exit");

        	String option = scanner.nextLine();
        	if(option == "1") {
        		main(args);
        	}else if(option == "2") {
        		System.exit(0);
        	}else {
        		System.out.println("error");
        		System.exit(0);
        	}
        }else if(choice.equals("4")) {
        	Divide.div(num1, num2);
        	
        	System.out.println("Would you like to go again?");
        	System.out.println("1: Yes");
        	System.out.println("2: Exit");

        	String option = scanner.nextLine();
        	if(option == "1") {
        		main(args);
        	}else if(option == "2") {
        		System.exit(0);
        	}else {
        		System.out.println("error");
        		System.exit(0);
        	}
        }
	}
	

}
