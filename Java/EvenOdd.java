import java.util.Scanner;
class EvenOdd{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter integer: ");
		int a=sc.nextInt();
		String result= a%2 == 0 ? "Even" : "Odd" ;
		System.out.println("Enter number"+a+" is "+result);
	}

}
