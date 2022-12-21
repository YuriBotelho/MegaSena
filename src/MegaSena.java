//Biblioteca responsável por gerar números aleatórios
import java.util.Random;
import java.util.Scanner;

public class MegaSena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String name = scanner.nextLine();
        System.out.println("Olá, " +name+"! Aqui estão os números da Mega Sena:");

        //Objeto responsável por gerar números aleatórios
        Random generated = new Random();

        //Devolve um inteiro no intervalo determinado
        for(int i=0; i<6; i++){
            int number = generated.nextInt(60);
            System.out.println(number);
        }
    }
}