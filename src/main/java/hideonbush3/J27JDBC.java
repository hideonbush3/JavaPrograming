package hideonbush3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class J27JDBC {
    private static String DRV = "org.mariadb.jdbc.Driver";
    private static String URL = "jdbc:mariadb://fullstacks.c2yb5bw4urpd.ap-northeast-2.rds.amazonaws.com:3306/fullstacks";
    private static String USR = "admin";
    private static String PWD = "fullstack_2023";

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

        try{
            // 데이터베이스 관련 라이브러리들을 사용하기위해 mariadb 라이브러리를 메모리에 적재
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
            if(pstmt != null)try{ pstmt.close(); }catch (Exception e){}
            if(conn != null)try{ conn.close(); }catch (Exception e){}
        }

    }
}