import java.util.Scanner;
class CountOccurance{
boolean [] counted_arr;
 CountOccurance(int size){
	this.counted_arr=new boolean[size];
}
public static int countOcocurance(int [] arr,int index, CountOccurance co){
int count=1;
for(int i=index+1;i<arr.length;i++){
	if(arr[i] == arr[index]){
		count++;
 		co.counted_arr[i]=true;
	}
   }
return count != 0 ? count : 0;
}
public static void main(String [] args){
	Scanner sc =new Scanner(System.in);
	int size = sc.nextInt();
 	CountOccurance co=new  CountOccurance(size);
	int [] arr =new int[size];
	for(int i=0;i<size;i++){
		arr[i]=sc.nextInt();
	}
sc.close();
	for(int j=0;j<size;j++){
	int res=0;
		if(!co.counted_arr[j]){
			res=countOcocurance(arr,j,co);
System.out.println(arr[j] +" => "+res);
		}
	}
}
}
