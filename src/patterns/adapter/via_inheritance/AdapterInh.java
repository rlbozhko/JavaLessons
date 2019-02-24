package patterns.adapter.via_inheritance;

import patterns.adapter.MicroUsb;
import patterns.adapter.MiniUsb;

public class AdapterInh extends MiniUsb implements MicroUsb {
    @Override
    public void readMiniUsb() {
        MicroUsb.super.readMicroUsb(5);
    }

    @Override
    public void writeMiniUsb() {
        MicroUsb.super.writeMicroUsb();
    }

    @Override
    public void readMicroUsb(int x) {
        readMiniUsb();
    }

    @Override
    public void writeMicroUsb() {
        writeMiniUsb ();
    }

    public static void main(String[] args) {
        AdapterInh adapterInh = new AdapterInh();
        adapterInh.readMicroUsb(2);
    }
}
