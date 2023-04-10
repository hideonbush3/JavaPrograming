package hideonbush3;

import java.util.Scanner;

public class BookMarket {

    // 프로그램 실행 흐름
    // BookMarket -> BookService, MemberService <- Book, Member
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // bookmarket 메뉴 작성
        while(true) {
            System.out.println("-----------------------------------");
            System.out.println("Welcome to Shopping Mall");
            System.out.println("Welcome to Book Market!");
            System.out.println("-----------------------------------");
            System.out.println("1. 고객 정보 확인하기");
            System.out.println("2. 장바구니 상품 목록 보기");
            System.out.println("3. 장바구니 비우기");
            System.out.println("4. 바구니에 항목 추가하기");
            System.out.println("5. 장바구니의 항목 수량 줄이기");
            System.out.println("6. 장바구니의 항목 삭제하기");
            System.out.println("7. 영수증 표시하기");
            System.out.println("0. 종료");
            System.out.println("-----------------------------------");
            System.out.print("메뉴 번호를 선택해주세요 ");
            int menu = sc.nextInt();
            switch (menu){
                case 1: System.out.printf("고객정보 확인%n"); break;
                case 2: System.out.printf("장바구니 상품 목록 보기%n"); break;
                case 3: System.out.printf("장바구니 비우기%n"); break;
                case 4: System.out.printf("바구니에 항목 추가하기%n"); break;
                case 5: System.out.printf("장바구니의 항목 수량 줄이기%n"); break;
                case 6: System.out.printf("장바구니의 항목 삭제하기%n"); break;
                case 7: System.out.printf("영수증 표시하기%n"); break;
                case 0:
                    System.out.println("프로그램을 종료합니다");
                    System.exit(0);break;   // 정상 종료
            }
            System.out.println();
        }
    }
}

