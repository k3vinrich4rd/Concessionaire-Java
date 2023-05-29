package br.com.estudos.listas.poo.concessionaire.template;

public abstract class Address {

    private String publicPlace;
    private int number;
    private String neighborhood;
    private String city;
    private String state;
    private String cep;
    private String complement;

    public Address() {

    }

    public Address(String publicPlace, int number, String neighborhood, String city, String state, String cep, String complement) {
        this.publicPlace = publicPlace;
        this.number = number;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.cep = cep;
        this.complement = complement;
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public int getNumber() {
        return number;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCep() {
        return cep;
    }

    public String getComplement() {
        return complement;
    }

    @Override
    public String toString() {
        return
                "\nPublicPlace: " + publicPlace +
                        "\nNumber: " + number +
                        "\nNeighborhood: " + neighborhood +
                        "\nCity:" + city +
                        "\nState: " + state +
                        "\nCep='" + cep +
                        "\nComplement='" + complement +
                        "]";
    }
}