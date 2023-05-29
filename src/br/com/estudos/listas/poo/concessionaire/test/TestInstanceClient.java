package br.com.estudos.listas.poo.concessionaire.test;

import br.com.estudos.listas.poo.concessionaire.template.AddressHome;
import br.com.estudos.listas.poo.concessionaire.template.Client;
import br.com.estudos.listas.poo.concessionaire.template.Suv;

public class TestInstanceClient {
    public static void main(String[] args) {

        Suv suv1 = new Suv(
                "Chevrolet Tracker",
                "Blue",
                "KKM-2173",
                "SUV",
                "Chevrolet",
                4,
                4);

        Suv suv2 = new Suv(
                "Mercedes-Benz GLB",
                "Red",
                "KLG-4497",
                "SUV",
                "Mercedes",
                4,
                4);

        Suv suv3 = new Suv(
                "Fiat Fastback",
                "Black",
                "KKI-0827",
                "SUV",
                "Fiat",
                4,
                4);

        Suv suv4 = new Suv(
                "X6",
                "Orange",
                "KKU-1427",
                "SUV",
                "BMW",
                4,
                4);

        Suv suv5 = new Suv(
                "Nissan Kicks",
                "Green",
                "KKU-1427",
                "SUV",
                "Nissan",
                4,
                2);


        AddressHome addressHome1 = new AddressHome("Rua Milton Nascimento",
                121, "Jd silva", "Osasco", "São Paulo",
                "00000-000", "Casa");


        AddressHome addressHome2 = new AddressHome("  Rua Djavan", 121,
                "Jd Arte", "Osasco", "São Paulo",
                "00000-000", "Casa");


        AddressHome addressHome3 = new AddressHome("Rua Mano Brown", 121,
                "Capão Redondo", "Osasco", "São Paulo",
                "00000-000", "Casa");


        AddressHome addressHome4 = new AddressHome("Rua Djonga", 121,
                "Jd Leal", "Osasco", "São Paulo",
                "00000-000", "Casa");

        Client client1 = new Client(
                "Kevin Richard",
                20,
                addressHome1,
                "111.111.111-11");


        Client client2 = new Client(
                "Silvio Almeida",
                23,
                addressHome2,
                "222.222.222-22");

        Client client3 = new Client(
                "Malcom x",
                42,
                addressHome3,
                "333.333.333-33");

        Client client4 = new Client("Muhammed Ali",
                44, addressHome4,
                "000.000.000-00");

        client1.addCar(suv1);
        client1.addCar(suv2);
        System.out.println(client1.getCars());


    }
}