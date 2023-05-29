package br.com.estudos.listas.poo.concessionaire.template;

public class AddressHome extends Address {
    public AddressHome() {
        super();
    }

    public AddressHome(String publicPlace, int number, String neighborhood, String city, String state, String cep, String complement) {
        super(publicPlace, number, neighborhood, city, state, cep, complement);
    }

    @Override
    public String toString() {
        return "\nType Address: Residential" + super.toString();
    }
}