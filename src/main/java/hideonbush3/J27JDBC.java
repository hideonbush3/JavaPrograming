package hideonbush3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class J27JDBC {
    private static String insertBookSQL = "insert into newbooks(title, writer, price) values(?, ?, ?);";
    public static void main(String[] args) {
        // newbooks 테이블에 도서정보 저장
        Scanner sc = new Scanner(System.in);
        System.out.print("도서명은? ");
        String bkname = sc.next();
        System.out.print("저자는? ");
        String author = sc.next();
        System.out.print("도서가격은? ");
        int price = sc.nextInt();

        // 데이터베이스 접속
        Connection conn = J32JDBCUtil.makeConn();

        PreparedStatement pstmt = null;
        try {
            // 실행할 SQL문 생성
            pstmt = conn.prepareStatement(insertBookSQL);
            // 실행할 SQL문 placeholder에 값 전달
            pstmt.setNString(1, bkname);
            pstmt.setNString(2, author);
            pstmt.setInt(3, price);
            // SQL문 실행 후 결과 확인
            int cnt = pstmt.executeUpdate();    // DML중 insert, delete, update 실행시 executeUpdate() 사용
            if (cnt != 0) System.out.println("데이터 넣기 성공");

        } catch (SQLException e) {
            System.out.println("디비 접속주소나 아이디/비번, SQL문을 다시 확인하세요!!");
        } finally {
            // static 메서드는 객체 생성없이 바로 사용 가능
            // 클래스명.메서드();
            J32JDBCUtil.closeConn(null, pstmt, conn);
        }

    }
}
