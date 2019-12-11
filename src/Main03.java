import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=Integer.parseInt(scn.nextLine());
        for (int i=0;i<n;i++){
            String str[]=scn.nextLine().split(" ");
            int len=str.length;
            int data[]=new int[len];
            for (int j=0;j<len;j++) {
                switch (str[j].charAt(0)) {
                    case 'C':
                        data[j] = 0;
                        break;
                    case 'D':
                        data[j] = 13;
                        break;
                    case 'H':
                        data[j] = 26;
                        break;
                    case 'S':
                        data[j] = 39;
                        break;
                }
                data[j] += Integer.parseInt(str[j].substring(1));
            }
                for (int j=0;j<len;j++){
                    for (int k=j+1;k<len;k++){
                        if (data[j]<data[k]){
                            int v1=data[j];
                            data[j]=data[k];
                            data[k]=v1;
                            String tmp=str[j];
                            str[j]=str[k];
                            str[k]=tmp;
                        }
                    }
                    System.out.print(str[j]+"\t");
                }
                System.out.println();
            }
        }
    }