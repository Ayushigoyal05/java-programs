import java.util.Scanner;
class inn{
	public static void main(String args[])
	{
		int a,b;
		System.out.println("enter a");
		System.out.println("enter b");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+b);

	
	}
}