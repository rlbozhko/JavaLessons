package patterns.adapter;

import com.ConnectionServer;

public class Main {

    private String name;

    public static void main(String[] args) {
        System.out.println("Hello World!");

        new ConnectionServer();

        String name = new Main().name;
    }
}