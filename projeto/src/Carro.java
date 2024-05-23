import java.util.Objects;

public class Carro {

    private int ano;

    private String cor;

    private String marca;

    private String versao;


    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return ano == carro.ano && Objects.equals(cor, carro.cor) && Objects.equals(marca, carro.marca) && Objects.equals(versao, carro.versao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ano, cor, marca, versao);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "ano=" + ano +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", versao='" + versao + '\'' +
                '}';
    }

    // Exemplo de comentario
    /*
    Outro exemplo de comentario
     */

    public void frearCarro(){
        System.out.println("Freando carro");
    }

    public void acelerarCarro(){
        System.out.println("Acelerando carro");
    }

}
