package StructuralPatterns.Proxy;

public class ProxyImage implements Image{

    private  RealImage realImage;
    private final String fileName;

    public  ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() throws InterruptedException {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
