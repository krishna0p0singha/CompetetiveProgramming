import java.util.Scanner;
class  BinaryToDecimal{
public static void main(String [] args){
	Scanner sc= new Scanner(System.in);
	int binary=sc.nextInt();
	int count=1;
	int decimal=0;
	while(binary>0){
	int temp=binary%10;
	decimal=decimal+(temp*count);
	binary/=10;
	count*=2;
	}
System.out.println(decimal);
}
}
