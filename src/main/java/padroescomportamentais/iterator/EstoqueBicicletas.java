package padroescomportamentais.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EstoqueBicicletas implements ColecaoBicicletas {

    private List<Bicicleta> bicicletas;

    public EstoqueBicicletas() {
        this.bicicletas = new ArrayList<>();
    }

    public void adicionarBicicleta(Bicicleta bicicleta) {
        this.bicicletas.add(bicicleta);
    }

    public List<Bicicleta> getBicicletas() {
        return Collections.unmodifiableList(bicicletas);
    }

    public int getQuantidade() {
        return bicicletas.size();
    }

    @Override
    public IteratorBicicleta criarIterator() {
        return new EstoqueBicicletasIterator(bicicletas);
    }

    public IteratorBicicleta criarIteratorDisponiveis() {
        return new EstoqueBicicletasDisponiveisIterator(bicicletas);
    }
}
