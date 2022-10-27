import java.util.Scanner;
public class A2_exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int j=0;j<n;j++){
            int[]a = new int[4];
            int[]b = new int[4];
            for(int i=0;i<4;i++){
                a[i] = input.nextInt();
            }
            for(int i=0;i<4;i++){
                b[i] = input.nextInt();
            }
            int m = Case(a,b);
            System.out.println(m);
        }
    }
    public static int Case(int[]a,int[]b) {
        sort(b,a);
        int score = 100 - add(a),days=0;
        int i = 0;
        while( score > 0 ){
            if(a[i]==30) {i++;continue;}
            days += b[i];score--;a[i]++;
        }
        return days;
    }

    public static int add(int[]a){
        int m=0;
        for (int j : a) {
            m += j;
        }
        return m ;
    }

    public static void sort(int[]a,int[]b){
        int n = 0;
        while ( n != 3 ){
            n = 0 ;
            for ( int i=0 ; i < 3 ; i++ ) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i],t=b[i];
                    a[i] = a[i + 1];b[i]=b[i+1];
                    a[i + 1] = temp;b[i+1]=t;
                }else { n++; }
            }
        }
    }
}
