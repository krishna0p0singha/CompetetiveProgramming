import java.util.Scanner;
class  SecondLargestThree{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number ");
		int a=sc.nextInt();
		System.out.print("Enter Second Number ");
                int b=sc.nextInt();
		System.out.print("Enter Third Number ");
                int c=sc.nextInt();
		int result=a<b && a>c ? a :b <a && b>c ? b: c;
		System.out.println(result+" is second largest");
}
}
