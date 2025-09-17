import java.util.Scanner;

public class javaScanner {

    public static void main(String[] args) {
        System.out.println("나이가 어떻게 되시나요?");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        System.out.println(age + "살 입니다.");
        System.out.println("이름이 어떻게 되세요?");
        String name = scanner.next();
        System.out.println(name + "입니다.");
    }
}
