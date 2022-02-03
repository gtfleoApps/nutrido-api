package br.com.nutrido;

public class BkpAlimento {
    
    private String nome;
    // private String unidade;
    private BkpUnidadeDeMedida unidade;
    private double quantidade;
    private double kcal;
    private double proteina;
    private double carboidrato;
    private double gordura;
    private double fibra;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public BkpUnidadeDeMedida getUnidade() {
        return unidade;
    }
    public void setUnidade(String medida) {
        try {
            this.unidade = BkpUnidadeDeMedida.consultaUnidade(medida);
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public double getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getKcal() {
        return kcal;
    }
    public void setKcal(double kcal) {
        this.kcal = kcal;
    }

    public double getProteina() {
        return proteina;
    }
    public void setProteina(double proteina) {
        this.proteina = proteina;
    }

    public double getCarboidrato() {
        return carboidrato;
    }
    public void setCarboidrato(double carboidrato) {
        this.carboidrato = carboidrato;
    }

    public double getGordura() {
        return gordura;
    }
    public void setGordura(double gordura) {
        this.gordura = gordura;
    }

    public double getFibra() {
        return fibra;
    }
    public void setFibra(double fibra) {
        this.fibra = fibra;
    }

    
}
