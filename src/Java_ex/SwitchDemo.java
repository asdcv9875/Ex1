package Java_ex;

public class SwitchDemo {

    public static void main(String[] args) {

        System.out.println("switch(1)");
        switch(1){
            case 1:
                System.out.println("one");
                break; // switch문을 여기까지만 하겠다고 선언
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("default");
                break;
        }

        System.out.println("switch(2)");
        switch(2){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default: // switch문의 값이 일치하는 값이 없다면 출력
                System.out.println("default");
                break;
        }

        System.out.println("switch(3)");
        switch(3){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("default");
                break;
        }

        System.out.println("switch(4)");
        switch(4){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("default");
                break;
        }

    }

}