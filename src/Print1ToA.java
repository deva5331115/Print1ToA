import java.util.Scanner;

public class Print1ToA {
    static int start=0;
    static void print(int num){
        if(start<num) {
            start += 1;
            System.out.print(start + " ");
            print(num);
        }else {
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();
        print(num);


    }
}
