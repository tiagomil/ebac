import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numeroInteiro = Integer.parseInt(scanner.nextLine());
        System.out.println("Numero inteiro digitado: " + numeroInteiro);
        scanner.close();

    }
}