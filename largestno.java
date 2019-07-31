import java.util.Scanner;
class largest{
	public static void main(String args[])
	{
	int a,b,c;
	System.out.println("enter three no");
	Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	if(a>b){
	if(a>c)
	System.out.println(a+" is largest");
	if(c>a)
	System.out.println(c+" is largest");
	}
	else{
	if(b>a)
	{if(b>c)
	System.out.println(b+" is largest");
	if(c>b)
	System.out.println(c+" is largest");

	}
	}

	}
}