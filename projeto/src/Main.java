import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List <Pessoa> feminino = new ArrayList<>();
        List <Pessoa> masculino = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a pessoa 1: ");
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome(scanner.nextLine());
        System.out.print("Digite o sexo da pessoa 1: ");
        pessoa1.setSexo(scanner.nextLine());
        if(pessoa1.getSexo().equals("M"))
            masculino.add(pessoa1);
        else if (pessoa1.getSexo().equals("F"))
            feminino.add(pessoa1);

        System.out.print("Digite a pessoa 2: ");
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome(scanner.nextLine());
        System.out.print("Digite o sexo da pessoa 2: ");
        pessoa2.setSexo(scanner.nextLine());
        if(pessoa2.getSexo().equals("M"))
            masculino.add(pessoa2);
        else if (pessoa2.getSexo().equals("F"))
            feminino.add(pessoa2);

        System.out.print("Digite a pessoa 3: ");
        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome(scanner.nextLine());
        System.out.print("Digite o sexo da pessoa 3: ");
        pessoa3.setSexo(scanner.nextLine());
        if(pessoa3.getSexo().equals("M"))
            masculino.add(pessoa3);
        else if (pessoa3.getSexo().equals("F"))
            feminino.add(pessoa3);

        System.out.print("Digite a pessoa 4: ");
        Pessoa pessoa4 = new Pessoa();
        pessoa4.setNome(scanner.nextLine());
        System.out.print("Digite o sexo da pessoa 4: ");
        pessoa4.setSexo(scanner.nextLine());
        if(pessoa4.getSexo().equals("M"))
            masculino.add(pessoa4);
        else if (pessoa4.getSexo().equals("F"))
            feminino.add(pessoa4);

        System.out.print(feminino);
        System.out.print(masculino);
    }
}