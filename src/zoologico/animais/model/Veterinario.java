package zoologico.animais.model;


public class Veterinario {

    public String examinar(Animal animal) {
        return animal.emitirSom();
    }
}
