import java.util.Scanner;
class  SumOfSquar{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int result=0;
		sc.close();
		for(int i=1;i<=a;i++){
			result+=(i*i);
		}
		System.out.println(result);
	}
}
