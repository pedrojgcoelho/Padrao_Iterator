package padroescomportamentais.iterator;

import java.util.List;

public class EstoqueBicicletasDisponiveisIterator implements IteratorBicicleta {

    private List<Bicicleta> bicicletas;
    private int posicao;

    public EstoqueBicicletasDisponiveisIterator(List<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
        this.posicao = 0;
    }

    @Override
    public boolean hasNext() {
        while (posicao < bicicletas.size()) {
            if (bicicletas.get(posicao).isDisponivel()) {
                return true;
            }
            posicao++;
        }
        return false;
    }

    @Override
    public Bicicleta next() {
        if (!hasNext()) {
            throw new IllegalStateException("Não existem mais bicicletas disponíveis no estoque.");
        }

        Bicicleta bicicleta = bicicletas.get(posicao);
        posicao++;
        return bicicleta;
    }
}
