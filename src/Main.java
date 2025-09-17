
public class Main {
    public static void main(String[] args) {

        boolean myBlooean = true;

        myBlooean = false;
        System.out.println(myBlooean);

        long myInt = 123;
        myInt = 12343322222L;
        System.out.println(myInt);

        double a = 9;
        double b = 5;

        System.out.println(a + "+" + b + "=" + (a+b));
        System.out.println(a + "-" + b + "=" + (a-b));
        System.out.println(a + "*" + b + "=" + (a*b));
        System.out.println(a + "/" + b + "=" + (a/b));

        System.out.println("비교연산자");
        System.out.println(3 + ">" + 2 + ":" + (3>2));
        System.out.println(3 + "<" + 2 + ":" + (3<2));
        System.out.println(3 + ">=" + 2 + ":" + (3>=2));
        System.out.println(3 + ">=" + 2 + ":" + (3>=2));
        System.out.println(3 + "!=" + 2 + ":" + (3!=2));

        System.out.println("불린연산자 and");
        System.out.println("true && true" + "=" + (true && true));
        System.out.println("true && false" + "=" + (true && false));
        System.out.println("false && true" + "=" + (false && true));
        System.out.println("false && false" + "=" + (false && false));

        System.out.println("불린연산자 or");
        System.out.println("true || true" + "=" + (true || true));
        System.out.println("true || false" + "=" + (true || false));
        System.out.println("false || true" + "=" + (false || true));
        System.out.println("false || false" + "=" + (false || false));

        System.out.println("불린연산자 not");
        System.out.println("!true : "  + !true);
        System.out.println("!false : " + !false);









    }
}