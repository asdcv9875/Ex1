public class LoopDemo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) //i의 값이 5와 같을 때 반복을 멈춘다
                //break;
                continue; // 5가 되기 전까지 실행 됐다가 continue를 만나면 5 다음부터 이어서 실행한다.
            System.out.println("Coding Everybody " + i);
        }

    }
}
