import java.util.Scanner;

class Calculator {

	public static void main(String[] args) {

		int a,b,c,ch;
		System.out.print("Enter any two number: ");
		Scanner s=new Scanner(System.in);
		
		a=s.nextInt();
		b=s.nextInt();
		System.out.print("Enter Your Choice: ");
		ch=s.nextInt();
		
		switch (ch)
		{
		case 1:c=a+b;
			System.out.println("Addition "+c);
			break;
		case 2:c=a-b;
			System.out.println("Substraction "+c);
			break;
		case 3:c=a*b;
			System.out.println("Multiplication "+c);
			break;
		case 4:c=a/b;
			System.out.println("Division "+c);
			break;
		case 5:c=a%b;
			System.out.println("Remainder "+c);
			break;
		default:
			System.out.println("Invalid Choice");
		}	
	
	}
	
}
