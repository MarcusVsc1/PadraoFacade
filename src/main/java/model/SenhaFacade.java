package model;

import exceptions.BrokenRuleException;

import java.util.Arrays;

public class SenhaFacade {
    public static String validarSenha(Senha senha) {
        try {
            new PasswordValidator(Arrays.asList(
                    new LengthRule(8, 30),
                    new WhitespaceRule())
            ).validate(senha.getTextoSenha());
        } catch (BrokenRuleException bre) {
            return bre.getMessage();
        }
        return "Senha válida";
    }
}
