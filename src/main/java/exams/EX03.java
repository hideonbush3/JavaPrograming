package exams;

public class EX03 {
    public static void main(String[] args) {

        // 7. 각 표현식에 대한 결과 값을 계산하여라. 만일 틀린 식이 있다면 수정하여라.
        System.out.println(3 + 4.5 * 2 + 27 / 8);
        System.out.println(true || false && 3 < 4 || !(5 == 7));
        System.out.println(true || (3 < 5 && 6 >= 2));
//      System.out.println(!true > 'A'); 연산자는 boolean이나 char 타입에 적용할 수 없음
        // 단일문자가 연산에 사용되면 ASCII코드 값으로 자동형변환됨 ex)Z : 90
        System.out.println(7 % 4 + 3 - 2 / 6 * 'Z');
        System.out.println('D' + 1 + 'M' % 2 / 3);
        System.out.println(5.0 / 3 + 3 / 3);
        System.out.println(53 % 21 < 45 / 18);
        System.out.println((4 < 6) || true && false || false && (2 > 3));
        System.out.println(7 - (3 + 8 * 6 + 3) - (2 + 5 * 2));


//        8. 다음의 자바 문장에 잘못된 부분이 있는지 알아보고,
//           만약 올바르다면 출력결과를, 그렇지 않다면 그 이유를 서술하여라
        System.out.print( " May 13, 1988 fell on day number ");
        System.out.println( ( (13 + (13 * 3 - 1) / 5 + 1988 % 100 + 1988 % 100 / 4 + 1988 / 400
                - 2 * (1988 / 100) ) % 7 + 7) % 7 );
        System.out.println( " Check out this line  ");
        System.out.println( " //hello there " + '9' + 7 );
        // 단일문자 'H'와 'I'가 + 연산자를 만나 ASCII 코드로 자동형변환돼서 값이 145가 된다
        System.out.println( 'H' + 'I' + " is " + 1 + "more example" );
        System.out.println( 'H' + 6.5 + 'I' + " is " + 1 + "more example" );
//      System.out.println( "Print both of us", "Me too" );   // "String" + "String" 이라고 써야함
        System.out.println( "Reverse " + 'I' + 'T' );
        System.out.println( "No! Here is" + 1 + "more example" );
//      System.out.println( "Here is " + 10 * 10) )     // ';' 누락
        System.out.println( "Not x is " + true );
//      System.out.println(  );   // print 메서드 인수 누락
//      System.out.println;     // 메서드 호출법 틀림
//      System.out.println( "How about this one" ++ '?' + 'Huh?' );   // '++' 는 적산연산자임 '+' 로 수정필요

        // 번외
        // 요일 계산
        System.out.print( " Dec 25, 2023 fell on day number ");
        System.out.println( ( (25 + (25 * 2 - 1) / 12 + 2023 % 100 + 2023 % 100 / 4 + 2023 / 400
                - 2 * (2023 / 100) ) % 7 + 7) % 7 );


//        9. 각 부울 표현식에 대한 값을 계산하여라. 자바는 단축식 평가
//        short-circuit evaluation을 사용한다는 점에 주의하여라.
// 논리연산자 우선순위  ! => && => ||
// 단축식 평가 1 : and 연산시 한쪽이 false면 무조건 false
// 단축식 평가 2 : or 연산시 한쪽이 true면 무조건 true
        System.out.println(true && false && true || true);
        System.out.println(true || true && true && false);
        System.out.println((true && false) || (true && !false) || (false && !false));
        System.out.println((2 < 3) || (5 > 2) && !(4 == 4) || 9 != 4);
        System.out.println(6 == 9 || 5 < 6 && 8 < 4 || 4 > 3);
    }
}
