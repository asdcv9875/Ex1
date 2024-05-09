package Java_ex;

public class Object {
    /*public static void main(String[] args) {
        System.out.println(10 + 20);
        System.out.println(20 + 40);
    }*//*
    *//*public static void sum(int left, int right) {
        System.out.println(left + right);
    }

    public static void main(String[] args) {
        sum(10, 20);
        sum(20, 40);
    }*//*
    public static void avg(int left, int right) {
        System.out.println((left + right) / 2);
    }

    public static void sum(int left, int right) {
        System.out.println(left + right);
    }

    public static void main(String[] args) {
        int left, right;

        left = 10;
        right = 20;

        sum(left, right);
        avg(left, right);

        left = 20;
        right = 40;

        sum(left, right);
        avg(left, right);
    }*/
    class Calculator{
        int left, right;

        public void setOprands(int left, int right){
            this.left = left;
            this.right = right;
        }

        public void sum(){
            System.out.println(this.left+this.right);
        }

        public void avg(){
            System.out.println((this.left+this.right)/2);
        }
    }

    public class CalculatorDemo4 {

        public void main(String[] args) {

            Calculator c1 = new Calculator();
            c1.setOprands(10, 20);
            c1.sum();
            c1.avg();

            Calculator c2 = new Calculator();
            c2.setOprands(20, 40);
            c2.sum();
            c2.avg();
        }
    }
}
