import java.util.Scanner;
class SecondWayRotate{
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
position=position % size;
for(int i =0 ;i<size;i++){
 new_arr[(i + position) % size]=arr[i];
}
for(int i =0 ;i<size;i++){
 System.out.print(new_arr[i]+" ");
}
}
}
