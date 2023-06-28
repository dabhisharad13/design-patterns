package StructuralPatterns.AdapterPattern;

public class Main {
    public static void main(String[] args) {
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        Volt volt3 = socketAdapter.get3Volt();
        Volt volt120 = socketAdapter.get120Volt();
        System.out.println(volt3.getVolt());
        System.out.println(volt120.getVolt());
    }
}
