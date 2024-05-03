public class Super {
    class Calculator {
        int left, right;

        public Calculator(int left, int right) {
            this.left = left;
            this.right = right;
        }

        public void setOprands(int left, int right) {
            this.left = left;
            this.right = right;
        }

        public void sum() {
            System.out.println(this.left + this.right);
        }

        public void avg() {
            System.out.println((this.left + this.right) / 2);
        }
    }

    class SubstractionableCalculator extends Calculator {
        public SubstractionableCalculator(int left, int right) {
            super(left, right); //super는 부모클래스를 의미
        }

        public void substract() {
            System.out.println(this.left - this.right);
        }
    }

    public class CalculatorConstructorDemo4 {
        public void main(String[] args) {
            SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
            c1.sum();
            c1.avg();
            c1.substract();
        }
    }
}
