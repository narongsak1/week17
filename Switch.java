import java.util.Scanner;
public class Switch {
	public static void main(String[]args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter any value: ");
		
		int year = read.nextInt();
		switch(year)
		{
			case 1972,1984,1996,2008,2020:
				System.out.println("Mouse");
				break;
			case 1973,1985,1997,2009,2021:
				System.out.println("Ox");
				break;
			default:
				System.out.println("default block");
				break;
		}
	}
}