package hideonbush3.project.sungjuk.dao;

import hideonbush3.project.sungjuk.model.SungJukVO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class SungJukV3DAOImpl implements SungJukV3DAO{
    String fname = "c:/Java/sungjukv3.dat";
    FileWriter fw = null;
    FileReader fr = null;
    BufferedWriter bw = null;
    BufferedReader br = null;

    @Override
    public boolean saveSungJuk(SungJukVO sj) {
        // 생성된 성적 데이터를 파일에 저장
        try{
            // 파일기록시 추가append 기능 활성화
            fw = new FileWriter(fname, true);
            bw = new BufferedWriter(fw);

            bw.write(sj.toString());    // 파일에 기록
        }catch (Exception ex){
            System.out.println("성적데이터 저장 중 오류발생!");
            System.out.println(ex.getMessage());
            return false;
        }finally {
            if (bw != null){ try{bw.close(); }  catch (Exception ex) {} }
            if (fw != null) { try{fw.close(); } catch (Exception ex) {} }
        }
        return true;
    }
}
