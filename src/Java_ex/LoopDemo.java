package Java_ex;

public class LoopDemo { //반복문
    public static void main(String[] args) {
        while (true) { //()안에는 조건 언제까지 반복할 것인가
            // 반복 실행 영역
            //System.out.println("계속 나와ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ");
            int i = 0;
            // i의 값이 10보다 작다면 true, 크다면 false가 된다. 현재 i의 값은 0이기 때문에 이 반복문은 실행된다.
            while(i<10){
                System.out.println("Coding Everybody" + i);
                // i의 값에 1을 더한다. 반복문의 중괄호의 마지막 라인에 도달하면 반복문은 반복문을 재호출한다. 이때 i<10의 값을 검사하게 된다.
                i++; //i에 +1을 한다.
            }

        }

    }
}

/*public class Java_ex.LoopDepthDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // 두자리 숫자가 출력이 되는데 여기는 십의 자리
            // 0부터1까지 반복
            for (int j = 0; j < 10; j++) { // 여기는 일의 자리
                // 0부터 1까지 반복
                System.out.println(i + "" + j);
            } //j가 i보다 먼저 실행되면서 i와 j가 각자 10이 되기 전까지 반복하여 중첩되며 99까지 출력하게 됨.
        }

    }
}*/




