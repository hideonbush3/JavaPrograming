package hideonbush3;

import java.util.Scanner;

public class C01Datatype {
    public static void main(String[] args) {
        // 변수와 자료형
        // 변수는 데이터를 담는 그릇
        // 변수 선언시 변수에 저장할 값의 유형을 지정해야함
        // 값의 유형에는 정수/실수/문자/불리언/문자열 등이 있음
        int a = 3;
        int b = 5;
//        int c = 1.5; 변수타입과 할당값이 일치하지 않음
        System.out.println("a:" + a + " b :"+ b);

        // 변수와 자료형이 일치할경우 한 줄로 선언가능
        int time = 20, speed = 20;

        // 상수 : 변하지 않는 값을 담은 그릇, final로 선언
        final double PI = 3.14;
        System.out.println("PI : " + PI);

        // 자료형
        // 자바의 자료형은 기본 자료형과 참조 자료형으로 나뉨
        // 기본자료형 : 단일값을 다룸 (정수, 실수, 문자, 불리언)
        // 참조자료형 : 값이 저장된 주소를 다룸 (문자열, 배열, 클래스)

        // 정수 integer : byte, short, int, long
        int c = 123;
        byte d = 1;
        short e = 25123;
        long f = 2200000000L;

        // 실수 : float, double
        double g = 1234.5678;
        float h = 9876.4321F;

        // 문자형 : char
        // 자바에서 단일문자를 다룰때 사용
        // 작은따옴표로 정의
        char i = 'a', j = '가';
        char k = '\uAC00';  // '가'의 유니코드
        System.out.println(k);

        // 논리형 : boolean
        boolean l = true;

        // 문자열
        // String : 자바에서 다중문자를 다룰 때 사용 (큰 따옴표로 정의)
        String m = "👍";
        String n = "😫";
        System.out.println(m);

        // 형식문자열을 이용한 출력 : printf
        System.out.printf("a: %d\n", a);

        // ex) 성적 처리프로그램 v1
        // 이름, 국어, 영어, 수학을 초기화시켜서
        // 총점, 평균을 계산한 뒤 결과 출력
        int tot, avg, kor, eng, mat;
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        kor = sc.nextInt();
        eng = sc.nextInt();
        mat = sc.nextInt();
        tot = kor + eng + mat;
        avg = (kor + eng + mat) / 3;
        System.out.printf("이름: %s, 총점: %d, 평균: %d", name, tot, avg);


    }
}
