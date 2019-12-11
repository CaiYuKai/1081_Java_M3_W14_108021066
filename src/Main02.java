import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int data[][] = new int[n][n];
        int m = 1;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j <= n; j++) {
                    data[i][j] = m++;
                }
            }
            else{
                    for (int j = n-1; j >= 0; j++) {
                        data[i][j] = m++;
                    }
                }
            }
        System.out.println();
        }
    }
