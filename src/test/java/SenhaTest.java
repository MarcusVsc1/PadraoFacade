import model.Senha;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class SenhaTest {

    @Test
    public void senhaValidaTest() {
        Senha senha = new Senha("1234567697987");
        assertEquals("Senha válida", senha.validarSenha());
    }

    @Test
    public void senhaInvalidaLengthRuleTest() {
        Senha senha = new Senha("12345");
        assertEquals("A senha não satisfaz a política de senha na seguinte regra: Senha precisa ter entre 8 e 30 caracteres.", senha.validarSenha());
    }

    @Test
    public void senhaInvalidaWhitespaceRuleTest() {
        Senha senha = new Senha("12345 12345");
        assertEquals("A senha não satisfaz a política de senha na seguinte regra: Senha não pode ter espaço em branco.", senha.validarSenha());
    }
}
