import java.util.Scanner;
class  SumOfDigit{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int sumOfdigit=0;
while(number>0){
int temp = number%10;
sumOfdigit+=temp;
number/=10;
}
System.out.println(sumOfdigit);
}
}
