import java.util.Scanner;
class month{
	public static void main(String args[])
	{
	  int m;
	  String season;
	  System.out.println("enter month");
	  Scanner sc=new Scanner(System.in);
	  m=sc.nextInt();
	  if(m==1||m==2||m==3||m==12||m==11||m==10)
	  season="winter";
	  else{
	  if(m==4||m==5||m==6)
	  season="summer";
	  else
	  season="rainy";
	  }
System.out.println("season  "+season);
	}
}