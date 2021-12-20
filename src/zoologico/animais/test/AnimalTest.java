package zoologico.animais.test;


import java.util.ArrayList;
import java.util.List;

import zoologico.animais.model.Animal;
import zoologico.animais.model.Cachorro;
import zoologico.animais.model.Cavalo;
import zoologico.animais.model.Preguica;


public class AnimalTest {
    
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Lindsay", 10));
        animais.add(new Cavalo("Pé de Pano", 7));
        animais.add(new Preguica("Manuela", 24));

        for (Animal animal : animais) {
            System.out.println(animal.emitirSom());
        }
    }
}
