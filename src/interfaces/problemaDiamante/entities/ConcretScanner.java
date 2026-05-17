package interfaces.problemaDiamante.entities;

public class ConcretScanner extends Device implements Scan {

    public ConcretScanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {

    }

    @Override
    public String scan(String msg) {
        return "";
    }
}
