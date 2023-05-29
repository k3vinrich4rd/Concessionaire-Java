package br.com.estudos.listas.poo.concessionaire.template;

public class Suv extends Car {

    public Suv() {
        super();
    }

    public Suv(String name, String color, String plateNumber, String model, String brand, int amountOfPorts, int amountOfWindows) {
        super(name, color, plateNumber, model, brand, amountOfPorts, amountOfWindows);
    }

    @Override
    public String toString() {
        return "\nType car: SUV" + super.toString();
    }
}