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
	public static boolean getEmail(String str)
	{
		String reg="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		Pattern p=Pattern.compile(reg);
		return p.matcher(str).matches();
	}
	public static boolean getMobile(String str)
	{
		String reg="[0-9]{2}\\s[0-9]{10}";
		Pattern p=Pattern.compile(reg);
		return p.matcher(str).matches();
	}
	public static boolean getPassword(String str)
	{
		String reg="[a-zA-Z0-9]{8,}";
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
		System.out.println("Enter Email Name : ");
		String email=sc.nextLine();
		boolean emailResult=getEmail(email);
    	System.out.println("Enter Mobile No : ");
 		String mobile=sc.nextLine();
 		boolean mobileResult=getMobile(mobile);
    	System.out.println("Enter Password Name : ");
 		String password=sc.nextLine();
 		boolean passwordResult=getPassword(password);
		if(firstNameResult==true)
			System.out.println("First Name is correct ");
		else
			System.out.println("First Name is not correct");
		if(lastNameResult==true)
			System.out.println("Last Name is correct ");
		else
			System.out.println("Last Name is not correct");
		if(emailResult==true)
			System.out.println("Email Name is correct ");
		else
			System.out.println("Email Name is not correct");
		
		if(mobileResult==true)
			System.out.println("Mobile numnber is correct ");
		else
			System.out.println("Mobile numnber is not correct");
 		if(passwordResult==true)
			System.out.println("Password is correct ");
		else
			System.out.println("Password is not correct");
		
	}
	
}
