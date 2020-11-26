package pavelkim.lesson12.lesson.exception;

public class Main {


    public static void main(String []args) {

    }

    public static void innerMethod() throws MyException {
        throw new MyException();
    }
}
