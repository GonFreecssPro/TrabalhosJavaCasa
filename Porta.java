package classes;
/**
 *
 * @author 202008309621
 */
public class Porta {
private float altura;
private float largura;
private String material;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Porta{" + "altura=" + altura + ", largura=" + largura + ", material=" + material + '}';
    }
    
    
    
}
