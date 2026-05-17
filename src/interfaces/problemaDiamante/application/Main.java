package interfaces.problemaDiamante.application;

import interfaces.problemaDiamante.entities.ComboDevice;

public class Main {
    public static void main(String[] args) {

        ComboDevice comboDevice = new ComboDevice("3223");
        comboDevice.print();
    }
}
