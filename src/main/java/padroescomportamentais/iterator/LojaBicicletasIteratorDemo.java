package padroescomportamentais.iterator;

public class LojaBicicletasIteratorDemo {

    public static void main(String[] args) {
        EstoqueBicicletas estoque = new EstoqueBicicletas();

        estoque.adicionarBicicleta(new Bicicleta("Mountain Bike Aro 29", "Trilha", 2500.00, true));
        estoque.adicionarBicicleta(new Bicicleta("Speed Bike Carbon", "Estrada", 4200.00, false));
        estoque.adicionarBicicleta(new Bicicleta("Bicicleta Urbana", "Cidade", 1800.00, true));

        LojaBicicletas loja = new LojaBicicletas();

        System.out.println("Todas as bicicletas:");
        System.out.println(loja.listarTodasBicicletas(estoque));

        System.out.println("\nBicicletas disponíveis:");
        System.out.println(loja.listarBicicletasDisponiveis(estoque));

        System.out.println("\nQuantidade disponível: " + loja.contarBicicletasDisponiveis(estoque));
    }
}
