package org.example;

public class ClientePF extends Cliente {
    private String cpf;

    public ClientePF(String nome, String telefone, String cpf, String profissao) {
        super(nome, telefone);
        setCpf(cpf);
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        if (cpf.length()<11){
            throw new IllegalArgumentException("CPF inválido. Não foi possível concluir a operação.");
        }
        this.cpf = cpf;
    }
}
