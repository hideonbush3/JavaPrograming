package hideonbush3;

import java.sql.*;

public class J32JDBCUtil {
    private static String DRV = "org.mariadb.jdbc.Driver";
    private static String URL = "jdbc:mariadb://fullstacks.c2yb5bw4urpd.ap-northeast-2.rds.amazonaws.com:3306/fullstacks";
    private static String USR = "admin";
    private static String PWD = "fullstack_2023";

    // 데이터베이스 접속 객체 생성
    public static Connection makeConn() {
        Connection conn = null;
        try{
            // 데이터베이스 관련 라이브러리들을 사용하기위해 mariadb 드라이버를 메모리에 적재
            Class.forName(DRV);
            // 데이터베이스 접속
            conn = DriverManager.getConnection(URL, USR, PWD);
        } catch (ClassNotFoundException e) {
            System.out.println("해당 jdbc 드라이버가 존재하지 않습니다!");
        } catch (SQLException ex) {
                System.out.println("URL, 아이디/비밀번호를 다시 확인하세요!");
        } return conn;
    }

    // 데이터베이스 접속 객체 해제
    public static void closeConn(ResultSet rs, PreparedStatement pstmt, Connection conn) {
        if(rs != null)try{ rs.close(); }catch (Exception e){}
        if(pstmt != null)try{ pstmt.close(); }catch (Exception e){}
        if(conn != null)try{ conn.close(); }catch (Exception e){}
    }
}


