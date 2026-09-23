package singleton.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GenerateIDTest {

    @Test
    public void deveRetornarMesmaInstancia() {
        assertSame(GenerateID.getInstance(), GenerateID.getInstance());
    }

    @Test
    public void deveGerarIdsSequenciais() {
        int id1 = GenerateID.getInstance().novoId();
        int id2 = GenerateID.getInstance().novoId();
        assertEquals(id2, id1 + 1);
    }
}
