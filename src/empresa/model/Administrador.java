package empresa.model;


public class Administrador extends Empregado {

    private double ajudaCustos;

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaCustos;
    }

    public double getAjudaCustos() {
        return ajudaCustos;
    }

    public void setAjudaCustos(double ajudaCustos) {
        this.ajudaCustos = ajudaCustos;
    }
}
