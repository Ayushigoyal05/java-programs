import java.util.Scanner;
class salary{
	public static void main(String args[])
	{float sal,gs,hs,da;
	System.out.println("enter salary");
	Scanner sc=new Scanner(System.in);
    sal=sc.nextInt();
    hs=0.2f*sal;
    da=0.4f*sal;
    gs=sal-hs-da;
    System.out.println("gross salary"+gs);
}}