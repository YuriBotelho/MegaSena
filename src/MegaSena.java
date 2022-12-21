//Biblioteca responsável por gerar números aleatórios
import java.util.Random;

public class MegaSena {
    public static void main(String[] args) {
        //Objeto responsável por gerar números aleatórios
        Random generated = new Random();

        //Devolve um inteiro no intervalo determinado
        for(int i=0; i<6; i++){
            int number = generated.nextInt(60);
            System.out.println(number);
        }
    }
}