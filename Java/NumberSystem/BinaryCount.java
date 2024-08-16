import java.util.Scanner;
class BinaryCount{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
String binary=sc.nextLine();
long b=Long.parseLong(binary);
int count=0;
while(b>0){
	count += b%10!= 0 ? 1 : 0;
	b/=10;
}
System.out.println(count);
}

}
