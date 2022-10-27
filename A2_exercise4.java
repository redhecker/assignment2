import java.util.Scanner;
public class A2_exercise4 {
    public static void main(String[]args){
        char[]value0 = new char[5];
        char[]suit = new char[5];
        int []value = new int[5];
        input(suit,value0);
        boolean Straight = Straight(value0,value);
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
    public static void input(char[]a,char[]b){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i] = sc.next().charAt(0);
            b[i] = sc.next().charAt(0);
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

    public static boolean Straight(char[]a,int[]b){
        for(int i=0;i<a.length;i++){
            switch (a[i]) {
                case 'A' :
                    b[i] = 1;break;
                case '1' :
                    b[i] = 10;break;
                case '2' :
                    b[i] = 2;break;
                case '3' :
                    b[i] = 3;break;
                case '4' :
                    b[i] = 4;break;
                case '5' :
                    b[i] = 5;break;
                case '6' :
                    b[i] = 6;break;
                case '7' :
                    b[i] = 7;break;
                case '8' :
                    b[i] = 8;break;
                case '9' :
                    b[i] = 9;break;
                case 'J' :
                    b[i] = 11;break;
                case 'Q' :
                    b[i] = 12;break;
                case 'K' :
                    b[i] = 13;break;
            }
        }
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
        int x=0;
        for(int i=0;i<4;i++){
            if(b[i] == b[i + 1] - 1){
                x++;
            }
        }
        return x == 4;
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
