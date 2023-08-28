package StructuralPatterns.Proxy;
import java.util.concurrent.TimeUnit;

public class RealImage implements Image{

    private final String fileName;

    public RealImage(String fileName) throws InterruptedException {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) throws InterruptedException {
        System.out.println("Loading image "+ fileName);
        TimeUnit.SECONDS.sleep(2);
        System.out.println(fileName + " Loaded Successfully");

    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
