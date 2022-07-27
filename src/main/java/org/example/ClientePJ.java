package org.example;

public class ClientePJ extends Cliente{
    private String cnpj;

    public ClientePJ(String nome, String telefone, String cnpj) {
        super(nome, telefone);
        setCnpj(cnpj);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (cnpj.length()<14){
            throw new IllegalArgumentException("CNPJ inválido. Não foi possível concluir a operação.");
        }
        this.cnpj = cnpj;
    }
    @Override
    public double obterDesconto(int diarias) {
        if(diarias>3)
            return 0.1;
        return 0;
    }

}

