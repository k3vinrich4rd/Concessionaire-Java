package br.com.estudos.listas.poo.concessionaire.template;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Concessionaire {

    private AddressCommercial addressCommercial;
    private final List<Car> cars = new ArrayList<>();
    private final List<Client> clients = new ArrayList<>();

    public Concessionaire() {

    }

    public Concessionaire(AddressCommercial addressCommercial) {
        this.addressCommercial = addressCommercial;
    }

    public void addClient(Client client) {
        this.clients.add(client);

    }

    public List<Client> getClients() {
        return Collections.unmodifiableList(this.clients);
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(this.cars);
    }

    public AddressCommercial getAddressCommercial() {
        return addressCommercial;
    }
}