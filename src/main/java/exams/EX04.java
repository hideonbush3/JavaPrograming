package exams;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class EX04 {
    public static void main(String[] args) {
//  11. 이름과 몸무게, 나이를 변수로 선언하고 자신의 것을 값으로 초기화하는 프로그램을 작성하여라 (MyInfo)
        String name = "홍길동";
        double weight = 60.35;
        int age = 21;
        System.out.printf("%s의 몸무게는 %.2fkg이고 나이는 %d살이다.\n", name, weight, age);


//  12. 생년월일을 이용해서 나이를 계산하는 프로그램을 작성하여라. (MyAge)
        Scanner sc = new Scanner(System.in);
        System.out.println("몇년에 태어남?");
        int byear = sc.nextInt();
        System.out.println("몇월에 태어남?");
        int bmonth = sc.nextInt();
        System.out.println("며칠에 태어남?");
        int bday = sc.nextInt();

        Date date = new Date();
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy");
        SimpleDateFormat df2 = new SimpleDateFormat("MM");
        SimpleDateFormat df3 = new SimpleDateFormat("dd");
        String Tyear = df1.format(date);
        String Tmonth = df2.format(date);
        String Tday = df3.format(date);


        int age2 = parseInt (Tyear) - byear;

        if(bmonth > parseInt(Tmonth) || (bmonth - parseInt(Tmonth)) == 0 && (bday - parseInt(Tday)) >= 0)  age2 += 1;
        System.out.printf("당신의 나이는 %d살\n", age2);


//  13. 구구단 중 7단을 출력하는 프로그램을 작성하여라. (GuGu7Dan)
        for (int i=1; i<10; i++){
            System.out.printf("7 X %d = %d\n", i, i*7);
        }

//  14. 다음 조건을 만족하는 프로그램을 작성하여라 (TimeTime)
//        하루는 86400초이다. 입력값이 1234567890일 경우 며칠인지 계산하여라
//        한 시간은 3600초이다. 입력값이 98765일 경우 몇 시간인지 계산하여라
//        일 분은 60초이다. 입력값이 12345일 경우 몇 분인지 계산하여라.
        class TimeTime {
            final int daySec = 86400;
            final int hourSec = 3600;
            final int minSec = 60;

            void TimeConverter (int a, int b, int c) {
                System.out.printf("a / %d = %d일\n", this.daySec, a / this.daySec);
                System.out.printf("b / %d = %d시간\n", this.hourSec, b / this.hourSec);
                System.out.printf("c / %d = %d분\n", this.minSec, c / this.minSec);
            }
        }
        TimeTime timetime = new TimeTime();
        timetime.TimeConverter(1234567890, 98765, 12345);
    }
}
