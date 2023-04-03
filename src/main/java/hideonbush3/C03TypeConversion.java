package hideonbush3;

public class C03TypeConversion {
    public static void main(String[] args) {
        // 자료형 변환
        // 묵시적 형변환(auto)
        // 명시적 형변환(casting)

        // 묵시적 형변환
        byte z = 10;    // byte는 1byte 크기의 자료형
//        int a = z;      // int는 4byte 크기의 자료형 (승격promotion)
        int a = (int) z;    // 변수 승격시 명시적 형변환 사용은 불필요!

        System.out.printf("%d, %d\n", z, a);

        // 명시적 형변환 : cast 연산자 사용!
        // 타입 변수명A = (타입) 변수명B;
//        z = a;
        z = (byte) a;
        System.out.printf("%d, %d\n", z, a);

        a = 512;
        z = (byte) a;
        System.out.printf("%d, %d\n", a, z);

        double b = 3.14;
        long c = (long) b;
        System.out.printf("%f, %d\n", b, c);

        // 의도적인 형변환
        // 정수끼리 산술연산 결과 : 정수
        // 하지만, 정수끼리 산술연산 결과를 실수로 얻고 싶다면 - 형변환 필요
        int x = 98;
        int y = 99;

        System.out.printf("98 / 99 = %d\n", x / y);
        System.out.printf("98 / 99 = %f\n", (double)x / y);
        // 자동형변환에 의해 연산 결과를 실수로 바꾸어 출력
    }
}
