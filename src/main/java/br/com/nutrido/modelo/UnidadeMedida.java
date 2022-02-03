package br.com.nutrido.modelo;

public class UnidadeMedida {
    
    private Integer id;
    private String nome;
    private String nomeAbreviado;

    public UnidadeMedida (String nome, String nomeAbreviado) {
        this.nome = nome;
        this.nomeAbreviado = nomeAbreviado;
    }

    public UnidadeMedida (Integer id, String nome, String nomeAbreviado) {
        this.id = id;
        this.nome = nome;
        this.nomeAbreviado = nomeAbreviado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeAbreviado() {
        return nomeAbreviado;
    }

    public void setNomeAbreviado(String nomeAbreviado) {
        this.nomeAbreviado = nomeAbreviado;
    }

    @Override
    public String toString() {
        return String.format("A unidade é: %d, %s (%s).", this.id, this.nome, this.nomeAbreviado);
    }

}
