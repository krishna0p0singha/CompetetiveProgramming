import java.util.Scanner;
class  DecimalToHexadecimal{
	public  static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int decimal=sc.nextInt();
		String Hexidecimal="";
		while(decimal>0){
			int temp = decimal%16;
			switch(temp){
				case 10:
					Hexidecimal="A"+ Hexidecimal;
					break;
				case 11:
					Hexidecimal="B"+ Hexidecimal;
                                        break;
				case 12:
					Hexidecimal="C"+ Hexidecimal;
                                        break;
				case 13:
					Hexidecimal="D"+ Hexidecimal;
                                        break;
				case 14:
					Hexidecimal="E"+Hexidecimal;
                                        break;
				case 15:
                                        Hexidecimal="F"+ Hexidecimal;
                                        break;
				default:
					Hexidecimal=temp+""+ Hexidecimal;
			}
			decimal/=16;
		}
		System.out.println(Hexidecimal);
	}

}
