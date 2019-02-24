package patterns.adapter;

public class AdapterMicro2Mini implements MicroUsb {
    
    private MiniUsb miniUsb;

    public AdapterMicro2Mini(MiniUsb miniUsb) {
        this.miniUsb = miniUsb;
    }

    @Override
    public void readMicroUsb(int x) {
        System.out.println(x);

        //доп логика до
        miniUsb.readMiniUsb();
        //доп логика после

        //
    }

    @Override
    public void writeMicroUsb() {
        //доп логика до
       // int x = getX();
       // miniUsb.writeMiniUsb(x);
        miniUsb.writeMiniUsb();
        //доп логика после
    }
}
