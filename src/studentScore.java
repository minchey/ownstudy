/*   학점과 점수를 입력받고, 해당 학점과 점수가 정상적인지 알아내는 프로그램을 만들어보시오.
   점수 : 100
   학점 : A
   올바른 학점입니다. or 올바르지 않은 학점입니다.

   같이 나타나게 한다. 무조건 점수를 먼저 입력받는다.

   A >> 점 100이상
   B >> 점 90이상
   C >> 점 80이상
   D >> 점 70이상
   E >> 점 60이상
   F >> 점 50이상
 */

import java.util.Scanner;

public class studentScore {
    public static void pushScore(){
        Scanner scanner = new Scanner(System.in);
        int score;
        String grade;
        System.out.println("점수: ");
        score = scanner.nextInt();
        System.out.println("학점: ");
        grade = scanner.next();

        grade = grade.toUpperCase();
        comp(score, grade);
    }

    public static void comp(int score, String grade){
        String compGrade = "";
        if(score >= 100){
            compGrade = "A";
        }
        if(score >= 90 && score < 100){
            compGrade = "B";
        }
        if(score >= 80 && score < 90){
            compGrade = "C";
        }
        if(score >= 70 && score < 80){
            compGrade = "D";
        }
        if(score >= 60 && score < 70){
            compGrade = "E";
        }
        if(score >= 50 && score < 60){
            compGrade = "F";
        }

        if(compGrade.equals(grade)){
            System.out.println("올바른 학점입니다.");
        }
        else{
            System.out.println("올바르지 않은 학점입니다.");
        }
    }

    public static void main(String[] args) {
        pushScore();
    }
}
