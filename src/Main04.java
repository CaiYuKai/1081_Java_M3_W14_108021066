import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(fun(m)/(fun(n)*fun(m-n)));
    }
    public static long fun(int x){
        long sum = 1;
        for (int i=x;i>1;i--){
            sum=sum*i;
        }
        return sum;
    }
}