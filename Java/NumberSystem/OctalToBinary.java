import java.util.Scanner;
class OctalToBinary{

public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int octal=sc.nextInt();
	int decimal=0;
	int octal_counter=0;
	while(octal>0){
		int temp=octal%10;
		decimal+=temp*Math.pow(8, octal_counter);
		octal/=10;
		octal_counter++;
	}
String binary="";
while(decimal>0){
int temp =decimal%2;
binary=temp+""+binary;
decimal/=2;
}
System.out.println(binary);
}
}
