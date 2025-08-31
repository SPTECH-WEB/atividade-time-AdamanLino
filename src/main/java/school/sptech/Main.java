package school.sptech;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Time time = new Time();

        Scanner input = new Scanner(System.in);

        System.out.println("Dados do Time 1: ");
        System.out.println("Nome: ");
        String nome = input.nextLine();

        System.out.println("Vitórias: ");
        Integer vitorias = time.vitorias;

        System.out.printf("Time: %s Vitórias: %d", nome, vitorias);
    }
}