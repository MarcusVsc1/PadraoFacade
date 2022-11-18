package model;

public class Senha {

    private String textoSenha;

    public Senha(String textoSenha) {
        this.textoSenha = textoSenha;
    }

    public String validarSenha() {
        return SenhaFacade.validarSenha(this);
    }

    public String getTextoSenha() {
        return textoSenha;
    }
}
