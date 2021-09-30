package in.amazon.testscripts;

public class Test {
    String a = "Hello";

    public void day(){
        System.out.println("Today is Wednesday");
    }

    public void month(){
        System.out.println("It is September");
    }

    public void year(){
        System.out.println("It is 2021");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.day();
        test.month();
    }
}
