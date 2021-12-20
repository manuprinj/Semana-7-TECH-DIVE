package empresa.test;


import empresa.model.Vendedor;


public class VendedorTest {

    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();

        vendedor.setSalarioBase(500);
        vendedor.setImposto(100);
        vendedor.setValorVenda(100);
        vendedor.setComissao(0.1);

        System.out.println("O valor do salário é: R$ " + vendedor.calcularSalario());
    }
}
