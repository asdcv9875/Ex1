package org.opentutorials.javatutorials.polymorphism;

abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    int _sum() {
        return this.left + this.right;
    }
    public abstract void sum();
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
}
class CalculatorDecoPlus extends Calculator {
    public void sum(){
        System.out.println("+ sum :"+_sum());
    }
    public void avg(){
        System.out.println("+ avg :"+(this.left+this.right)/2);
    }
}
class CalculatorDecoMinus extends Calculator {
    public void sum(){
        System.out.println("- sum :"+_sum());
    }
    public void avg(){
        System.out.println("- avg :"+(this.left+this.right)/2);
    }
}
public class CalculatorDemo {
    // execute 메소드는 CalculatorDecoPlus와 CalculatorDecoMinus 클래스의 메소드 run을
    // 호출하면서 그것이 '실행결과'라는 사실을 화면에 표시하는 기능
    public static void execute(Calculator cal){
        System.out.println("실행결과");
        cal.run();
    }
    public static void main(String[] args) {
        Calculator c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);

        Calculator c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);

        execute(c1);
        execute(c2);
    }
}
// 다형성이란 하나의 클래스(Calculator)가 다양한 동작 방법(ClaculatorDecoPlus, ClaculatorDecoMinus)을
// 가지고 있는데 이것을 다형성이라 한다.