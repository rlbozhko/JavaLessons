package patterns.decorator;

import java.util.Objects;

public class Decorator {
    public static void main(String[] args) {//"[Hello]" -> "Hello", [Hello]
/*        QuotesDecorator decorator =
                new QuotesDecorator(new LeftBracketPrinter(new RightBracketPrinter(new RealPrinter("Hello"))));


        LeftBracketPrinter printer =
                new LeftBracketPrinter(new RightBracketPrinter(new RealPrinter("Hello")));*/

        Printable  hello = new LeftBracketPrinter (new RealPrinter(new RightBracketPrinter(null), "Hello") );

        hello.print();
    }
}

interface Printable {
    void print();

}

class RealPrinter implements Printable {
    private String text;
    private Printable printable;

    public RealPrinter(Printable printable, String text) {

        this.printable = printable;
        this.text = text;
    }

    @Override
    public void print() {
        System.out.print(text);
        if(Objects.nonNull(printable)){
            printable.print();
        }
    }
}

class LeftBracketPrinter implements Printable {

    private Printable printable;

    public LeftBracketPrinter(Printable printable) {
        this.printable = printable;
    }

    @Override
    public void print() {
        System.out.print("[");
        if(Objects.nonNull(printable)){
            printable.print();
        }
    }
}

class RightBracketPrinter implements Printable {

    private Printable printable;

    public RightBracketPrinter(Printable printable) {
        this.printable = printable;
    }

    @Override
    public void print() {
        if(Objects.nonNull(printable)){
            printable.print();
        }
        System.out.print("]");
    }
}

class QuotesDecorator implements Printable {
    private Printable printable;

    public QuotesDecorator(Printable printable) {
        this.printable = printable;
    }

    @Override
    public void print() {
        System.out.print("\"");
        if(Objects.nonNull(printable)){
            printable.print();
        }
        System.out.print("\"");
    }
}
