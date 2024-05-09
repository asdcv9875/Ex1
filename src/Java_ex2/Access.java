package Java_ex2;

class A {
    public String y(){
        return "public void y()";
    }
    private String z(){
        return "public void z()";
    }
    public String x(){
        return z();
    }
}
public class Access {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
        // 아래 코드는 오류가 발생한다.
        //System.out.println(a.z()); 메소드 z에 접근할 수 없다.
        System.out.println(a.x());
    }
}

// 접근 제어자가 public인 클래스는 다른 패키지의 클래스에서도 사용할 수 있고,
// default인 경우는 같은 패키지에서만 사용 가능하다.

