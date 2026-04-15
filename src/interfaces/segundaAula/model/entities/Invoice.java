package interfaces.segundaAula.primeiraRefatoracao.model.entities;

import interfaces.segundaAula.primeiraRefatoracao.model.exceptions.DomainException;

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
