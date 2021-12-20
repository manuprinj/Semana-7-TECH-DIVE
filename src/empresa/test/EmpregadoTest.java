package empresa.test;


import empresa.model.Empregado;


public class EmpregadoTest {

    public static void main(String[] args) {
        Empregado empregado = new Empregado();

        empregado.setSalarioBase(500);
        empregado.setImposto(100);

        System.out.println("O valor do salário é: R$ " + empregado.calcularSalario());
    }
}
