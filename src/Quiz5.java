import java.util.Scanner;

public class Quiz5 {

    /*다음 세 가지 중 고르시오.
   1. 감자. 2.옥수수 3. 수박
   1번을 누를 시
   1번 감자를 선택하셨습니다. 라는 문구가 나오도록.
   2번을 누를 시
   2번 옥수수를 선택하셨습니다.
   3번을 누를 시,
   3번 수박을 선택하셨습니다.
   >>>>>>>>>>>>>>>>>>>>>>>>>>>>
   그 뒤 1번 감자에서 1000원어치, 2000원어치 3000원어치.
   2번을 누를 시 옥수수에서 4000원어치, 5000원어치 6000원어치,
   3번을 누를 시 수박에서 10000원어치, 20000원어치, 30000원어치.
   라는 문구가 각각 나오도록 설정하고,
   그 안에서 또 1번을 누를 시
   “감자 1000어치를 선택하셨습니다.” 라는 문구가 나오도록 하고,
   몇 개를 주문하겠냐고 질문한 뒤 그 개수에 따라 금액이 변동하도록 하시오.

*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String food1 = "감자";
        String food2 = "옥수수";
        String food3 = "수박";

        int price1 = 1000;
        int price2 = 2000;
        int price3 = 3000;
        int price4 = 4000;
        int price5 = 5000;
        int price6 = 6000;

        System.out.println("다음 세가지 중 고르시오. ");
        System.out.println("1. 감자. 2.옥수수 3. 수박");

        int food = scanner.nextInt();
        int price;
        int result = 0;
        int howMany;
        int total;

        switch (food) {
            case 1:
                System.out.println("1번 감자를 선택하셨습니다.");
                System.out.println("감자 1" + price1 + "원어치, 2" + price2 + "원어치, 3" + price3 + "원어치");
                price = scanner.nextInt();
                switch (price){
                    case 1:
                        result = price1;
                        System.out.println("감자 " + price1 + "원어치를 선택하셨습니다.");
                        break;
                    case 2:
                        result = price2;
                        System.out.println("감자 " + price2 + "원어치를 선택하셨습니다.");
                        break;
                    case 3:
                        result = price3;
                        System.out.println("감자 " + price3 + "원어치를 선택하셨습니다.");
                        break;

                }
                break;
            case 2:
                System.out.println("2번 옥수수를 선택하셨습니다.");
                System.out.println("옥수수 1" + price4 + "원어치, 2" + price5 + "원어치, 3" + price6 + "원어치");
                price = scanner.nextInt();
                switch (price){
                    case 1:
                        result = price4;
                        System.out.println("옥수수 " + price4 + "원어치를 선택하셨습니다.");
                        break;
                    case 2:
                        result = price5;
                        System.out.println("옥수수 " + price5 + "원어치를 선택하셨습니다.");
                        break;
                    case 3:
                        result = price6;
                        System.out.println("옥수수 " + price6 + "원어치를 선택하셨습니다.");
                        break;

                }
                break;
            case 3:
                System.out.println("3번 수박을 선택하셨습니다.");
                System.out.println("수박 1" + price1 + "원어치, 2" + price2 + "원어치, 3" + price3 + "원어치");
                price = scanner.nextInt();
                switch (price){
                    case 1:
                        result = price1;
                        System.out.println("수박 " + price1 + "원어치를 선택하셨습니다.");
                        break;
                    case 2:
                        result = price2;
                        System.out.println("수박 " + price2 + "원어치를 선택하셨습니다.");
                        break;
                    case 3:
                        result = price3;
                        System.out.println("수박 " + price3 + "원어치를 선택하셨습니다.");
                        break;

                }
                break;
            default:
                System.out.println("번호를 잘못 입력하셨습니다.");
        }

        System.out.println("몇 개를 주문 하시곘습니까? ");
        howMany = scanner.nextInt();

        total = howMany * result;

        System.out.println(total + "원 입니다.");



    }

}
