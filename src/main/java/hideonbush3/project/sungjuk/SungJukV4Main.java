package hideonbush3.project.sungjuk;

import hideonbush3.project.sungjuk.service.SungJukV1cService;
import hideonbush3.project.sungjuk.service.SungJukV4ServiceImpl;

public class SungJukV4Main {
    // 성적 처리프로그램 v3
    // 배열과 클래스, 인터페이스, 예외처리, 컬렉션, JDBC를 이용해서
    // 성적을 입력하면 총점,평균,학점을 계산함
    // 입력 가능한 학생 성적 데이터는 최대 10명까지
    // SungJukV4Main, SungJukVO, SungJukV1cService, SungJukV4ServiceImpl
    // SungJukV4DAO, SungJukV4DAOImpl
    // 1. 성적데이터 입력
    // 2. 성적데이터 조회     (모든 성적 데이터 출력)
    // 3. 성적데이터 상세조회  (특정 학생의 성적 데이터 출력)
    // 4. 성적데이터 수정
    // 5. 성적데이터 삭제
    // 0. 프로그램 종료

    public static void main(String[] args) {
        SungJukV1cService sjsrv = new SungJukV4ServiceImpl();

        while (true) {
            int menu = sjsrv.displayMenu();

            sjsrv.processMenu(menu);
        }
    }

}