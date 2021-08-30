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
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Name : ");
		String str=sc.nextLine();
		boolean result=getFirstName(str);
		if(result==true)
			System.out.println("First Name is correct ");
		else
			System.out.println("First Name is not correct");
	}
	
}
