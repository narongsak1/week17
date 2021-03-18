import java.util.Scanner;
public class Zodicct {
	public static void main(String[]args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter any value: ");
		int year = read.nextInt();
		if(year == 1972 || year == 1984 || year == 1996 || year == 2008 || year == 2020) 
		{
			System.out.println("Mouse");
		}
		else if(year == 1973 || year == 1985 || year == 1997 || year == 2009 || year == 2021) 
		{
			System.out.println("Ox");
		}
		else if(year == 1974 || year == 1986 || year == 1998 || year == 2010 || year == 2022) 
		{
			System.out.println("Tiger");
		}
	}
}
