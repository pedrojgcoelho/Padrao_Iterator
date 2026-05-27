package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LojaBicicletasIteratorTest {

    @Test
    public void devePercorrerTodasAsBicicletasDoEstoque() {
        EstoqueBicicletas estoque = criarEstoqueTeste();
        IteratorBicicleta iterator = estoque.criarIterator();

        assertTrue(iterator.hasNext());
        assertEquals("Mountain Bike Aro 29", iterator.next().getModelo());
        assertEquals("Speed Bike Carbon", iterator.next().getModelo());
        assertEquals("Bicicleta Urbana", iterator.next().getModelo());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void deveListarTodasAsBicicletas() {
        EstoqueBicicletas estoque = criarEstoqueTeste();
        LojaBicicletas loja = new LojaBicicletas();

        assertEquals(
                "Mountain Bike Aro 29 - Trilha - R$ 2500.0\n" +
                        "Speed Bike Carbon - Estrada - R$ 4200.0\n" +
                        "Bicicleta Urbana - Cidade - R$ 1800.0",
                loja.listarTodasBicicletas(estoque)
        );
    }

    @Test
    public void deveListarSomenteBicicletasDisponiveis() {
        EstoqueBicicletas estoque = criarEstoqueTeste();
        LojaBicicletas loja = new LojaBicicletas();

        assertEquals(
                "Mountain Bike Aro 29 - Trilha - R$ 2500.0\n" +
                        "Bicicleta Urbana - Cidade - R$ 1800.0",
                loja.listarBicicletasDisponiveis(estoque)
        );
    }

    @Test
    public void deveContarBicicletasDisponiveis() {
        EstoqueBicicletas estoque = criarEstoqueTeste();
        LojaBicicletas loja = new LojaBicicletas();

        assertEquals(2, loja.contarBicicletasDisponiveis(estoque));
    }

    @Test
    public void deveRetornarErroQuandoNaoExistiremMaisBicicletas() {
        EstoqueBicicletas estoque = criarEstoqueTeste();
        IteratorBicicleta iterator = estoque.criarIterator();

        iterator.next();
        iterator.next();
        iterator.next();

        assertThrows(IllegalStateException.class, iterator::next);
    }

    @Test
    public void deveRetornarErroQuandoNaoExistiremMaisBicicletasDisponiveis() {
        EstoqueBicicletas estoque = criarEstoqueTeste();
        IteratorBicicleta iterator = estoque.criarIteratorDisponiveis();

        iterator.next();
        iterator.next();

        assertThrows(IllegalStateException.class, iterator::next);
    }

    private EstoqueBicicletas criarEstoqueTeste() {
        EstoqueBicicletas estoque = new EstoqueBicicletas();

        estoque.adicionarBicicleta(new Bicicleta("Mountain Bike Aro 29", "Trilha", 2500.00, true));
        estoque.adicionarBicicleta(new Bicicleta("Speed Bike Carbon", "Estrada", 4200.00, false));
        estoque.adicionarBicicleta(new Bicicleta("Bicicleta Urbana", "Cidade", 1800.00, true));

        return estoque;
    }
}
