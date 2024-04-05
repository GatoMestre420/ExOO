package br.edu.up.models;

public class Carro extends Veiculo{

    //atributos
    private int velocidadeMaxima;
    private String marca;
    private int velocidade = 0;
    private String modelo;
    

    public Carro(int velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    //Getter (pegar)
    public int getvelocidadeMaxima(){
        return this.velocidadeMaxima;
    }
    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getVelocidade(){
        return velocidade;
    }

    //Setter (atribuir)
    public void setvelocidadeMaxima(int velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    

    public void acelerar(){
        if( this.velocidade < this.velocidadeMaxima){
            this.velocidade++;
        }
    }

    public void freiar(){
        if(this.velocidade > 0){
            this.velocidade--;
        }
    }

}
