package zoologico.animais;


public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public String deveCorrer() {
        return "Corre";
    }

    @Override
    public String emitirSom() {
        return "Au Au";
    }

}
