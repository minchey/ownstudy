import java.util.Scanner;

public class Quiz6 {
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
    public static Scanner scanner = new Scanner(System.in);
    public static int price1 = 1000;
    public static int price2 = 2000;
    public static int price3 = 3000;
    public static int price4 = 4000;
    public static int price5 = 5000;
    public static int price6 = 6000;

    public static int whatFood(){
        System.out.println("1. 감자. 2.옥수수 3. 수박");
        int food = scanner.nextInt();
        if(food == 1) return howMuch("감자", price1,price2,price3);
        if(food == 2) return howMuch("옥수수", price4,price5,price6);
        if(food == 3) return howMuch("수박", price1,price2,price3);

        return 0;

    }

    public static int howMuch(String food , int fp1, int fp2, int fp3){
        int many ;
        System.out.println("1. " + fp1 + " 2. " + fp2 + " 3. " + fp3);
        many = scanner.nextInt();
        if(many == 1 ) {
            return howMany(fp1);
        }
        if(many == 2 ) {
            return howMany(fp2);
        }
        if(many == 3 ) {
            return howMany(fp3);
        }

        return 0;

    }

    public static int howMany(int many){
        int foodMany = 0;
        System.out.println("몇개 주문 하시곘습니까?");
        foodMany = scanner.nextInt();
        return foodMany * many;
    }

    public static void main(String[] args) {

        int result = whatFood();
        System.out.println(result + "원 입니다.");

    }
}
