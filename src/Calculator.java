public class Calculator {
   /* //class 는  calculator라는 객체의 설계도를 컴퓨터에게 알려준다는 의미
    int left, right;

    public void setOprands(int left, int right) {
        //this. 는 Calculator 클래스로부터 생성된 c1의 인스턴스를 가리킴 !이해 어려움
        this.left = left;
        this.right = right;
    }

    public void sum(){
        System.out.println(this.left+this.right);
    }

    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        c1.setOprands(10, 20); //setOprands의 값의 각각 숫자를 담는다.
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator();
        c2.setOprands(20, 40);
        c2.sum();
        c2.avg();

    }*/

    /* static double PI = 3.14; //PI는 더블형, 스태틱 뒤에오는 변수는 클래스의 소속이 된다. 즉 모든 인스턴스가 동일하다
      int left, right;

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
      public static void main(String[] args) {

          Calculator c1 = new Calculator();
          System.out.println(c1.PI);

          Calculator c2 = new Calculator();
          System.out.println(c2.PI);

          System.out.println(Calculator.PI);

      }*/
  /*static double PI = 3.14;
    // 클래스 변수인 base가 추가되었다.
    static int base = 0;
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        // 더하기에 base의 값을 포함시킨다.
        System.out.println(this.left + this.right + base);
    }

    public void avg() {
        // 평균치에 base의 값을 포함시킨다.
        System.out.println((this.left + this.right + base) / 2);
    }
    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        // 30 출력
        c1.sum();

        Calculator c2 = new Calculator();
        c2.setOprands(20, 40);
        // 60 출력
        c2.sum();

        // 클래스 변수 base의 기본값을 10으로 지정했다.
        Calculator.base = 10;

        // 40 출력
        c1.sum();

        // 70 출력
        c2.sum();
    }*/
  /*public static void sum(int left, int right){
      System.out.println(left+right);
  }

    public static void avg(int left, int right){
        System.out.println((left+right)/2);
    }
    public static void main(String[] args) {
        Calculator.sum(10, 20);
        Calculator.avg(10, 20);

        Calculator.sum(20, 40);
        Calculator.avg(20, 40);
    }*/
    class C1 {
        static int static_variable = 1; //스태틱 변수
        int instance_variable = 2; //인스턴스 변수

        static void static_static() {
            System.out.println(static_variable);
        }

        static void static_instance() {
            // 클래스 메소드에서는 인스턴스 변수에 접근 할 수 없다.
            // System.out.println(instance_variable); <- 에러발생
        }

        void instance_static() {
            // 인스턴스 메소드에서는 클래스 변수에 접근 할 수 있다.
            System.out.println(static_variable);
        }

        void instance_instance() {
            System.out.println(instance_variable);
        }
    }

    public class ClassMemberDemo {
        public void main(String[] args) {
            C1 c = new C1();
            // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
            // 인스턴스 메소드가 정적 변수에 접근 -> 성공
            c.static_static();
            // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
            // 정적 메소드가 인스턴스 변수에 접근 -> 실패
            c.static_instance();
            // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
            // 인스턴스 메소드가 클래스 변수에 접근 -> 성공
            c.instance_static();
            // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
            // 인스턴스 메소드가 인스턴스 변수에 접근 -> 성공
            c.instance_instance();
            // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
            // 클래스 메소드가 클래스 변수에 접근 -> 성공
            C1.static_static();
            // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
            // 클래스 메소드가 인스턴스 변수에 접근 -> 실패
            C1.static_instance();
            // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
            //C1.instance_static();
            // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
            //C1.instance_instance();
        }
    }
}





