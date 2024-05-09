package Java_ex2;

interface I1 {
    public void x();
}
interface I2 {
    public void z();
}
class S implements I1, I2{
    public void x(){}
    public void z(){}
}

// 하나의 클래스가 여러개의 인터페이스를 구현 할 수 있다.
// 인터페이스도 상속이 된다.
// 인터페이스의 맴버는 반드시 public이다.
