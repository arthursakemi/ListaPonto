/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author arthur.msakemi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ListaPonto pontos = new ListaPonto();

        pontos.add(new Ponto(1, 1));
        pontos.add(new Ponto(1, 1));
        pontos.add(new Ponto(1, 1));
        pontos.add(new Ponto(1, 1));
        pontos.add(2, new Ponto(2, 2));
        pontos.add(3, new Ponto(3, 3));

        System.out.println(pontos.toString());

        pontos.remove(2);

        System.out.println(pontos.toString());

        pontos.remove(3);

        System.out.println(pontos.toString());

    }

}
