package Abstract;

import Interface.Cobranca;

public abstract class Projeto implements Cobranca {
    private String titulo;
    private String descricao;
    private double valorTotal;
    private int prazo;
    private String tipo; //Web ou mobile

    public Projeto(String titulo, String descricao, double valorTotal, int prazo, String tipo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.valorTotal = valorTotal;
        this.prazo = prazo;
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    @Override
    public double calcularValorTotal() {
        return 0;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valorTotal=" + valorTotal +
                ", prazo=" + prazo +
                '}';
    }
}
