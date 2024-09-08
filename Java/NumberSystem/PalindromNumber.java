import java.util.Scanner;
class  PalindromNumber{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int number=n;
sc.close();
int reverse=0;
while(number>=1){
int temp=number%10;
reverse=(reverse+temp)*10;
number=number / 10;
}
System.out.println((reverse/10) == n ? "Palindrom" :"Not Palindrom");
}
}
