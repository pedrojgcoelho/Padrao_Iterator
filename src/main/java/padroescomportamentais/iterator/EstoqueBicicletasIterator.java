package padroescomportamentais.iterator;

import java.util.List;

public class EstoqueBicicletasIterator implements IteratorBicicleta {

    private List<Bicicleta> bicicletas;
    private int posicao;

    public EstoqueBicicletasIterator(List<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
        this.posicao = 0;
    }

    @Override
    public boolean hasNext() {
        return posicao < bicicletas.size();
    }

    @Override
    public Bicicleta next() {
        if (!hasNext()) {
            throw new IllegalStateException("Não existem mais bicicletas no estoque.");
        }

        Bicicleta bicicleta = bicicletas.get(posicao);
        posicao++;
        return bicicleta;
    }
}
