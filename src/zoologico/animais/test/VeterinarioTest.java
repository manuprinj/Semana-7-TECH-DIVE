package zoologico.animais.test;


import java.util.ArrayList;
import java.util.List;

import zoologico.animais.model.Animal;
import zoologico.animais.model.Cachorro;
import zoologico.animais.model.Cavalo;
import zoologico.animais.model.Preguica;
import zoologico.animais.model.Veterinario;


public class VeterinarioTest {
    public static void main(String[] args) {
        Veterinario veterinario = new Veterinario();
        System.out.println(veterinario.examinar(new Cachorro("Lindsay", 10)));
        System.out.println(veterinario.examinar(new Cavalo("Pé de Pano", 7)));
        System.out.println(veterinario.examinar(new Preguica("Manuela", 24)));
    }
}
