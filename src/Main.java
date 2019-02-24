import com.ConnectionServer;

import java.util.function.Function;

interface Anonim {
    public void dosmthing(String name2);
}

public class Main {


    private String name;
    static String nameStatic;

    public static void main(String[] args) {
        System.out.println("Hello World!");

        new ConnectionServer();

        String name = "Test";
        nameStatic = "Boom";

        Anonim anonim = new Anonim() {

            @Override
            public void dosmthing(String name2) {
                System.out.println(name2);
            }
        };
       // anonim.dosmthing();

        Function<String, Integer> function = (str) -> {
            String name2 = name;
            System.out.println(name2);
            return Integer.parseInt(str);
        };

        System.out.println(function.apply("45"));


    }
}