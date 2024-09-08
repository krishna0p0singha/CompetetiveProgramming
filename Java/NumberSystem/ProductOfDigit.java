import java.util.Scanner;
class  ProductOfDigit{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int productOfdigit=1;
sc.close();
while(number>0){
int temp = number%10;
productOfdigit*=temp;
number/=10;
}
System.out.println(productOfdigit);
}
}
