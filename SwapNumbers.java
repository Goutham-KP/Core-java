import java.util.Scanner;
class SwapNumbers{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
			System.out.println("Enter the value for A: ");
		int a=scan.nextInt();
			System.out.println("Enter the value for B");
		int b=scan.nextInt();
		System.out.println("The Swap value of a and b before: "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The Swap value of a and b: "+a+" "+b);
	}
}
	