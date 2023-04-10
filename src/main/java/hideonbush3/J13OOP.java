package hideonbush3;

public class J13OOP {

    // 메서드 다중정의(오버로딩)
// 객체지향 3대 중요개념 중 하나인 다형성에 해당
// 같은 이름의 메서드를 중복해서 정의하는 것을 의미
// 한 클래스에 같은 이름의 메서드가 2개 이상 존재할 수 있음
// 이때 메서드의 선언만 다르게 작성한다면 정의 가능
    public static void main(String[] args) {
        Cat persian = new Cat();

    }
}


class Cat {
    private String bread;
    private String color;

    public Cat() {
    }

    // 생성자 오버로딩
    public Cat(String bread, String color) {
        this.bread = bread;
        this.color = color;
    }

    public Cat(String bread) {
        this.bread = bread;
    }

    // 오버로딩 규칙 위반
    // 선언부가 동일한 메서드가 이미 있음
//    public Cat(String color) {
//        this.color = color;
//    }
}

class NotOverloading {
    // 간단한 덧셈 프로그램
    // 1. 정수2개를 더하는 메서드
    public int addInt(int x, int y){
        return x + y;
    }
    // 2. 실수2개를 더하는 메서드
    public double addDouble(double x, double y, double z){
        return x + y + z;
    }
    // 3. 정수3개를 더하는 메서드
    public int addInt(int x, int y, int z){
        return x + y + z;
    }
}

class ApplyOverloading {
    // 간단한 덧셈 프로그램
    // 1. 정수2개를 더하는 메서드
    // 2. 실수2개를 더하는 메서드
    // 3. 정수3개를 더하는 메서드
}