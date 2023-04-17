package hideonbush3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static hideonbush3.J32JDBCUtil.closeConn;

public class J30JDBC {
    private static String deleteBookSQL = "delete from newbooks where bookno = ?;";

    public static void main(String[] args) {

        // 삭제할 도서번호 입력받음
        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 도서번호는?? ");
        int findbook = sc.nextInt();

        // 데이터베이스 접속
        Connection conn = J32JDBCUtil.makeConn();

        PreparedStatement pstmt = null;

        try {
            // 삭제할 SQL문 생성
            pstmt = conn.prepareStatement(deleteBookSQL);
            pstmt.setInt(1, findbook);

            // SQL문 실행 후 결과집합 받음
            int cnt = pstmt.executeUpdate();
            if (cnt != 0) System.out.println("삭제완료!");


        } catch (SQLException e) {
            System.out.println("디비 접속주소나 아이디/비번, SQL문을 다시 확인하세요!!");
        } finally {
            // static 메서드는 객체 생성없이 바로 사용 가능
            // 클래스명.메서드();
            J32JDBCUtil.closeConn(null, pstmt, conn);
        }
    }
}