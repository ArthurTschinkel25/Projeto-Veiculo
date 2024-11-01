package fakedb;

import dominio.Veiculo;
import java.util.ArrayList;

public class VeiculoFakeDB extends BaseFakeDB<Veiculo> {

    @Override
    protected void preencherDados() {
        this.tabela = new ArrayList<>();
        this.tabela.add(new Veiculo(1, "Toyota", "Corolla", 2024, 150000));
    }

    public VeiculoFakeDB() {
        super();
    }
}
