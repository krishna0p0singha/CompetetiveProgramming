import java.util.Scanner;
class LargestPower{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int higestpower=0;
		while(Math.pow(2,higestpower)<=a){
			higestpower++;
		}
	System.out.println(higestpower-1);
	}
}
