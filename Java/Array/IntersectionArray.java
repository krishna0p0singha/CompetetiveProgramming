import java.util.Scanner;
class IntersectionArray{
public static boolean intersectElement(int [] arr ,int el){
	for(int i=0;i<arr.length;i++){
		if(arr[i]==el){
			return true;
		}
	}
	return false;
}
public static int [] insertAarry(int size,Scanner sc){
int [] arr=new int[size];
	for(int i=0;i<size;i++){
		arr[i]=sc.nextInt();
	}
return arr;
}

public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
System.out.println("Enter first Array size : ");
	int arr1_size=sc.nextInt();
System.out.print("Insert first Array element : ");
	int [] arr1=insertAarry(arr1_size,sc);
System.out.println("Enter second Array size : ");
 int arr2_size=sc.nextInt();
sc.close();
System.out.print("Insert second Array element : ");
        int [] arr2=insertAarry(arr2_size,sc);
	for(int i =0 ;i<arr1_size;i++){
		boolean flag=intersectElement(arr2,arr1[i]);
			if(flag){
				System.out.println(arr1[i]);
			}
	}
}
}
