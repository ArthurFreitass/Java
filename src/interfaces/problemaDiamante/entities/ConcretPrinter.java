package interfaces.problemaDiamante.entities;

public class ConcretPrinter extends Device {

    public ConcretPrinter(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Doc process printer");
    }

    public void print(String doc) {
        System.out.println("Print!");
    }
}
