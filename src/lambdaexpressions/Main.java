package lambdaexpressions;

public class Main {

    public static void main(String[] args) {

        MyEventConsumer consumer = new MyEventConsumer() {
            private int eventConsumer = 0;
            @Override
            public void consume(Object event) {

                System.out.println(event.toString() + "consumed" + eventConsumer);
            }
        } ;
    }
}
