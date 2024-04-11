import java.util.Scanner;


public class Main {
public static void main(String[] args) {
    // for문의 반복할 변수 및 합계값을 넣을 변수 선언

    int sum = 0;

    // 값 입력
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();

    // 반복문 실행 : i부터 a까지 합을 구한다.
    for(int i = 1; i <= a; i++)
    {
        sum = sum + i;
    }

    System.out.print(sum);
}
 }