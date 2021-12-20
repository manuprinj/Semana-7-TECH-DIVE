package zoologico.animais.test;


import zoologico.animais.model.Animal;
import zoologico.animais.model.Cachorro;
import zoologico.animais.model.Cavalo;
import zoologico.animais.model.Preguica;
import zoologico.animais.model.Zoologico;


public class ZoologicoTest {

    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();
        zoologico.getJaulas().add(new Cachorro("Teste 1", 5));
        zoologico.getJaulas().add(new Cachorro("Teste 2", 6));
        zoologico.getJaulas().add(new Cachorro("Teste 3", 7));
        zoologico.getJaulas().add(new Cavalo("Teste 4", 5));
        zoologico.getJaulas().add(new Cavalo("Teste 5", 6));
        zoologico.getJaulas().add(new Cavalo("Teste 6", 7));
        zoologico.getJaulas().add(new Preguica("Teste 7", 5));
        zoologico.getJaulas().add(new Preguica("Teste 8", 6));
        zoologico.getJaulas().add(new Preguica("Teste 9", 7));
        zoologico.getJaulas().add(new Preguica("Teste 10", 5));

        for (Animal animal : zoologico.getJaulas()) {
            System.out.println(animal.emitirSom());
            if (animal instanceof Cachorro) {
                System.out.println(((Cachorro) animal).deveCorrer());
            }

            if (animal instanceof Cavalo) {
                System.out.println(((Cavalo) animal).deveCorrer());
            }
        }
    }
}
