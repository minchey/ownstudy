import java.util.Scanner;

public class IfQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.next();
        String name2 = scanner.next();
        String name3 = scanner.next();
        int killo = scanner.nextInt();
        int answer = killo * 3;
        System.out.println(name1 + "과 " + name2 + "와 " + name3 + "이 있다.");
        System.out.println("셋의 집은 각각 10km 마다 떨어져있는 거리에 존재한다.");
        System.out.println("세명의 집을 차례대로 방문하려면 몇 km의 거리를 가야 하는가?");
        System.out.println("답: ");
        answer = scanner.nextInt();
        if(answer == killo){
            System.out.println("정답입니다.");
        }
        else {
            System.out.println("오답입니다. 답은 " + killo + "km 입니다.");
        }
    }
}
