package empresa.model;


public class Operario extends Empregado {

    private double valorProducao;
    private double porcentagemComissao;

    public double calcularComissao() {
        return valorProducao * porcentagemComissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + calcularComissao();
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getPorcentagemComissao() {
        return porcentagemComissao;
    }

    public void setPorcentagemComissao(double porcentagemComissao) {
        this.porcentagemComissao = porcentagemComissao;
    }
}
