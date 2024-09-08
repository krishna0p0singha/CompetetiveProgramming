import java.util.Scanner;
class  SumOfCude{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                int a=sc.nextInt();
                sc.close();
                int result=0;
                for(int i=1;i<=a;i++){
                        result+=(i*i*i);
                }
                System.out.println(result);
        }
}
