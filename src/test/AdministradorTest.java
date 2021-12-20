package test;


import model.Administrador;
import model.Empregado;


public class AdministradorTest {

    public static void main(String[] args) {
        Administrador administrador = new Administrador();

        administrador.setSalarioBase(500);
        administrador.setImposto(100);
        administrador.setAjudaCustos(200);

        System.out.println("O valor do salário é: R$ " + administrador.calcularSalario());
    }
}
