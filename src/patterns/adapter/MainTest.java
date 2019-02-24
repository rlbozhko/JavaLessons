package patterns.adapter;

public class MainTest {

    MiniUsb miniUsb = new MiniUsb();
    MicroUsb microUsb = new AdapterMicro2Mini(miniUsb);
    AdapterMicro2Mini adapterMicro2Mini = new AdapterMicro2Mini(miniUsb);

    public static void main(String[] args) {
        MainTest mainTest = new MainTest();
    }


}
