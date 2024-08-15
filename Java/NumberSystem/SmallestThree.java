import java.util.Scanner;
class  SmallestThree{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first Number ");
		int a=sc.nextInt();
		System.out.print("Enter second Number ");
                int b=sc.nextInt();
		System.out.print("Enter third Number ");
                int c=sc.nextInt();
		int result =a<b && a<c ? a : b<c && b<a ? b : c;
		System.out.println(result + " ia a smallest one");

}
}
