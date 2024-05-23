import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] nomes = {"Tiago", "Mateus", "Paulo"};

        Arrays.sort(nomes);

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}