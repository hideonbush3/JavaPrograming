package hideonbush3;

import java.io.*;

public class J24File {
    public static void main(String[] args) {
        // 학번, 이름, 주소, 생년월일, 학과명, 교수 등으로
        // 구성된 객체의 데이터를 student.dat에 저장
        Student std01 = new Student(20016587, "엄준식",
                "아무무빌딩", "1995-01-01", "목탁디자인학과", 486);

        String fname = "c:/Java/student.dat";
        FileWriter fw = null;
        try {
            fw = new FileWriter(fname);
            fw.write(std01.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            // 파일쓰기가 끝나면 작업 종료
            if (fw != null)
                try { fw.close(); } catch (Exception ex) {}
        }

        // 파일에 저장된 학생정보를 읽어서 변수에 저장
        FileReader fr = null;
        BufferedReader br = null;
        String stdinfo = null;
        try{
            fr = new FileReader(fname);
            br = new BufferedReader(fr);

            while(br.ready()){
                stdinfo = br.readLine();
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            if (br != null){
                try{
                    br.close();
                } catch (Exception ex){}
            }
            if (fr != null){
                try{
                    fr.close();
                } catch (Exception ex){}
            }
        }

        // 변수에 저장된 학생정보 출력 1
        System.out.println(stdinfo);

        // 변수에 저장된 학생정보 출력 2
        String[] std = stdinfo.split("[ ]");
        String[] category = {"학번 : ", "이름 : ", "주소 : ", "생년월일 : ", "학과 : ", "교수 : "};
        int j = 0;
        for (String s : std){
            for(int i = 0; i < 1; i++){
                System.out.printf("%s%s%n", category[j], s);
                j++;
            }
        }           // 객체의 성질을 잃었다
                    // 객체명.멤버명으로 접근불가능
    }
}

class Student{
     int hakbun;
     String name;
     String addr;
     String birth;
     String dept;
     int prof;

    public Student(int hakbun, String name, String addr, String birth, String dept, int prof) {
        this.hakbun = hakbun;
        this.name = name;
        this.addr = addr;
        this.birth = birth;
        this.dept = dept;
        this.prof = prof;
    }

    @Override
    public String toString(){
        String fmt = "%d %s %s %s %s %d";
        return String.format(fmt, hakbun, name, addr, birth, dept, prof);
    }
}