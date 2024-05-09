package Java_ex;

public class array {
    public static void main(String[] args) {
        /*String[] classGroup = { "A", "B", "Java_ex.C", "D" };
        System.out.println(classGroup[0]);
        System.out.println(classGroup[1]);
        System.out.println(classGroup[2]);
        System.out.println(classGroup[3]);*/
        //[]안에 숫자는 배열에 담겨있는 문자열의 순서:색인

        /*String[] classGroup = new String[4];
        classGroup[0] = "최진혁"; //classGroup 이라는 배열에 0번째 index 의 해당된 값은 최진혁이라는 의미
        System.out.println(classGroup.length); //length는 clssgroop에 몇개의 값을 수용할 수 있는냐라는 의미
        classGroup[1] = "최유빈";
        System.out.println(classGroup.length);
        classGroup[2] = "한이람";
        System.out.println(classGroup.length);
        classGroup[3] = "이고잉";
        System.out.println(classGroup.length);*/

        //배열, 반복문
        /*String[] members = { "최진혁", "최유빈", "한이람" };
        for (int i = 0; i < members.length; i++) {
        //int i = 0;는 초기화, i < members.length;는 반복조건, i++는 반복실행
            String member = members[i];//문자를 담는 변수
            System.out.println(member + "이 상담을 받았습니다");
        }*/

        //for-each 위 코드보다 더욱 간결하게 해줌
        String[] members = { "최진혁", "최유빈", "한이람" };
        for (String e : members) {
        //콜론 뒤에 따라오는 데이터의 값들을 동작할때마다 하나씩 꺼내서 e라는 변수에다가 담아준다.
            System.out.println(e + "이 상담을 받았습니다");
        }
    }
}

