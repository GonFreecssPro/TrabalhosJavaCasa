package entidades;

import java.util.ArrayList;
import java.util.List;
import classes.Janela;
import classes.Parede;
import classes.Porta;

/**
 *
 * @author 202008309621
 */
public class Casa {
    
    private String cor;
    private String tamanho;
    private List<Janela> janela;
    private List<Porta> porta;
    private List<Parede> parede;
    
    public Casa (){
        cor = "Amarelo";
        tamanho = "100m2";
        porta = new ArrayList<>();
        parede = new ArrayList<>();
        janela = new ArrayList<>();
    } 

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public List<Janela> getJanela() {
        return janela;
    }

    public void setJanela(List<Janela> janela) {
        this.janela = janela;
    }

    public List<Porta> getPorta() {
        return porta;
    }

    public void setPorta(List<Porta> porta) {
        this.porta = porta;
    }

    public List<Parede> getParede() {
        return parede;
    }

    public void setParede(List<Parede> parede) {
        this.parede = parede;
    }

    @Override
    public String toString() {
        return "Casa{" + "cor=" + cor + ", tamanho=" + tamanho + ", janela=" + janela +
                ", porta=" + porta + ", parede=" + parede + '}';
    }
    
 }
