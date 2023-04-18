package hideonbush3.project.sungjuk.model;

// 클래스 작성 순서
// 1. private 조건을 걸어서 캡슐화한 멤버변수 선언
// 2. 기본생성자, 생성자 정의
// 3. 캡슐화한 멤버변수에 접근하기 위한 getter, setter 메서드 정의
// 4. toString 메서드 오버라이딩

// 주의사항 : 클래스와 생성자, getter, setter 메서드는
// 다른 클래스에서 접근할 수 있게 설계해야하니 당연히 접근제한자를 public or protected or (default)로
// 설정해야겠지요? 접근제한자를 깜빡하지 말자!
public class SungJukVO {
    // 멤버변수
    private int sjno;
    private String name;
    private int kor;
    private int eng;
    private int mat;
    private int tot;
    private double avg;
    private char grd;
    private String regdate;

    // 기본생성자
    public SungJukVO() {}

    public SungJukVO(String name, int kor, int eng, int mat, int tot, double avg, char grd) {
        this(name, kor, eng, mat);  // 본인 생성자 호출(코드 중복 제거)
        this.tot = tot;
        this.avg = avg;
        this.grd = grd;
    }

    // 생성자
    public SungJukVO(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public int getSjno() {
        return sjno;
    }

    public void setSjno(int sjno) {
        this.sjno = sjno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getTot() {
        return tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public char getGrd() {
        return grd;
    }

    public void setGrd(char grd) {
        this.grd = grd;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    @Override
    public String toString() {
        String fmt = "%s %d %d %d %d %.1f %s\n";
        return String.format(fmt, name, kor, eng, mat, tot, avg, grd);
    }
}