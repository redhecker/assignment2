import java.util.Scanner;
public class A2_exercise4_2 {
    public static void main(String[]args){
        char[]suit = new char[5];
        int []value = new int[5];
        input(suit,value);
        boolean Straight = Straight(value);
        String pair = is(value);
        boolean Flush = Flush(suit);
        if(Straight && Flush){
            System.out.println("Straight Flush");
            System.exit(0);
        }
        else if(Straight ^ Flush){
            if(Flush){System.out.println("Flush");}
            else{System.out.println("Straight");}
            System.exit(0);
        }
        System.out.println(pair);
    }
    public static void input(char[]a,int[]b){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i] = sc.next().charAt(0);
            b[i] = sc.nextInt();
        }
    }

    public static String is(int[]a){
        int n;int b=0;
        for(int i=0;i<a.length;i++){
            n=0;
            for(int j=i;j<a.length;j++){
                if(a[i]==a[j]){
                    n++;
                }
                if(n==3)return"Three of a Kind";
            }
            if(n==2)b=1;
        }
        if(b==1)return"Pair";
        return "High Card";
    }

    public static boolean Straight(int[]b){
        int n=0;
        while ( n != 4 ){
            n = 0 ;
            for ( int i=0 ; i < 4 ; i++ ) {
                if (b[i] > b[i + 1]) {
                    int temp = b[i];
                    b[i] = b[i + 1];
                    b[i+1] = temp;
                }else { n++; }
            }
        }
        n=0;
        for(int i=0;i<4;i++){
            if(b[i] == b[i + 1] - 1){
                n++;
            }
        }
        return n == 4;
    }

    public static boolean Flush(char[]a){
        int n =0;
        for ( int i=0 ; i < 4 ; i++ ) {
            if (a[i] == a[i + 1]) {
                n++;
            }
        }
        return n == 4;
    }
}