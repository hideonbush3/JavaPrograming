package hideonbush3;

import java.util.Scanner;

public class C04Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요");
        String name = sc.next();

        // ex) 성적 처리프로그램 v2
        // 이름, 국어, 영어, 수학을 초기화시켜서
        // 총점, 평균, 학점을 계산한 뒤 결과 출력
        int tot, avg, kor, eng, mat;
        System.out.print("국어점수를 입력하세요");
        kor = sc.nextInt();
        System.out.print("영어점수를 입력하세요");
        eng = sc.nextInt();
        System.out.print("수학점수를 입력하세요");
        mat = sc.nextInt();
        tot = kor + eng + mat;
        avg = (kor + eng + mat) / 3;
        char grade = 'F';
        switch (avg/10){
            case 10 : case 9 : grade = 'A'; break;
            case 8 : grade = 'B'; break;
            case 7 : grade = 'C'; break;
            case 6 : grade = 'D'; break;
        }
        System.out.printf("이름: %s\n총점: %d\n평균: %d\n학점: %s\n", name, tot, avg, grade);

        // 종료시 sc 객체 제거
        sc.close();

    }
}
