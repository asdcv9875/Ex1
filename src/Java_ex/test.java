package Java_ex;

class Parent {
    int parentValue;

    Parent(){} 

    Parent(int value) {
        this.parentValue = value;
    }

    void display() {
        System.out.println("Java_ex.Parent value: " + parentValue);
    }
}

class Child extends Parent {
    int childValue;

    Child(int parentValue, int childValue) {
        // super(parentValue); 부모 클래스의 생성자 호출을 생략
        this.childValue = childValue;
    }

    void display() {
        // super.display(); 부모 클래스의 display 메서드 호출을 생략
        System.out.println("Java_ex.Child value: " + childValue);
    }
}

public class test {
    public static void main(String[] args) {
        Child child = new Child(10, 20);
        child.display();
    }
}