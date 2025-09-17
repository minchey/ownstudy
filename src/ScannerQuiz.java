import java.util.Scanner;

public class ScannerQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1;
        String name2;
        String food1;
        String food2;
        String food3;
        String food4;
        String food5;
        String food6;
        String pay = "지불";
        int whoPaid1;
        int whoPaid2;
        int price1;
        int price2;
        int price3;
        int price4;
        int price5;
        int price6;


        name1 = scanner.next();
        name2 = scanner.next();
        System.out.println(name1 + "와 " + name2 + "는 함께 음식을 준비했습니다.");

        food1 = scanner.next();
        food2 =scanner.next();
        food3 = scanner.next();
        food4 = scanner.next();
        food5 = scanner.next();
        food6 = scanner.next();

        price1 = scanner.nextInt();
        price2 = scanner.nextInt();
        price3 = scanner.nextInt();
        price4 = scanner.nextInt();
        price5 = scanner.nextInt();
        price6 = scanner.nextInt();

        whoPaid1 = price1 + price2 + price3;
        whoPaid2 = price4 + price5 + price6;
        int total = whoPaid1 + whoPaid2;
        System.out.println(name1 + "는 " + food1 + ", " + food2 + ", " + food3 + "를 샀습니다.");
        System.out.println(name2 + "는 " + food4 + ", " + food5 + ", " + food6 + "를 샀습니다.");
        System.out.println(food1 + "는 " + price1 + "원, " + food2 + "는 " + price2 + "원, " + food3 + "는 " + price3 + "원입니다.");
        System.out.println(food4 + "는 " + price4 + "원, " + food5 + "는 " + price5 + "원, " + food6 + "는 " + price6 + "원입니다.");

        System.out.println("총 합은 " + total + "원이 나왔습니다.");
        System.out.println(name1 + "는 " + whoPaid1 + "원을 " + pay + "하고");
        System.out.println(name2 + "는 " + whoPaid2 + "원을 " + pay + "하였습니다.");
        System.out.println(name2 + "는 " + name1 + "보다 " + (whoPaid2 - whoPaid1) + "원을 더 " + pay + "했습니다.");
    }
}
