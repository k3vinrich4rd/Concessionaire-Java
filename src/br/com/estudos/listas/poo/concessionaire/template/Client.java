package br.com.estudos.listas.poo.concessionaire.template;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client extends People{

    private final List<Car> cars = new ArrayList<>();

    public Client() {
        super();
    }

    public Client(String name, int age, AddressHome addressHome, String cpf) {
        super(name, age, addressHome, cpf);
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(this.cars);
    }
}