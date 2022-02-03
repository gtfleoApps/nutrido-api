package br.com.nutrido;

/**
 * Hello world!
 *
 */
public class BkpAPP {
    public static void main(String[] args) {
        BkpAlimento alimento = new BkpAlimento();

        try {
            alimento.setNome("Abacate, cru");
            alimento.setUnidade("gram");
            alimento.setQuantidade(100.0);
            alimento.setKcal(96.0);
            alimento.setCarboidrato(6.0);
            alimento.setProteina(1.2);
            alimento.setGordura(12.0);
            alimento.setFibra(6.3);            
            System.out.println(alimento.getNome());
            System.out.println(alimento.getUnidade().getCodigo());
        } catch (Exception e) {
            System.out.println("Erro no cadastro do alimento. " + e.getMessage());
            // e.printStackTrace();
        }

    }
}
