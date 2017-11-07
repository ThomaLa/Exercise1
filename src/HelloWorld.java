import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Hello ASE2017 - How are you now? :)\nPlease enter your name: ");
		HelloUser user = new HelloUser(sc.next());		
		System.out.println(user.greetUser());
		sc.close();
	}

}