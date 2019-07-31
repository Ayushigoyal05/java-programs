import java.util.Scanner;
class temperature{
	public static void main(String args[]){
		float temp,ftemp;
		System.out.println("enter temperature");
		Scanner sc=new Scanner(System.in);
		temp=sc.nextFloat();
		ftemp=(9/5f)*temp;
		System.out.println("ftemp"+ftemp);

	}
}