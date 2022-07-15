import java.util.Scanner;

class If_Else {

	public static void main(String[] args) {
	
		int age;
		System.out.println("Please type your age=: ");
		Scanner obj=new Scanner (System.in);
		age=obj.nextInt();
		if(age>=18)
		{
			System.out.println("Eligible For Voting");
			System.out.println("My Name:= ABHIJEET");
			System.out.println("My Age:= 22");
			System.out.println("My Contact:= 999241863");
			System.out.println("My Address:= Abhinandan Nagar SAGAR M.P.");
		}
		else
		{
			System.out.println("NOT Eligible For Voting");
		}
			
	}

}
