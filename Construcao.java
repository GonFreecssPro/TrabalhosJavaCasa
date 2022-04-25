/*
 * Nome: Isaias Barbosa de Oliveira
 * Matricula: 202003211877
 * Nome: Jonathan Mendes Motta
 * Matricula: 202008309621
 * 
 */
package classes;

import entidades.Casa;

public class Construcao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instanciando a classe principal
        Casa minhacasa = new Casa();

        minhacasa.setCor("Amarelo");
        minhacasa.setTamanho("100m2");

        // instanciando item porta da classe principal minha cassa com arraylist
        Porta minhaporta = new Porta();

        minhaporta.setAltura((float) 2.00);
        minhaporta.setLargura(1);
        minhaporta.setMaterial("madeira");

        minhacasa.getPorta().add(minhaporta);

        // instanciando item porta da classe principal minha casa com arraylist
        Porta minhaporta2 = new Porta();

        minhaporta.setAltura((float) 2.00);
        minhaporta.setLargura(1);
        minhaporta.setMaterial("madeira");

        minhacasa.getPorta().add(minhaporta2);

        Parede minhaparede = new Parede();

        minhaparede.setLocalizacao("Parede da frente");
        minhaparede.setAltura(3);

        minhacasa.getParede().add(minhaparede);

        Parede minhaparede2 = new Parede();

        minhaparede.setLocalizacao("Parede de trás");
        minhaparede.setAltura(3);

        minhacasa.getParede().add(minhaparede2);

        Janela minhajanela = new Janela();

        minhajanela.setDimensao("1,5 x 1,5 metros");
        minhajanela.setMaterial("Metal");

        minhacasa.getJanela().add(minhajanela);

        Janela minhajanela2 = new Janela();

        minhajanela.setDimensao("1,5 x 1,5 metros");
        minhajanela.setMaterial("Metal");

        minhacasa.getJanela().add(minhajanela2);

        System.out.println(minhacasa);
    }

}
