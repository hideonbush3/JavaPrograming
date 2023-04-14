package hideonbush3.project.sungjuk.dao;

import hideonbush3.project.sungjuk.model.SungJukVO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

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

    // 파일에 저장된 성적 데이터들을 모두 읽어서
    // ArrayList 객체에 저장하고 리턴
    @Override
    public List<SungJukVO> loadSungJuk() {
        List<SungJukVO> sjdata = new ArrayList<>();
        try{
            // 파일기록시 추가append 기능 활성화
            fr = new FileReader(fname);
            br = new BufferedReader(fr);

            while(br.ready()) {
                // 파일에서 성적데이터 한줄을 읽어서
                String[] val = br.readLine().split("[ ]");
                // SungJuk 객체에 개별 값을 저장하고
                // ArrayList 객체에 저장
                SungJukVO sj = new SungJukVO(
                        val[0],
                        Integer.parseInt(val[1]),
                        Integer.parseInt(val[2]),
                        Integer.parseInt(val[3]),
                        Integer.parseInt(val[4]),
                        Double.parseDouble(val[5]),
                        val[6].charAt(0));

                        // ArrayList 객체에 저장
                sjdata.add(sj);
            }
        }catch (Exception ex){
            System.out.println("성적데이터 불러오는중 오류발생!");
            System.out.println(ex.getMessage());

        }finally {
            if (br != null){ try{br.close(); }  catch (Exception ex) {} }
            if (fr != null) { try{fr.close(); } catch (Exception ex) {} }
        }

        return sjdata;
    }

    // 프로그램 종료 시
    // ArrayList에 저장된 모든 성적데이터를 파일에 기록 ( 메모리 -> HDD, SSD)
    @Override
    public void writeSungjuk(List<SungJukVO> sjs) {
        try{
            fw = new FileWriter(fname);
            bw = new BufferedWriter(fw);

            for(SungJukVO sj : sjs){
                bw.write(sj.toString());    // 파일에 기록
            }
        }catch (Exception ex){
            System.out.println("성적데이터 기록중 오류발생!");
            System.out.println(ex.getMessage());

        }finally {
            if (bw != null){ try{bw.close(); }  catch (Exception ex) {} }
            if (fw != null) { try{fw.close(); } catch (Exception ex) {} }
        }
    }
}
