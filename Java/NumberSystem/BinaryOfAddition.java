import java.util.Scanner;
class  BinaryOfAddition{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
sc.close();
int sum=a+b;
int result=0;
while(sum>0){
int temp=sum%2;
result=(result+temp)*10;
sum/=10;


}

}
}
