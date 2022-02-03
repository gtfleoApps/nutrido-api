package br.com.nutrido;

public enum BkpUnidadeDeMedida {
    AGOSTO("agos", "a gosto"),
    COLHERCHA("ccha", "colher cha"),
    COLHERSERVIR("cserv", "colher servir"),
    COLHERSOBREMESA("csobr", "colher sobremesa"),
    COLHERSOPA("csop", "colher sopa"),
    CONCHA("con", "concha"),
    FATIA("fat", "fatia"),
    FOLHA("fol", "folha"),
    GRAMA("g", "grama"),
    MILILITRO("ml", "mililitro"),
    PEGADOR("peg", "pegador"),
    PORCAO("por", "porção"),
    SCOOP("scp", "scoop"),
    UNIDADE("unid", "unidade"),
    UNIDADESUMO("sumo", "unidade sumo"),
    XICARA("xic", "xicara");

    private final String codigo;
    private final String descricao;

    // O construtor de uma enum é sempre privado, não podendo ser invocado
    // diretamente.
    // Nele são iniciados todos os campos, que por serem constantes devem declarados
    // antes das propriedades e do construtor da classe.
    BkpUnidadeDeMedida(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static BkpUnidadeDeMedida consultaUnidade(String criterio) {
        for (BkpUnidadeDeMedida listaUnidades : BkpUnidadeDeMedida.values()) {
            if (criterio == listaUnidades.getCodigo() || criterio == listaUnidades.getDescricao()) {
                return listaUnidades;
            }
        }
        // return null;
        String quebraLinha = System.getProperty("line.separator");

        String opcoesDeUnidades = "";
        for (BkpUnidadeDeMedida listaUnidades : BkpUnidadeDeMedida.values()) {
            opcoesDeUnidades += "-" + listaUnidades.getDescricao() + "(" + listaUnidades.getCodigo() + ")"
                    + quebraLinha;
        }
        throw new IllegalArgumentException("Não existe unidade de medida '" + criterio + "'. Selecione entre: " +
                quebraLinha + opcoesDeUnidades);
    }

}
