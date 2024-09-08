import java.util.Scanner;
class  CheckSortedArray{
public static void main(String [] args){
	Scanner sc =new Scanner(System.in);
	int size=sc.nextInt();
	int []arr=new int[size];
	for(int i=0;i<size;i++){
		arr[i]=sc.nextInt();
	}
	sc.close();
	boolean ascen_flag=true;
	boolean Descend_flag=true;
	for(int i=0;i<size-1;i++){
		if(arr[i]>arr[i+1]){
			 ascen_flag=false;
		}
		if(arr[i]<arr[i+1]){
                        Descend_flag=false;
                }
	}
if( ascen_flag){
	System.out.println("Sorted Array in Ascending");
}else if (Descend_flag){
 System.out.println("Sorted Array in Descending");
}else{
	System.out.println("un-Sorted Array");
}
}
}


