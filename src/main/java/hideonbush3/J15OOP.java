package hideonbush3;

import java.util.ArrayList;

public class J15OOP {
    // 클래스 종류
    // Service : 비지니스 로직 처리를 담당하는 클래스
    // VO로 저장된 데이터를 DAO로 넘기기 전에
    // 처리해야 하는 일반적인 작업을 기능으로 구현한 클래스
    // 메서드만 저장하기 위해 생성하는 클래스

    // 일반적인 프로그래밍 작성 흐름
    // J2EE 개발에 최적화된 방식
    // VO - Service - DAO - DB
    // ex) 성적처리 프로그램
    // 1. 학생 정보를 담을 VO 클래스를 생성
    // 2. 학생 정보를 처리할 Service 클래스를 생성.
    //    이 클래스는 입력받은 학생 정보를 가지고 총점(total), 평균(avg), 학점(grade)을 계산하고,
    //    계산된 정보와 함께 DAO 클래스에 저장 요청을 보냄.
    // 3. Service 클래스에서 저장 요청을 보낸 학생 정보를 DB에 저장하기 위해, DAO 클래스를 생성.
    //    이 클래스는 JDBC를 사용하여 DB에 접근하고, 입력받은 학생 정보를 DB에 저장.
    public static void main(String[] args) {
        // 회원처리 기능이 정의된 클래스의 객체 생성
        MemberService msrv = new MemberService();

        // 회원정보 저장 기능이 정의된 클래스의 객체 생성
        Member m = new Member("홍길동", "010", "1234", "5678", "abc123", "xyz987.com");

        msrv.newMember(m);
        msrv.readMember();
        msrv.readOneMember("홍길동");
        msrv.modifyMember("홍길동");
        msrv.removeMember("홍길동");
    }
}

// 회원정보 : 이름, 전화번호, 이메일
class Member{
    private String name;
    private String hp1; // 지역번호
    private String hp2; // 국번
    private String hp3; // 국번
    private String email1;
    private String email2;

    public Member (){};

    public Member(String name, String hp1, String hp2, String hp3, String email1, String email2) {
        this.name = name;
        this.hp1 = hp1;
        this.hp2 = hp2;
        this.hp3 = hp3;
        this.email1 = email1;
        this.email2 = email2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHp1() {
        return hp1;
    }

    public void setHp1(String hp1) {
        this.hp1 = hp1;
    }

    public String getHp2() {
        return hp2;
    }

    public void setHp2(String hp2) {
        this.hp2 = hp2;
    }

    public String getHp3() {
        return hp3;
    }

    public void setHp3(String hp3) {
        this.hp3 = hp3;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }
}

// 학생정보와 관련된 CRUD 기능 구현
class MemberService {
    // 회원 생성C : new~
    public boolean newMember(Member mvo){
        System.out.println("회원정보 생성");
        return false;
    }

    // 불특정다수 회원조회R : read~
    public Member[] readMember(){
        System.out.println("회원정보 리스트 조회");
        return null;
    }

    // 특정 회원조회R : readOne~
    public Member readOneMember(String name){
        System.out.println("회원정보 상세조회");
        return null;
    }

    // 회원수정U : modify~
    public boolean modifyMember(String name){
        System.out.println("회원정보 수정");
        return false;
    }

    // 회원삭제D : remove~
    public boolean removeMember(String name){
        System.out.println("회원정보 삭제");
        return false;
    }
}