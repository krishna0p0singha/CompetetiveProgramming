import java.util.Scanner;
class PrimeNumberLimit{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		sc.close();
		boolean flag=true;
		System.out.print("2");
		for(int i=3;i<=limit;i++){
			for(int j=2;j<i-1;j++){
// System.out.print(i%j);
				if(i%j==0){
					flag=false;
				}
			}
			if(flag){
				System.out.print(" "+i);
			}
flag=true;

		}

	}
}
