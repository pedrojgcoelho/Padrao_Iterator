package padroescomportamentais.iterator;

public class Bicicleta {

    private String modelo;
    private String tipo;
    private double preco;
    private boolean disponivel;

    public Bicicleta(String modelo, String tipo, double preco, boolean disponivel) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.preco = preco;
        this.disponivel = disponivel;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public String getDescricao() {
        return modelo + " - " + tipo + " - R$ " + preco;
    }
}
