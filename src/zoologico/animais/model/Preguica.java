package zoologico.animais.model;


public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    public String deveSubirArvore() {
        return "Sobre em árvore";
    }

    @Override
    public String emitirSom() {
        return "Zzzzzzzz";
    }
}
