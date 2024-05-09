package org.opentutorials.javatutorials.exception;
/*try {
    예외의 발생이 예상되는 로직
} catch (예외 클래스 인스턴스) {
    예외가 발생했을 때 실행되는 로직
}*/
class DivideException extends Exception {
    DivideException(){
        super();
    }
    DivideException(String message){
        super(message);
    }
}

class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide() throws DivideException {

        if(this.right == 0){
            throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
        }
        System.out.print(this.left/this.right);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        try {
            c1.divide();
        } catch (DivideException e) {
            e.printStackTrace();
        }
    }
}


