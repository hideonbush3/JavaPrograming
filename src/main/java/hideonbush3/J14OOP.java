package hideonbush3;

public class J14OOP {
    public static void main(String[] args) {
        // 캡슐화
        // 클래스와 멤버변수 선언시 정보의 은닉정도를 부여
        // 정보은닉 : 사용자가 굳이 알 필요가 없는 정보는
        // 사용자로부터 숨겨야 한다는 개념
        // 최소한의 정보만으로 보안과 보호를 구현할 수 있음

        // 자바에서 지원하는 4가지 접근 제한자
        // public > protected > default > private

        Address addr = new Address();

//        addr.name = "김자바";  // 에러. private은 같은 클래스내에서만 접근 가능
        addr.email = "java@naeber.com"; // defalut는 같은 패키지내에서 접근 가능
        addr.addr = "자바공화국 자바시 자바구 자바동 자바길 jdk1.8로 1.8";    // public은 다른 패키지내에서도 접근 가능
    }
}

class Address {
    private String name;
    String email;
    public String addr;
}

// 자바빈즈Beans : 식별가능하고, 재사용성이 높은 소프트웨어를
// 만들기 위한 기본 규칙, POJO 클래스라고도 함
// 멤버변수는 반드시 private으로 선언
// 기본생성자가 있어야 함
// setter/getter 메서드가 정의되어야 함
