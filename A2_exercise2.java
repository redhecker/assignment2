import java.util.Scanner;
public class A2_exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int[]a = new int[m];
        int[]b = new int[m];
        for(int i=0;i<a.length;i++){
            b[i] = input.nextInt();
        }
        set(a);
        compare(a,b);
        print(a);
    }
    public static void set(int[]a){
        for(int i=0;i<a.length;i++){
            a[i] = i + 1;
        }
    }

    public static void compare(int[]a,int[]b){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++) {
                if (a[j] == b[i]) {
                    a[j] = 0;
                }
            }
        }
    }

    public static void print(int[] a){
        int n = 0;
        for (int j : a) {
            if (j == 0) {
                continue;
            }
            if (n != 0) System.out.print(" " + j);
            else System.out.print(j);
            n++;
        }
        if(n==0)System.out.println("NULL");
    }
}
