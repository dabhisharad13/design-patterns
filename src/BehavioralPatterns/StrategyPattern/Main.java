package BehavioralPatterns.StrategyPattern;

public class Main {

    public static void main(String[] args) {
        Context addContext = new Context(new AdditionOperation());
        Context subContext = new Context(new SubtractionOperation());
        int addition = addContext.executeStrategy(5, 6);
        int subtraction = subContext.executeStrategy(3, 2);

        System.out.println(addition);
        System.out.println(subtraction);
    }
}
