package exams;

import java.util.Random;
import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {
        // Q25 - 복권 발행 프로그램 : Lotto
        // 위치에 상관없이 숫자만 맞으면 일치하는 것으로 인정!
        // 123 - 345  : 1개 일치
        // 365 - 531  : 2개 일치
        /*Scanner sc = new Scanner(System.in);
        String lottokey = "856";
        System.out.print("복권숫자는? ");
        String yourkey = sc.next();
        int match = 0;    // 일치여부
        char key = yourkey.charAt(0);  // 첫번째 숫자 비교
        if (key == lottokey.charAt(0) ||
                key == lottokey.charAt(1) ||
                    key == lottokey.charAt(2)) ++match;
        key = yourkey.charAt(1);      // 두번째 숫자 비교
        if (key == lottokey.charAt(0) ||
                key == lottokey.charAt(1) ||
                    key == lottokey.charAt(2)) ++match;
        key = yourkey.charAt(2);      // 세번째 숫자 비교
        if (key == lottokey.charAt(0) ||
                key == lottokey.charAt(1) ||
                    key == lottokey.charAt(2)) ++match;
        String result = "아쉽지만, 다음 기회를!";
        if (match == 3) result = "당첨! 상금 100만원 지급!!";
        System.out.printf(
            "복권번호 : %s, 입력한 번호 : %s\n",  lottokey, yourkey);
        System.out.printf(
            "당첨여부 : %d개 일치, 결과여부 : %s \n", match, result);*/


        // Q25 - 복권 발행 프로그램 : Lotto v2
        Scanner sc = new Scanner(System.in);

        Random rnd = new Random();   // 난수생성을 위한 객체 정의
        String lottokey = "";

        // nextInt(경계값) : 0 ~ 경계값-1 사이의 정수 난수 출력
        // 1 ~ 9 사이 임의의 정수 3개를 난수로 생성
        for (int i = 0; i < 3; i++) {
            lottokey += rnd.nextInt(9) + 1;
        }

        System.out.print("복권숫자는? ");
        String yourkey = sc.next();

        int match = 0;    // 일치여부
        // 첫번째 숫자 비교

        for (int i = 0; i < 3; i++) {
            char key = yourkey.charAt(i);
            if (key == lottokey.charAt(0) ||
                    key == lottokey.charAt(1) ||
                    key == lottokey.charAt(2)) ++match;
        } // 당첨여부 확인

        String result = "아쉽지만, 다음 기회를!";
        if (match == 3) result = "당첨! 상금 100만원 지급!!";

        System.out.printf(
                "복권번호 : %s, 입력한 번호 : %s\n",  lottokey, yourkey);
        System.out.printf(
                "당첨여부 : %d개 일치, 결과여부 : %s \n", match, result);

        // 30. 다음 조건에 따라 숫자 맞추기 프로그램을 작성해보세요. (CatchNumber)
        // 사용자로부터 1 - 100사이의 숫자를 입력 받으세요 (num1)
        // 변수에 임의의 숫자 3자리를 초기화합니다 (num2)
        // num1이 num2보다 크면 “추측한 숫자가 큽니다”라고 출력하세요
        // num1이 num2보다 작으면 “추측한 숫자가 작습니다”라고 출력하세요
        // num1과 num2가 같으면 “빙고! 숫자를 맞췄습니다”라고 출력하고 종료
        int num2 = (int) (Math.random() * 100) + 1;

        while(true) {
            System.out.println("1 ~ 100 사이의 숫자를 입력해보세요.");
            int num1 = sc.nextInt();
            if (num2 == num1) {
                System.out.println("빙고!");
                break;
            }
            else if (num2 > num1) System.out.println("추측한 숫자가 작습니다.");
            else if (num2 < num1) System.out.println("추측한 숫자가 큽니다.");
        }
        // 32. 키보드로 정수를 하나 입력받아 다음 조건에 따라 결과를 출력하는 프로그램을 작성하시오. (CheckNumber)
        // 입력한 값이 10000 보다 작으면 “10000미만” 이라 출력
        // 입력한 값이 10000 이상 20000미만 이면 “10000~20000” 이라 출력
        // 입력한 값이 20000 이상 30000미만 이면 “20000~30000” 이라 출력
        // 입력한 값이 그 이외 값이면 “범위 밖 값” 이라 출력
        System.out.println("숫자를 입력해보세요.");
        int num = sc.nextInt();
        String msg = "범위 밖 값";
        if(num >= 20000 && num < 30000) msg = "20000~30000";
        else if(num >= 10000) msg = "10000~20000";
        else if(num < 10000) msg = "10000미만";
        System.out.println(msg);

        // 48. 지금 현재 수지의 통장잔액이 25,000원이다.
        // 은행이자가 연 6%라 가정할 때, 몇 년이 지나야 통장잔액이 지금의 2배를 넘는지
        // 알아보는 프로그램을  아래 예시를 참고하여 작성하여라. (ComputeInvestment)
        // 원금 25,000원에 연 이율 6%를 적용하면 12년뒤에야 2배 수익이 납니다.
        int year = 0;
        float money = 25000F;
        while (money < 50000F){
            money += money * 0.06;
            year++;
            System.out.printf("%d년차의 금액:%f원%n", year, money);
        }
        System.out.printf("%d년 걸렸습니다.", year);
    }
}
