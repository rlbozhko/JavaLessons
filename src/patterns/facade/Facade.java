package patterns.facade;

//Structural pattern
public class Facade {

}

class Computer {
    private Cpu cpu;
    private Os os;

    public Computer(Cpu cpu, Os os) {
        this.cpu = cpu;
        this.os = os;
    }
// фасадный метод
    public void start() {
        cpu.start();
        os.load();
    }
}

class Cpu {
    public void start() {
        System.out.println("Start CPU");
    }
}

class Os {
    public void load() {
        System.out.println("Load OS");
    }
}