package Java_ex2;

class inter {
    public void setOprands(int first, int second, int third){}
    public int sum(){
        return 60;
    }
    public int avg(){
        return 20;
    }
}
public class InterFace {
    public static void main(String[] args){
        inter c = new inter();
        c.setOprands(10,20,30);
        System.out.println(c.sum()+c.avg());
    }
}
