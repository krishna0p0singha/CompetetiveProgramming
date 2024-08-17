import java.util.Scanner;
class BinaryToOctal{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String b=sc.nextLine();
		long binary=Long.parseLong(b);

		int count=0;
		int binary_increment=1;
		long octal_val=0;
		long re_octal=0;

		while(binary>0){
			long temp=binary%10;
			octal_val=octal_val+(temp*binary_increment);
			count++;
			binary_increment*=2;
			binary/=10;
			if(count ==3 || binary==0){
				re_octal=(re_octal+octal_val)*10;
				binary_increment=1;
				count*=0;
				octal_val*=0;
			}

}
long octal=0;
while(re_octal>0){
long temp = re_octal%10;
octal=(octal*10)+temp;
re_octal/=10;
}
System.out.println(octal);
}

}
