package classes;

/**
 *
 * @author 202008309621
 */
public class Parede {
    private String localizacao;
    private float altura;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Parede{" + "localizacao=" + localizacao + ", altura=" + altura + '}';
    }
    
    
}
