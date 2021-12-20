package model;


public class Vendedor extends Empregado {

    private double valorVenda;
    private double comissao;

    public double calcularComissao() {
        return valorVenda * comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + calcularComissao();
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
