package interfaces.segundaAula.segundaRefatoracao.entities;

import interfaces.segundaAula.segundaRefatoracao.exceptions.DomainException;

public class Vehicle {

    private String modelCar;

    public Vehicle(String modelCar) {
        if (modelCar.isEmpty()) {
            throw new DomainException("Error: The model car cannot be empty!");
        }
        this.modelCar = modelCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        if (modelCar.isEmpty()) {
            throw new DomainException("Error: The model car cannot be empty!");
        }
        this.modelCar = modelCar;
    }
}
