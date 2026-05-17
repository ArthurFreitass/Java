package interfaces.problemaDiamante.entities;

public class ComboDevice extends Device implements Scan, Printer {


    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public String scan(String msg) {
        return msg;
    }

    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
    public void processDoc(String doc) {
        System.out.println();
    }
}
