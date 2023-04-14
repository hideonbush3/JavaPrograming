package hideonbush3;

import java.sql.*;
import java.util.Scanner;

public class J28JDBC {
    private static String DRV = "org.mariadb.jdbc.Driver";
    private static String URL = "jdbc:mariadb://fullstacks.c2yb5bw4urpd.ap-northeast-2.rds.amazonaws.com:3306/fullstacks";
    private static String USR = "admin";
    private static String PWD = "fullstack_2023";

    private static String seletcBookSQL = "select * from newbooks order by bookno desc;";
    public static void main(String[] args) {
        // newbooks 테이블의 모든 레코드 조회

        try{
            // 데이터베이스 관련 라이브러리들을 사용하기위해 mariadb 드라이버를 메모리에 적재
            Class.forName(DRV);
        }catch (ClassNotFoundException e){
            System.out.println("mariadb용 jdbc 드라이버가 없어요!!");
        }

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // 데이터베이스 접속
            conn = DriverManager.getConnection(URL, USR, PWD);
            // 실행할 SQL문 생성
            pstmt = conn.prepareStatement(seletcBookSQL);

            // SQL문 실행 후 결과집합 받음
            rs = pstmt.executeQuery();   // DML중 select 실행시 사용

            while(rs.next()){
                System.out.print(rs.getInt("bookno") + " ");
                System.out.print(rs.getString("regdate") + " ");
                System.out.print(rs.getString("writer") + " ");
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println("디비 접속주소나 아이디/비번을 다시 확인하세요!!");
        } finally {
            if(rs != null)try{ rs.close(); }catch (Exception e){}
            if(pstmt != null)try{ pstmt.close(); }catch (Exception e){}
            if(conn != null)try{ conn.close(); }catch (Exception e){}
        }

    }
}

class Book {
    private int bookno;
    private String title;
    private String writer;
    private int price;
    private String regdate;

    public Book(){}

    public Book(int bookno, String title, String writer, int price, String regdate) {
        this.bookno = bookno;
        this.title = title;
        this.writer = writer;
        this.price = price;
        this.regdate = regdate;
    }

    public int getBookno() {
        return bookno;
    }

    public void setBookno(int bookno) {
        this.bookno = bookno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    @Override
    public String toString() {
        String fmt = "%d %s %s %i %s%n";
        return String.format(fmt, bookno, title, writer, price, regdate);
    }
}