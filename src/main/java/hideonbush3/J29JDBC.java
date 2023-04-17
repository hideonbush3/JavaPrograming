package hideonbush3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static hideonbush3.J32JDBCUtil.closeConn;

public class J29JDBC {
    private static String seletcBookSQL = "select * from newbooks where title like ? order by bookno desc;";

    public static void main(String[] args) {
        // newbooks 테이블에서 제목에 IT CookBook이 포함된 모든 레코드 조회
        List<Book> bookdata = new ArrayList<>();

        // 검색할 도서명을 입력받음
        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 도서명은? ");
        String findbook = sc.nextLine();

        // 데이터베이스 접속
        Connection conn = J32JDBCUtil.makeConn();

        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // 실행할 SQL문 생성
            pstmt = conn.prepareStatement(seletcBookSQL);
            pstmt.setString(1, "%" + findbook + "%");

            // SQL문 실행 후 결과집합 받음
            rs = pstmt.executeQuery();   // DML중 select 실행시 사용

            while(rs.next()){
                Book book = new Book(rs.getInt(1),
                        rs.getString(2), rs.getString(3),
                        rs.getInt(4), rs.getString(5));
                bookdata.add(book);
            }

        } catch (SQLException e) {
            System.out.println("디비 접속주소나 아이디/비번, SQL문을 다시 확인하세요!!");
        } finally {
            // static 메서드는 객체 생성없이 바로 사용 가능
            // 클래스명.메서드();
            J32JDBCUtil.closeConn(rs, pstmt, conn);
        }
        // 도서정보 출력
        for (Book b : bookdata){
            System.out.println(b.toString());
        }

    }
}

class Book2 {
    private int bookno;
    private String title;
    private String writer;
    private int price;
    private String regdate;

    public Book2(){}

    public Book2(int bookno, String title, String writer, int price, String regdate) {
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
        String fmt = "%d %s %s %d %s%n";
        return String.format(fmt, bookno, title, writer, price, regdate);
    }
}