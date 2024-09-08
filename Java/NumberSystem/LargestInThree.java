import java.util.Scanner;
class  LargestInThree{
	public static void main(String [] args){ 
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter first number => ");
		int a=sc.nextInt();
		System.out.print("Enter Second number => ");
		int b=sc.nextInt();
		sc.close();
		System.out.print("Enter Third number => ");
                int c=sc.nextInt();
		int result = a>b && a>c ? a : b>c && b>a ? b : c;
		System.out.println(result + " is Largest Number");
	}
}
