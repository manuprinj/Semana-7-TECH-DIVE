public class FornecedorTest {

    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();

        fornecedor.setValorCredito(1000);
        fornecedor.setValorDivida(500);

        System.out.println("O valor do saldo é: R$ " + fornecedor.obterSaldo());
    }
}
