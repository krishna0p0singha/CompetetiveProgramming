import java.util.Scanner;
class  FindLargestArrayElement{
        public static void main(String [] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter Size of  array =");
                int size=sc.nextInt();
                int arr[] = new int [size];
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }
                sc.close();
                int max=arr[0];
                for(int i=0;i<size;i++){
                        if(arr[i]>max){
                                max=arr[i];
                        }
                }
                System.out.println("Smallest Element =>"+max);
        }
}
