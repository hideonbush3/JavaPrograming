package exams;

public class EX02 {
    // p79  #4, #5, #6 문제
    public static void main(String[] args) {

        // 3. 12다스 펜을 27명의 학생이 나눠가질때 학생당 나눠갖는 펜 수와 남는 펜 수를 구하라
        int colorPen = 5 * 12;
        int studentCount = 27;
        int divColorPen = colorPen / studentCount;
        System.out.printf("학생당 나눠가지는 색연필 수 : %d\n", divColorPen);
        int remainColorPen = colorPen % studentCount;
        System.out.printf("똑같이 나눠가지고 남은 볼펜수 : %d\n", remainColorPen);

        // 4. 놀이기구 탑승 조건
        // 6세이상이거나 키가 120cm 이상일 경우 부모동반시 탑습가능
        // 그리고 어떤 질환이 있을시 탑승불가
        int age = 10;
        int height = 130;
        Boolean parent = true;
        Boolean hearchDease = true;
        String result = (age >= 6 || parent) && height >= 120 && !hearchDease ? "탑승가능" : "탑승불가";
        System.out.printf("나이 : %d\n키 : %d\n부모동반여부 :%s\n실장질환여부: %s\n당신은 %s 입니다.\n",
                age, height, parent, hearchDease, result);

        // 5. 윤년여부 조건식 작성
        int year = 1996;
        boolean leapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        System.out.printf("%b\n", leapYear);

        // 6. 187000원을 지불했을때 가장 적은 지폐수로 지불하는 경우 지불하는 지폐 종류의 장수
        int price = 187000;
        int oman = price / 50000;
        int ilman = price % 50000 / 10000;
        int ochun = price % 50000 % 10000 / 5000;
        int ilchun = price % 50000 % 10000 % 5000 / 1000;
        System.out.printf("5만원권 : %d\n", oman);
        System.out.printf("1만원권 : %d\n", ilman);
        System.out.printf("5천원권 : %d\n", ochun);
        System.out.printf("1천원권 : %d\n", ilchun);
    }
}
