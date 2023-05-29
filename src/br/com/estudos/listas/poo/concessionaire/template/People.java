package br.com.estudos.listas.poo.concessionaire.template;

public abstract class People {
    private String name;
    private int age;
    private AddressHome addressHome;
    private String cpf;

    public People() {

    }

    public People(String name, int age, AddressHome addressHome, String cpf) {
        this.name = name;
        this.age = age;
        this.addressHome = addressHome;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public AddressHome getAddressHome() {
        return addressHome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "\nClient" +
                "\nName: " + name +
                "\nAge: " + age +
                "\nAddressHome: " + addressHome +
                "\nCpf: " + cpf +
                "]\n";
    }
}