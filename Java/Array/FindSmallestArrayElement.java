import java.util.Scanner;
class  FindSmallestArrayElement{
        public static void main(String [] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter Size of  array =");
                int size=sc.nextInt();
                int arr[] = new int [size];
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }
                sc.close();
                int min=arr[0];
                for(int i=0;i<size;i++){
                        if(arr[i]<min){
                                min=arr[i];
                        }
                }
                System.out.println("Smallest Element =>"+min);
        }
}
