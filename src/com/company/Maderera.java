package com.company;

import java.time.LocalDate;

public class Maderera {

    public static void main(String[] args) {
	// write your code here

        Placa placa = new Placa(1);
        Placa placa1 = new Placa(2);
        Placa placa2 = new Placa(3);
        Placa placa3 = new Placa(4);
        Placa placa4 = new Placa(5);

        Cliente cliente = new Cliente("Tatiana", "150 metros s....", LocalDate.of(2021,02,8));
        cliente.comprarModelo(placa3.getTipoDeModelo(),3);

        ClienteCorporativo clienteCorporativo = new ClienteCorporativo("Nick", "150 metros sur...", LocalDate.of(2021,02,9));
        clienteCorporativo.comprarCorte(2,clienteCorporativo.getNombre(),clienteCorporativo.getFechaDeRetiro());
    }
}
