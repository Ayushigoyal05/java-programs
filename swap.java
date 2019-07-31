import java.util.Scanner;
class swap{
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
		System.out.println("now a is"+a+"\nnow b is"+b);

	
	}
}