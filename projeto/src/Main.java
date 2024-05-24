import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a pessoa 1: ");
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome(scanner.nextLine());
        System.out.print("Digite o sexo da pessoa 1: ");
        pessoa1.setSexo(scanner.nextLine());

        System.out.print("Digite a pessoa 2: ");
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome(scanner.nextLine());
        System.out.print("Digite o sexo da pessoa 2: ");
        pessoa2.setSexo(scanner.nextLine());

        System.out.print("Digite a pessoa 3: ");
        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome(scanner.nextLine());
        System.out.print("Digite o sexo da pessoa 3: ");
        pessoa3.setSexo(scanner.nextLine());

        System.out.print("Digite a pessoa 4: ");
        Pessoa pessoa4 = new Pessoa();
        pessoa4.setNome(scanner.nextLine());
        System.out.print("Digite o sexo da pessoa 4: ");
        pessoa4.setSexo(scanner.nextLine());

        System.out.print(pessoa1);
        System.out.print(pessoa2);
        System.out.print(pessoa3);
        System.out.print(pessoa4);
    }
}