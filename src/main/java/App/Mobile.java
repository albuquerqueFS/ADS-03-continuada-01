package App;

import Abstract.Projeto;

public class Mobile extends Projeto {
    private String plataforma;

    public Mobile(String titulo, String descricao, double valorTotal, int prazo, String tipo, String plataforma) {
        super(titulo, descricao, valorTotal, prazo, tipo);
        this.plataforma = plataforma;
        setValorTotal(calcularValorTotal(valorTotal));
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public double calcularValorTotal(double valorProjeto) {
        return valorProjeto * 1.2;
    }
}
