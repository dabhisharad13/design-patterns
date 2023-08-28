package StructuralPatterns.Proxy;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Image image = new ProxyImage("Test.jpg");

        image.display();
    }
}
