package br.edu.up.models;
public class Pessoa {

    private String nome;
    private int altura;
    private int peso;

    

    public Pessoa() {
    }

    
    public Pessoa(String nome) {
        this.nome = nome;
    }

    
    public Pessoa(String nome, int altura) {
        this.nome = nome;
        this.altura = altura;
    }


    public Pessoa(String nome, int altura, int peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }


    //Getters -------------------------------------------------
    public String getNome() {
        return nome;
    }


    public int getAltura() {
        return altura;
    }


    public int getPeso() {
        return peso;
    }

    //Setters -----------------------------------------------
    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setAltura(int altura) {
        if(altura > 15 && altura < 250){
            this.altura = altura;
        
        }
    }


    public void setPeso(int peso) {
        this.peso = peso;
    }

    
    

 

    
}
