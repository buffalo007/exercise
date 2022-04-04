package interfaces;

public class Greeter {

    Greeting greeting;

    public Greeter(Greeting greeting) {
        this.greeting = greeting;
    }

    public void greet(){
        greeting.greet();

    }

    public static void main(String[] args) {

    Greeter greeter = new Greeter(new HelloGreeting());
        greeter.greet();

    }
}
