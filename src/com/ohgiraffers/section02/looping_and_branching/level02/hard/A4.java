
import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("2보다 큰 정수를 하나 입력하세요 : ");
        int in = sc.nextInt();

        if (in > 2) {
            for (int i = 2; i < in; i++) {
                if (in % i == 0) {
                    System.out.println("소수다 아니다.");
                    break;
                } else if (i == in - 1) {
                    System.out.println("소수다.");
                }
            }
        } else {
            System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
        }
    }
}
