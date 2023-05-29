package br.com.estudos.listas.poo.concessionaire.template;

public class AddressCommercial extends Address {
    public AddressCommercial() {
        super();
    }

    public AddressCommercial(String publicPlace, int number, String neighborhood, String city, String state, String cep, String complement) {
        super(publicPlace, number, neighborhood, city, state, cep, complement);
    }

    @Override
    public String toString() {
        return "\nType Address: Commercial" + super.toString();
    }
}