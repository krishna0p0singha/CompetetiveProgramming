import java.util.Scanner;
class  FirstDuplicate{
public static boolean duplicate(int [] arr,int index){
for(int i=1;i<arr.length;i++){
	if(arr[index]==arr[i] && index != i){
			return true;
		}
	}
return false;
}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int [] arr=new int[size];
		int el=0;
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
sc.close();
		for(int j=0;j<size;j++){
			boolean flag= duplicate(arr,j);
			if(flag){
				el=arr[j];
				break;
			}
		}
System.out.println(el);
	}
}
