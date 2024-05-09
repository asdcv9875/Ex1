package Java_ex;

public class AndDemo { //논리연산자

    public static void main(String[] args) {
        if (true && true) { //&&는 양쪽 값이 모두 참일 떄 참이 됨
            System.out.println(1);
        }

        if (true && false) {
            System.out.println(2);
        }

        if (false && false) {
            System.out.println(3);
        }



        if (true || true) { // ||는 양쪽 값중 하나라도 true면 true가 됨
            System.out.println(1);
        }
        if (true || false) {
            System.out.println(2);
        }
        if (false || true) {
            System.out.println(3);
        }
        if (false || false) {
            System.out.println(4);
        }


        if (!true) { // !는 부정을 의미하는데 true에 붙으면 false가 되고 false에 붙으면 true가 됨
            System.out.println(1);
        }
        if (!false) {
            System.out.println(2);
        }

    }

}