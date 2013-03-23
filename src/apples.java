import java.util.Scanner;

public class apples{
	public static void main(String  args[])
	{
		Scanner juju = new Scanner(System.in);
	        
	     double fnum, snum, answer;
	     System.out.println("Enter first number");
	     fnum = juju.nextDouble();
	     System.out.println("Enter second number");
	     snum = juju.nextDouble();
	     answer = fnum / snum;
	     System.out.println(answer);
       }
}