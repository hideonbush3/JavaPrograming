package hideonbush3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class J31JDBC {
    private static String DRV = "org.mariadb.jdbc.Driver";
    private static String URL = "jdbc:mariadb://fullstacks.c2yb5bw4urpd.ap-northeast-2.rds.amazonaws.com:3306/fullstacks";
    private static String USR = "admin";
    private static String PWD = "fullstack_2023";

    private static String updateBookSQL = "update newbooks set title = ?, writer = ?, price = ? where bookno = ?;";

    public static void main(String[] args) {
        // newbooks 테이블에서 입력받은
        // 도서정보(도서번호, 도서명, 저자, 가격)을 이용해서 레코드 수정

        // 수정할 도서명을 입력받음
        Scanner sc = new Scanner(System.in);
        System.out.println("수정할 도서번호는?? ");
        int bkno = sc.nextInt();
        System.out.println("바꿀 책이름을 입력하세요");
        String mdfName = sc.next();
        System.out.println("바꿀 저자명을 입력하세요");
        String writer = sc.next();
        System.out.println("바꿀 가격명을 입력하세요");
        int price = sc.nextInt();

        try{
            // 데이터베이스 관련 라이브러리들을 사용하기위해 mariadb 드라이버를 메모리에 적재
            Class.forName(DRV);
        }catch (ClassNotFoundException e){
            System.out.println("mariadb용 jdbc 드라이버가 없어요!!");
        }

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // 데이터베이스 접속
            conn = DriverManager.getConnection(URL, USR, PWD);
            // 실행할 SQL문 생성
            pstmt = conn.prepareStatement(updateBookSQL);
            pstmt.setString(1, mdfName);
            pstmt.setString(2, writer);
            pstmt.setInt(3, price);
            pstmt.setInt(4, bkno);

            // SQL문 실행 후 바뀐 행 수 받음
            int cnt = pstmt.executeUpdate();
            if (cnt != 0) System.out.println("수정완료!");


        } catch (SQLException e) {
            System.out.println("디비 접속주소나 아이디/비번, SQL문을 다시 확인하세요!!");
        } finally {
            if(pstmt != null)try{ pstmt.close(); }catch (Exception e){}
            if(conn != null)try{ conn.close(); }catch (Exception e){}
        }
    }
}

