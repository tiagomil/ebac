import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        int nota1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite a nota 2: ");
        int nota2 = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite a nota 3: ");
        int nota3 = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite a nota 4: ");
        int nota4 = Integer.parseInt(scanner.nextLine());

        int notaSoma = nota1+nota2+nota3+nota4;
        int notaFinal = notaSoma/4;

        if(notaFinal >= 7){
            System.out.println("aprovado");
        } else if (notaFinal >= 5){
            System.out.println("recupercao");
        } else {
            System.out.println("reprovado");
        }









        scanner.close();

    }
}