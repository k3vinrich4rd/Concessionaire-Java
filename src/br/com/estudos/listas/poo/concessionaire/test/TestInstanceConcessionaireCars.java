package br.com.estudos.listas.poo.concessionaire.test;

import br.com.estudos.listas.poo.concessionaire.template.AddressCommercial;
import br.com.estudos.listas.poo.concessionaire.template.Concessionaire;
import br.com.estudos.listas.poo.concessionaire.template.Suv;

public class TestInstanceConcessionaireCars {
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

        AddressCommercial addressCommercial = new AddressCommercial(
                "Rua Icaro Silva", 121,
                "Jd Ipiranga", "Osasco",
                "São Paulo", "00000-000",
                "Concessionaria");


        Concessionaire concessionaire = new Concessionaire(addressCommercial);

        concessionaire.addCar(suv1);
        concessionaire.addCar(suv2);
        concessionaire.addCar(suv3);
        concessionaire.addCar(suv4);
        concessionaire.addCar(suv5);

        System.out.println(concessionaire.getCars());

    }
}