package App;

import Abstract.Projeto;

public class Web extends Projeto {

    private String provedor;

    public Web(String titulo, String descricao, double valorTotal, int prazo, String tipo, String provedor) {
        super(titulo, descricao, valorTotal, prazo, tipo);
        this.provedor = provedor;
    }

    public String getProvedor() {
        return provedor;
    }

    public void setProvedor(String provedor) {
        this.provedor = provedor;
    }

    @Override
    public double calcularValorTotal() {
        return super.calcularValorTotal();
    }

}
