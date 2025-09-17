import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int answer1;
        int answer2;
        System.out.println(a + " + " + b + "= ?");
        answer1 = scanner.nextInt();
        if (answer1 != a + b) {

        }
        if (answer1 == a + b) {
            System.out.println("두 숫자 중 더 큰 수를 고르시오.");
            System.out.println("1번 : " + a);
            System.out.println("2번 : " + b);

            answer2 = scanner.nextInt();
            if (answer2 == 1) {
                if (a > b) {
                    System.out.println("정답입니다.");
                } if(b > a) {
                    System.out.println("오답입니다. 정답은 " + (answer2 + 1) + "번 입니다.");
                }
            }
            if (answer2 == 2) {
                if (a > b) {
                    System.out.println("정답입니다.");
                } else {
                    System.out.println("오답입니다. 정답은 " + (answer2 - 1) + "번 입니다.");
                }
            }
        }
    }
}
