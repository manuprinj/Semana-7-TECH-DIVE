package zoologico.animais.model;


public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    public String deveCorrer() {
        return "Corre";
    }

    @Override
    public String emitirSom() {
        return "Iiirrrrí";
    }
}
