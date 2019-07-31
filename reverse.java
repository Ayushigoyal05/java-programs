import java.util.Scanner;
class reverse{
	public static void main(String args[])
	{  
	   int no,rev=0,a;
       System.out.println("enter no");
       Scanner sc=new Scanner(System.in);
       no=sc.nextInt();
       while(no>0){
       	a=no%10;
       	no=no/10;
       	rev=rev*10+a;

       }
       System.out.println("rev   "+rev);	
	}
}