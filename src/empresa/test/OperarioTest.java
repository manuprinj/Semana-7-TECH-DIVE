package empresa.test;


import empresa.model.Operario;


public class OperarioTest {

    public static void main(String[] args) {
        Operario operario = new Operario();

        operario.setSalarioBase(500);
        operario.setImposto(100);
        operario.setValorProducao(100);
        operario.setPorcentagemComissao(0.1);

        System.out.println("O valor do salário é: R$ " + operario.calcularSalario());
    }
}
