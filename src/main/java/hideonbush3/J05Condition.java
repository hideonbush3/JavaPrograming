package hideonbush3;

import java.util.Scanner;

public class J05Condition {
    public static void main(String[] args) {
        // 제어문
        // 프로그램의 실행 순서를 제어할 숫 있는 문장
        // 조건문, 반복문, 분기문

        // 조건문
        // 조건에 대한 만족여부에 따라 실행할 코드를 결정하는 명령문
        // ex) 짝수, 홀수 여부 출력
        int num = 6;
        if(num % 2 == 0){
            System.out.println("짝수입니다");
        }
        if(num % 2 != 0){
            System.out.println("홀수입니다");
        }

        // ex) 오전, 오후 구분
        String time = "09:47:15";
        int hour = Integer.parseInt(time.charAt(0) + "" + time.charAt(1));
        if(hour >= 12){
            System.out.println("오후입니다");
        }
        if(hour < 12){
            System.out.println("오전입니다");
        }

        // ex) 투표가 가능한지 여부 프로그램
        Scanner sc = new Scanner(System.in);
        System.out.println("귀하의 나이는?");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("투표가능합니다");
        }
        else System.out.println("나이 더 먹고 오세요");

        // 평균 점수 60점 이상이면, 시험합격 출력
        // 미만이면 불합격 출력
        System.out.println("점수는");
        int score = sc.nextInt();
        if(score >= 60) {
            System.out.println("합격입니다.");
        } else if (score < 60) {
            System.out.println("불합격입니다.");
        }

        // ex) 아이디와 비밀번호 이용해서
        // 로그인 기능 구현하기
        String userid = "abc123";
        String passwd = "987xyz";
        System.out.println("아이디는?");
        String checkUid = sc.next();

        System.out.println("비밀번호는?");
        String checkPwd = sc.next();

        if(userid.equals(checkUid) && passwd.equals(checkPwd)){
            System.out.println("로그인 성공");
        }else System.out.println("실패!");

        // 중첩 조건문 - 가독성 저하로 비추
        // if문 안에 if문이 또있음

        // 특정년도의 윤년여부를 출력 v2
        // 조건1 : 4로 나눠 떨어지고 윤년
        // 조건2 : 4로 나눠 떨어지고, 100으로도 나눠 떨어지면 평년
        // 조건3 : 400으로 나눠 떨어지면 윤년
        int year = 2023;
        if (year % 4 == 0){
            if(year % 100 != 0){
                System.out.println("윤년입니다.");
            }else {
                System.out.println("평년입니다");
            }
        }else if(year % 400 == 0) {
            System.out.println("윤년입니다.");
        }

        // 다중조건문

        // 평균정수에 따라 수우미양가 성적결과 출력
        double avg = 22.3;
        char grd = '가';    // 성적결과
        if(avg >= 90 || avg == 100) grd = '수';
        else if(avg >= 80) grd = '우';
        else if(avg >= 70) grd = '미';
        else if(avg >= 60) grd = '양';

        System.out.printf("평균점수 : %.1f, 등급 : %s%n", avg, grd);

        // 버스 기본요금 부과하기 - 나이를 입력받음
        // 미취학 아동 (~7세) : 0원
        // 어린이 (8~13) : 450원
        // 청소년 (14~19) : 720원
        // 일반 (20~) : 1200원
        // 노인 (70~) : 0원
        System.out.println("버스타는 당신의 나이는?");
        age = sc.nextInt();
        int price = 0;
        if(age >= 8 && age <= 13) price = 450;
        else if(age > 13 && age <= 19) price = 720;
        else if(age > 19 && age <= 69) price = 1200;

        System.out.printf("%d살의 버스요금은 %d원%n", age, price);


        // switch
        // 다중 조건문을 가독성 있게 작성한 조건문
        // 짝수, 홀수 여부 출력 v3
        num = 74;
        String result = "";
        switch (num % 2){
            case 0: result = "짝수입니다"; break;
            case 1: result = "홀수입니다";
        }
        System.out.printf("%d는 %s.%n", num, result);

        // 평균점수에 따라 수우미양가로 성적결과 출력 v2
        class SungJuk {
            int[] score = new int[3];
            float avg = 0f;
            int tot = 0;
            char grd = '가';

            void sungjuk (String a, String b, String c) {
                Scanner sc = new Scanner(System.in);
                String[] subject = {a, b, c};
                for(int i = 0; i < subject.length; i++){
                    System.out.printf("당신의 %s 성적은?%n", subject[i]);
                    this.score[i] = sc.nextInt();
                }
                result(a, b, c);
            }

            private void result(String a, String b, String c) {
                for(int i=0; i<this.score.length; i++){
                    this.tot += this.score[i];
                }
                this.avg = this.tot / (float) this.score.length;

                switch ((int)(this.avg / 10)){
                    case 10: case 9: this.grd = '수'; break;
                    case 8: this.grd = '우'; break;
                    case 7: this.grd = '미'; break;
                    case 6: this.grd = '양'; break;
                }

                System.out.printf("%s:%d점, %s:%d점, %s:%d점%n총점:%d점, 평균%.2f점, 등급:%s%n", a, this.score[0], b, this.score[1], c, this.score[2], this.tot, this.avg, this.grd);
            }
        }

        SungJuk sj = new SungJuk();
        sj.sungjuk("국어", "영어", "수학");

        // ex) 월, 윤년여부(Y/N)를 입력하면 해당 월의 마지막 날을 출력
        // 1,3,5,7,8,10,12 - 31일
        // 4,6,9,11 - 30일
        // 2 - 윤년여부에 따라 28(N)일 or 29(Y)일
        System.out.print("월은? ");
        int month = sc.nextInt();
        System.out.print("윤년여부는? (y/n)");
        String isLeapYear = sc.next();

        int lastDay = 0;

        switch(month) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:           lastDay = 31; break;
            case 4: case 6: case 9: case 11:    lastDay = 30; break;
            case 2: if (isLeapYear.equalsIgnoreCase("y")) lastDay = 29;
            else lastDay = 28; break;
        }

        String fmt = "%d월은 %d일 (윤년:%s)까지입니다\n";
        System.out.printf(fmt, month, lastDay, isLeapYear);
    }
}