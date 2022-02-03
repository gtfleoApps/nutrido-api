package br.com.nutrido;

import br.com.nutrido.controller.UnidadeMedidaController;
import br.com.nutrido.modelo.UnidadeMedida;

public class App {

    public static void main(String[] args) {

        UnidadeMedidaController unidadeController = new UnidadeMedidaController();

        boolean salvar = false;
        boolean alterar = true;
        if (salvar) {
            UnidadeMedida unidadeNova = new UnidadeMedida("gramas", "g");
            unidadeController.salvar(unidadeNova);
        }

        if (alterar) {
            UnidadeMedida unidadeAlterada = new UnidadeMedida(1, "gramas", "g");
            unidadeController.alterar(unidadeAlterada);
        }

        unidadeController.listar().stream().forEach(umc -> System.out.println(umc));

    }
}
