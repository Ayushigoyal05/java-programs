import java.util.Scanner;
class sum{
	public static void main(String args[]){
		int no,digit,sum=0;
		System.out.println("enter no");
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		while(no>0){
		digit=no%10;
		no=no/10;
		sum=sum+digit;
}System.out.println("sum"+sum)
	}
}