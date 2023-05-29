package br.com.estudos.listas.poo.concessionaire.template;

public abstract class Car {
    private String name;
    private String color;
    private String plateNumber;
    private String model;
    private String brand;
    private int amountOfPorts;
    private int amountOfWindows;

    public Car() {

    }

    public Car(String name, String color, String plateNumber, String model, String brand, int amountOfPorts, int amountOfWindows) {
        this.name = name;
        this.color = color;
        this.plateNumber = plateNumber;
        this.model = model;
        this.brand = brand;
        this.amountOfPorts = amountOfPorts;
        this.amountOfWindows = amountOfWindows;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getAmountOfPorts() {
        return amountOfPorts;
    }

    public int getAmountOfWindows() {
        return amountOfWindows;
    }

    @Override
    public String toString() {
        return
                "\nName: " + name +
                        "\nColor: " + color +
                        "\nPlateNumber: " + plateNumber +
                        "\nModel: " + model +
                        "\nBrand: " + brand +
                        "\nAmountOfPorts: " + amountOfPorts +
                        "\nAmountOfWindows: " + amountOfWindows+"\n";
    }
}