import java.util.Scanner;
class  PrimeNumber{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
boolean flag=true;
	if(a==2){
		System.out.println(a+" is prime");
	}else{
		for(int i=2;i<(a-1);i++){
			if(a%i==0){ flag=false; }
		}
		if(flag){
			System.out.println(a+" is prime");
		}else{
			System.out.println(a+" is not prime");
		}
	}
}
}
