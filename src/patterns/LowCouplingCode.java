package patterns;

public class LowCouplingCode {
    private One one;//has-a
    private Two two;//has-a

    public LowCouplingCode(One one, Two two) {
        this.one = one;
        this.two = two;
    }

    public void executeOne() {
        one.action();
    }

    public void executeTwo() {
        one.action();
    }
}

/*
* A() {
* B()
* C() - sms doesn't attach to transaction
* }
*
* */

/* вторая переделанная улучшенная версия   с использованием интерфейса*/
class NewLowCouplingCode {
    private Actionable actionable;

    public NewLowCouplingCode(Actionable actionable) {
        this.actionable = actionable;
    }

    public void execute() {
        actionable.action();
    }

}

interface Actionable {
    void action();
}

class One implements Actionable {
    public void action() {
        System.out.println("One");
    }
}

class Two implements Actionable {
    public void action() {
        System.out.println("Two");
    }
}

class TestCoupling {
    public static void main(String[] args) {
        One one = new One();

//        LowCouplingCode lowCouplingCode = new LowCouplingCode();
    }
}
