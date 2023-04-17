package hideonbush3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import static hideonbush3.J32JDBCUtil.closeConn;

public class J31JDBC {
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

        // 데이터베이스 접속
        Connection conn = J32JDBCUtil.makeConn();

        PreparedStatement pstmt = null;
        try {
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
            // static 메서드는 객체 생성없이 바로 사용 가능
            // 클래스명.메서드();
            J32JDBCUtil.closeConn(null, pstmt, conn);
        }
    }
}

