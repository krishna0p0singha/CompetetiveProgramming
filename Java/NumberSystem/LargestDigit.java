import java.util.Scanner;
class  LargestDigit{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int largest=0;
sc.close();
while(number>0){
int digit=number%10;
if(digit>largest){
largest=digit;
}
number/=10;
}
System.out.println(largest);
}
}
