package StructuralPatterns.AdapterPattern;

public class Socket {
    Volt getVolt() {
        return new Volt(120);
    }
}
