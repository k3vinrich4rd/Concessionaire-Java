package br.com.estudos.listas.poo.concessionaire.test;

import br.com.estudos.listas.poo.concessionaire.template.AddressCommercial;
import br.com.estudos.listas.poo.concessionaire.template.AddressHome;
import br.com.estudos.listas.poo.concessionaire.template.Client;
import br.com.estudos.listas.poo.concessionaire.template.Concessionaire;

public class TestInstanceConcessionaireClients {
    public static void main(String[] args) {

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


        AddressCommercial addressCommercial = new AddressCommercial(
                "Rua Icaro Silva", 121,
                "Jd Ipiranga", "Osasco",
                "São Paulo", "00000-000",
                "Concessionaria");


        Concessionaire concessionaire = new Concessionaire(addressCommercial);

        concessionaire.addClient(client1);
        concessionaire.addClient(client2);
        concessionaire.addClient(client3);
        concessionaire.addClient(client4);

        System.out.println(concessionaire.getClients());
        System.out.println(concessionaire.getCars());

    }
}