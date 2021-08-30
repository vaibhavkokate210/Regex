import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex 
{
	public static boolean getFirstName(String str)
	{
		String reg="^[A-Z][a-z]{2,}";
		Pattern p=Pattern.compile(reg);
		return p.matcher(str).matches();
	}
	public static boolean getLastName(String str)
	{
		String reg="^[A-Z][a-z]{2,}";
		Pattern p=Pattern.compile(reg);
		return p.matcher(str).matches();
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Name : ");
		String firstName=sc.nextLine();
		System.out.println("Enter Last Name : ");
		String lastName=sc.nextLine();
		boolean firstNameResult=getFirstName(firstName);
		boolean lastNameResult=getFirstName(firstName);
		if(firstNameResult==true)
			System.out.println("First Name is correct ");
		else
			System.out.println("First Name is not correct");
		if(lastNameResult==true)
			System.out.println("Last Name is correct ");
		else
			System.out.println("Last Name is not correct");
	}
	
}
