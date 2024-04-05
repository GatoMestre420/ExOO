package br.edu.up;

import br.edu.up.models.Carro;
import br.edu.up.models.Pessoa;

public class Programa {

    public static void main(String[] args){


        // Pessoa p = new Pessoa("João");
        Pessoa p = new Pessoa();
        p.setNome("João");

        System.out.println("Nome : " + p.getNome());


        Carro uno = new Carro(144);

        uno.setMarca("Fiat");
        uno.setModelo("Uno Mille");
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        //5km/h
        uno.freiar();
        uno.freiar();

        System.out.println("Marca " + uno.getMarca());
        System.out.println("Modelo: " + uno.getModelo());
        System.out.println("Velocidade : " + uno.getVelocidade());
        System.out.println("Velocidade Máxima: " + uno.getvelocidadeMaxima());

        Carro bmw = new Carro(244);
        bmw.setMarca("BMW");
        bmw.setModelo("I7");
        bmw.acelerar();
        bmw.acelerar();
        bmw.acelerar();
        bmw.acelerar();
        bmw.acelerar();
        bmw.acelerar();
        bmw.acelerar();
        bmw.acelerar();
        bmw.acelerar();
        bmw.acelerar();
        bmw.freiar();
        bmw.freiar();

        System.out.println("Marca " + bmw.getMarca());
        System.out.println("Modelo: " + bmw.getModelo());
        System.out.println("Velocidade : " + bmw.getVelocidade());
        System.out.println("Velocidade Máxima: " + bmw.getvelocidadeMaxima());

    }

}
