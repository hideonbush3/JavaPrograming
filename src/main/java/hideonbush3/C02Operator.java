package hideonbush3;

public class C02Operator {
    public static void main(String[] args) {

        int x = 10, y = 20;

        // 산술연산자
        System.out.printf("%d + %d = %d\n", x, y, x+y);
        System.out.printf("%d - %d = %d\n", x, y, x-y);
        System.out.printf("%d X %d = %d\n", x, y, x*y);
        System.out.printf("%d / %d = %d\n", x, y, x/y);
        System.out.printf("%d %% %d = %d\n", x, y, x%y);

        // 관계연산자
        System.out.printf("%d이 %d보다 크나요? : %b\n", x, y, x > y);
        System.out.printf("%d이 %d보다 작나요? : %b\n", x, y, x < y);
        System.out.printf("%d과 %d이 같나요? : %b\n", x, y, x == y);

        // 논리연산자
        System.out.printf("x < 10 AND x < 20 : %b\n", x< 10 || x < 20);
        System.out.printf("NOT(x < 10 AND x < 20) : %b\n", !(x< 10 || x < 20));

        // 👍 : 자바에선 안되는 것!
//        System.out.printf("1 + true : %b", 1 + true);
//        System.out.printf("false + true : %b", false + true);

        // 할당연산자 : syntatic sugar
        System.out.printf("x값은 %d\n", x);
        x += x + 2;
        System.out.printf("x += 2 = %d\n", x);

        x *= x * 2;
        System.out.printf("x *= 2 = %d\n", x);

        x -= x - 2;
        System.out.printf("x -= 2 = %d\n", x);

        // 증가, 감소 연산자
        x = 10;
        System.out.printf("++x + 1 = %d\n", ++x + 1);
        x = 10;
        System.out.printf("x++ + 1 = %d\n", x++ + 1);
        x = 10;
        System.out.printf("--x + 1 = %d\n", --x + 1);
        x = 10;
        System.out.printf("x-- + 1 = %d\n", x-- + 1);

        // 문자열 연산 : +
        //printf 메서드를 사용할 것을 추천!
        String name = "홍길동";

        System.out.println("나의 이름은 : " + name);
        System.out.printf("나의 이름은 : %s\n", name);

        // 삼항 연산자 : if 문의 syntatic sugar
        // 조건식 ? 참일때 값 : 거짓일때 값

        // ex)평균점수가 60점 이상이면 '합격',
        // 아니면 '불합격'이라 출력
        double jumsu = 68.5;
        String result = jumsu >= 60 ? "합격" : "불합격";

        String fmt = "평균점수는 %.2f이고 결과는 %s\n";
        System.out.printf(fmt, jumsu, result);

    }
}
