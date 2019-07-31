import java.util.Scanner;
class year{
	public static void main(String args[])
	{
	int y;
	System.out.println("enter the year");
	Scanner sc=new Scanner(System.in);
	y=sc.nextInt();
	if(y%4==0){
	if(y%100==0)
	{
	if(y%400==0)
	System.out.println("leap year");
    else
	System.out.println(" not a leap year");
	}
	else 
		System.out.println("leap year");
	}
	else
	System.out.println(" not a leap year");
	}

}