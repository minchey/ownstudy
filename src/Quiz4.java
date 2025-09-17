
import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a = ");
        int a = scanner.nextInt();

        System.out.println("b = ");
        int b = scanner.nextInt();

        System.out.println("c = ");
        int c = scanner.nextInt();

        System.out.println("d = ");
        int d = scanner.nextInt();

        System.out.println("e = ");
        int e = scanner.nextInt();

        System.out.println("f = ");
        int f = scanner.nextInt();

        System.out.println("g = ");
        int g = scanner.nextInt();

        scanner.close();

        boolean isAValid = false;
        if (a >= 5000 && a <= 10000) {
            isAValid = true;
        }

        boolean isBValid = false;
        if (b >= 4000) {
            isBValid = true;
        }

        boolean isCValid = false;
        if (b > a && c == a + b) {
            isCValid = true;
        }
        if (b < a && c == a + b - 300) {
            isCValid = true;
        }
        if (b == a && c == a + b) {
            isCValid = true;
        }

        boolean isDValid = false;
        if (d == a + b + c) {
            isDValid = true;
        }

        boolean isEValid = false;
        if (e < 3 * (a + b + c)) {
            isEValid = true;
        }

        boolean isFValid = false;
        if (f == a + b + c + d + e + 5000) {
            isFValid = true;
        }

        boolean isGValid = false;
        if (g == 2 * f) {
            isGValid = true;
        }

        if (isAValid && isBValid && isCValid && isDValid && isEValid && isFValid && isGValid) {
            System.out.println("모든 조건과 변수가 일치합니다.");
        } else {
            int count = 0;
            if (!isAValid) {
                count = count + 1;
            }
            if (!isBValid) {
                count = count + 1;
            }
            if (!isCValid) {
                count = count + 1;
            }
            if (!isDValid) {
                count = count + 1;
            }
            if (!isEValid) {
                count = count + 1;
            }
            if (!isFValid) {
                count = count + 1;
            }
            if (!isGValid) {
                count = count + 1;
            }

            if (count == 7) {
                System.out.println("모두 잘못되었습니다.");
            } else {
                String result = "";
                if (!isAValid) {
                    result = result + "a가 ";
                }
                if (!isBValid) {
                    result = result + "b가 ";
                }
                if (!isCValid) {
                    result = result + "c가 ";
                }
                if (!isDValid) {
                    result = result + "d가 ";
                }
                if (!isEValid) {
                    result = result + "e가 ";
                }
                if (!isFValid) {
                    result = result + "f가 ";
                }
                if (!isGValid) {
                    result = result + "g가 ";
                }
                result = result + "잘못되었습니다.";
                System.out.println(result);
            }
        }
    }
}

