package Java_ex;

public class LoopDepthDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // 두자리 숫자가 출력이 되는데 여기는 십의 자리
            // 0부터1까지 반복
            for (int j = 0; j < 10; j++) { // 여기는 일의 자리
                // 0부터 1까지 반복
                System.out.println(i + "" + j);
            } //j가 i보다 먼저 실행되면서 i와 j가 각자 10이 되기 전까지 반복하여 중첩되며 99까지 출력하게 됨.
        }

    }
}
