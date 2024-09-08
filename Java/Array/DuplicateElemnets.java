import java.util.Scanner;
import java.util.Arrays;
class DuplicateElemnets{
	int count = 0;
	int [] filter_arr;

DuplicateElemnets(int size){
filter_arr =new int[size];
}

public static boolean findDuplicate(int el,  DuplicateElemnets dp){
	for(int i=0;i<dp.count;i++){
		if(dp.filter_arr[i]==el){
			return true;
		}
	}
return false;
}
public static void main(String [] args) {
	Scanner sc= new Scanner(System.in);
	int size=sc.nextInt();
 	DuplicateElemnets dp=new DuplicateElemnets(size);
	int [] arr=new int[size];
	for(int i=0;i<size;i++){
		arr[i]=sc.nextInt();
	}
	for(int j=0;j<size;j++){
		boolean flag= findDuplicate(arr[j],dp);
		if(!flag){
			System.out.print(arr[j]+ " ");
			dp.filter_arr[dp.count++]=arr[j];
		}
	}
sc.close();
}
}
