package padroescomportamentais.iterator;

public class LojaBicicletas {

    public String listarTodasBicicletas(EstoqueBicicletas estoque) {
        IteratorBicicleta iterator = estoque.criarIterator();
        StringBuilder resultado = new StringBuilder();

        while (iterator.hasNext()) {
            resultado.append(iterator.next().getDescricao());

            if (iterator.hasNext()) {
                resultado.append("\n");
            }
        }

        return resultado.toString();
    }

    public String listarBicicletasDisponiveis(EstoqueBicicletas estoque) {
        IteratorBicicleta iterator = estoque.criarIteratorDisponiveis();
        StringBuilder resultado = new StringBuilder();

        while (iterator.hasNext()) {
            resultado.append(iterator.next().getDescricao());

            if (iterator.hasNext()) {
                resultado.append("\n");
            }
        }

        return resultado.toString();
    }

    public int contarBicicletasDisponiveis(EstoqueBicicletas estoque) {
        IteratorBicicleta iterator = estoque.criarIteratorDisponiveis();
        int quantidade = 0;

        while (iterator.hasNext()) {
            iterator.next();
            quantidade++;
        }

        return quantidade;
    }
}
