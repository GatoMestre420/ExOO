

public class Carro extends Veiculo{

    private String marca;
    private int velocidade = 10;

    public void acelerar(){
        if(velocidade < 200){
            velocidade++;
        }
    }

    public void freiar(){

        velocidade--;
    }

}
