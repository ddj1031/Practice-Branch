import java.util.Scanner;

public class TreeStory {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next("Enter your name: ");
		String adjective = scan.next("Enter an adejctive: ");
		
		
		System.out.println(name + " is very " + adjective);
		
		
	}

}
