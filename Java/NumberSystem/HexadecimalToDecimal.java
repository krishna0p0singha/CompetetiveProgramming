import java.util.Scanner;
class HexadecimalToDecimal{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String hexadecimal=sc.nextLine();
int decimal=0;
int count=0;
for(int i=hexadecimal.length()-1;i>=0;i--){
char ch=hexadecimal.charAt(i);
if(ch>64){
	switch(ch){
		case 'A':
			decimal+=10*(Math.pow(16,count));
			count++;
			break;
		case 'B':
			decimal+=11*(Math.pow(16,count));
			count++;
			break;
		case 'C':
			decimal+=12*(Math.pow(16,count));
			count++;
			break;
		case 'D':
			decimal+=13*(Math.pow(16,count));
			count++;
			break;
		case 'E':
			decimal+=14*(Math.pow(16,count));
			count++;
			break;
		case 'F':
			decimal+=15*(Math.pow(16,count));
			count++;
			break;
		default:
			System.out.println("This not Hexadecimal Number");
			break;
		}
	}else{
	decimal+=Character.getNumericValue(ch)*(Math.pow(16,count));
	count++;
}

}
System.out.println(decimal !=0 ? decimal: "not Hexadecimal Number");
}
}
