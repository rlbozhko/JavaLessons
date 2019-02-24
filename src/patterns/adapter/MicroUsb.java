package patterns.adapter;

public interface MicroUsb {
    default void readMicroUsb(int x) {
        System.out.println("Read micro usb by default realisation");
    }

    default void writeMicroUsb(){
        System.out.println("Write micro usb by default realisation");
    }
}
