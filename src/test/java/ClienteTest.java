import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Cliente cliente = new Cliente(123, "cliente Original", new Endereco("Rua A", 1), "(32)98994-9999");

       Cliente clienteclone = cliente.clone();
        clienteclone.setId(124);
        clienteclone.setNome("cliente Clonado");
        clienteclone.getEndereco().setNumero(24);

       clienteclone.setTelefone("(32)98995-9988");

        assertEquals("Cliente{id=123,nome='cliente Original',endereco=Endereco{logradouro='Rua A', numero=1},telefone='(32)98994-9999'}", cliente.toString());
        assertEquals("Cliente{id=124,nome='cliente Clonado',endereco=Endereco{logradouro='Rua A', numero=24},telefone='(32)98995-9988'}", clienteclone.toString());
    }
}