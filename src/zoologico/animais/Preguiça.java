package zoologico.animais;


public class Preguiça extends Animal {

    public Preguiça(String nome, int idade) {
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
