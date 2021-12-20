package zoologico.animais.model;


import java.util.ArrayList;
import java.util.List;


public class Zoologico {

    private List<Animal> jaulas = new ArrayList<>();

    public List<Animal> getJaulas() {
        return jaulas;
    }

    public void setJaulas(List<Animal> jaulas) {
        this.jaulas = jaulas;
    }
}
