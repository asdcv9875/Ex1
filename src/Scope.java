public class Scope {

    /*static void a() {
        int i = 0;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }*/

    /*static int i; //전역 변수

    static void a() {
        i = 0; //int를 붙여야 정상적으로 작동
    }

    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }*/

   /* static void a(){
        String title = "coding everybody";
    }
    public static void main(String[] args) {
        a();
        //System.out.println(title);
        //main이란 메소드 안에서 title을 찾아볼 수 없기 때문에 오류가 생김
    }*/
   /*public static void main(String[] args) {
       for (int i = 0; i < 5; i++) {
           System.out.println(i);
       }
        System.out.println(i);
       //중괄호 안에서만 i를 사용하기 때문에 바깥에서 호출해봤자 의미없음
   }*/

   //정적인 유효범위 (static scope)
   /*static int i = 5;//전역변수

    static void a() {
        int i = 10; //지역변수
        b();
    }

    static void b() {
        //int i = 10;
        System.out.println(i);
        //전역변수를 사용했다는 것을 알 수 있음
    }

    public static void main(String[] args) {
        a(); //지역변수
    }*/
}

class C {
    int v = 10;

    void m() {
        int v = 20;
        System.out.println(v);
        //System.out.println(this.v);
    }
    public static void main(String[] args) {
        C c1 = new C();
        c1.m();
    }
}


