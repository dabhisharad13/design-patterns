package BehavioralPatterns.StrategyPattern;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
public class Context {

    private final Strategy strategy;

    int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
