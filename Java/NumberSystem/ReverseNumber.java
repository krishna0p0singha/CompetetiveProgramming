import java.util.Scanner;
class ReverseNumber{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int reverse=0;
sc.close();
while(number>=1){
int temp=number%10;
reverse=(reverse+temp)*10;
number=number / 10;
}
System.out.println(reverse/10);
}
}
