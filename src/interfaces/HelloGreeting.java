package interfaces;

public class HelloGreeting implements Greeting{

    @Override
    public void greet() {
        System.out.println("Hello");
    }

    public void otherFunction(){

    }
}
