package hideonbush3;

import java.util.Scanner;

public class BookMarketService {
    private Scanner sc = null;

    public BookMarketService(){
        sc = new Scanner(System.in);
    }

    // bookmarket 메뉴 작성
    public String displayMenu(){
        StringBuilder sb = new StringBuilder();

        sb.append("-----------------------------------\n")
                .append("Welcome to Shopping Mall\n")
                .append("Welcome to Book Market!\n")
                .append("-----------------------------------\n")
                .append("1. 고객 정보 확인하기\n").append("2. 장바구니 상품 목록 보기\n")
                .append("3. 장바구니 비우기\n").append("4. 바구니에 항목 추가하기\n")
                .append("5. 장바구니의 항목 수량 줄이기\n").append("6. 장바구니의 항목 삭제하기\n")
                .append("7. 영수증 표시하기\n").append("0. 종료\n")
                .append("-----------------------------------\n")
                .append("작업을 선택하세요 : ");
        System.out.print(sb);
        String menu = sc.next();
        return menu;
    }

    // 입력한 메뉴에 따라 작업 분기
    public void processMenu(String menu){
        switch (menu){
            case "1": System.out.printf("고객정보 확인%n"); break;
            case "2": System.out.printf("장바구니 상품 목록 보기%n"); break;
            case "3": System.out.printf("장바구니 비우기%n"); break;
            case "4": System.out.printf("바구니에 항목 추가하기%n"); break;
            case "5": System.out.printf("장바구니의 항목 수량 줄이기%n"); break;
            case "6": System.out.printf("장바구니의 항목 삭제하기%n"); break;
            case "7": System.out.printf("영수증 표시하기%n"); break;
            case "0":
                System.out.println("프로그램을 종료합니다");
                System.exit(0);break;   // 정상 종료
            default: System.out.println("잘못 입력하셨습니다.");
        }
    }
}
