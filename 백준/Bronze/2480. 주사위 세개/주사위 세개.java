import java.util.Scanner;


public class Main {

    public static int twoEquals(int randomNumber){
        return 1000 + randomNumber * 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max;

        if (a == b && b == c) {
            System.out.println(a * 1000 + 10000);
        } else if ((a == b && a != c) || (a == c && a != b)) {
            System.out.println(twoEquals(a));
        } else if (b == c && b != a) {
            System.out.println(twoEquals(b));
        } else if (a >= b && a >= c) {
            max = a;
            System.out.println(a * 100);
        } else if (b >= a && b >= c) {
            max = b;
            System.out.println(b * 100);
        } else {
            max = c;
            System.out.println(c * 100);
        }
    }
}