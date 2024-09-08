import java.util.Scanner;
class CountDigit{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int count=0;
sc.close();
while(number>0){

count++;
number/=10;
}
System.out.println(count);
}
}
