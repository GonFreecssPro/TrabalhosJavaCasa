package classes;

/**
 *
 * @author 202008309621
 */
public class Janela {
    
    private String dimensao;
    private String material;
    
    public String getDimensao() {
        return dimensao;
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Janela{" + "dimensao=" + dimensao + ", material=" + material + '}';
    }
      
  }
