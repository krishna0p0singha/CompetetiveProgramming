import java.util.Scanner;
class RotateArrayRight{
public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	int size =sc.nextInt();
	int [] arr=new int[size];
	for(int i =0;i<size;i++){
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter K postion : ");
	int position=sc.nextInt();
	int [] new_arr=new int[size];
sc.close();
position++;
	if (position >= size){ 
		System.out.println("Position must Less than Size");
		System.exit(0);
	}
	int count=0;
	int rev_count=position;
	for(int i= 0;i<size;i++){
		if(count<size && count >=position){
			new_arr[count++]= arr[count-position-1];
		}else{
			new_arr[i]= arr[size-rev_count];
			count++;
			rev_count--;

		}
System.out.print( new_arr[i] +" ");
	}
}
}
