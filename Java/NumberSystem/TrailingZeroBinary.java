import java.util.Scanner;
class  TrailingZeroBinary{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String b=sc.nextLine();
	long binary=Long.parseLong(b);
	sc.close();
	int count =0;
	while(binary%10==0){
		binary/=10;
		count++;
	}
System.out.println(count);
}
}
