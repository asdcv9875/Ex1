package org.opentutorials.javatutorials.polymorphism;

// 수정 전
/*class A{
    public String x(){return "A.x";}
}
class B extends A{
    public String x(){return "B.x";}
    public String y(){return "y";}
}
public class PolymorphismDemo1 {
    public static void main(String[] args) {
        A obj = new B();
        System.out.println(obj.x());
    }
}*/

// 수정 후
class A{
    public String x(){return "A.x";}
}
class B extends A{
    public String x(){return "B.x";}
    public String y(){return "y";}
}
public class PolymorphismDemo1 {
    public static void main(String[] args) {
        A obj = new B();
        System.out.println(obj.x());
    }
}

/* +++++ 해 석 +++++
클래스 B의 데이터 타입을 클래스 A로 인스턴스화 했을 때 클래스 B의 메소드 y는 마치 존재하지 않는 것처럼 실행되지 않았다.
=> 클래스 B가 클래스 A화 되었다.

클래스 B의 데이터 타입을 클래스 A로해서 인스턴스화 했을 때 클래스 B의 메소드 x를 실행하면 클래스 A에서 정의된 메소드가 아니라 클래스 B에서 정의된 메소드가 실행 되었다.
=> 클래스 B의 기본적인 성질은 그대로 간직하고 있다.*/
