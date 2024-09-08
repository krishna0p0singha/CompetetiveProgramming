import java.util.Scanner;
class  DecimalToBinary{
        public static void main(String [] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter Decimal number => ");
		int num=sc.nextInt();
		int dtb=0;
		sc.close();
		while(num>0){
			int temp = num%2;
			dtb=(dtb+temp)*10;
			num/=2;
		}
		int b=0;
		//System.out.println(dtb);
		while(dtb>0){
			int temp =dtb%10;
			b=(b*10)+temp;
			dtb/=10;
	}
	System.out.println(b);

}
}
