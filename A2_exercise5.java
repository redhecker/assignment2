import java.util.Scanner;
public class A2_exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m=0;
        for(int i=0;i<n;i++) {
            String s = sc.next();
            s = mmm(s);
            if(m!=0) System.out.print(" "+s);
            else System.out.print(s);
            m++;
        }
    }
    public static String mmm(String s){
        char[]a = new char[8];
        for(int i=0;i<8;i++){
            a[i] = s.charAt(i);
        }
        swt(a,0,6);
        swt(a,1,7);
        swt(a,2,4);
        swt(a,3,5);
        s="";
        for(char i : a){
            String m = String.valueOf(i);
            s += m;
        }
        return s;
    }
    public static void swt(char[]a, int m, int n){
        char x = a[m];
        a[m] = a[n];
        a[n] = x;
    }
}
