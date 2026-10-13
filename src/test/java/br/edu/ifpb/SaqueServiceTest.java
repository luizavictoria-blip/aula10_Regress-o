package br.edu.ifpb;

import br.edu.ifpb.SaqueService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SaqueServiceTest {

    private SaqueService service;

    @BeforeEach
    void setUp(){
        service = new SaqueService();
    }

    @Test
    void valor_9_deveSerRejeitado() {
        assertFalse(service.podeSacar(9));
    }

    @Test
    void valor_10_deveSerAceito() {
        assertTrue(service.podeSacar(10));
    }

    @Test
    void valor_11_deveSerRejeitado() {
        assertFalse(service.podeSacar(11));
    }

    @Test
    void valor_500_deveSerAceito() {
        assertTrue(service.podeSacar(500));
    }

    @Test
    void valor_2000_deveSerAceito() {
        assertTrue(service.podeSacar(2000));
    }

    @Test
    void valor_2010_deveSerRejeitado() {
        assertFalse(service.podeSacar(2010));
    }


}
