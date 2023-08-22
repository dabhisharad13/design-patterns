package CreationalPatterns.BuilderPattern;

public class Main {
    public static void main(String args[]) {
        Computer computer = new Computer
                .ComputerBuilder()
                .build();
        System.out.println(computer.getSpecs());
    }


}

