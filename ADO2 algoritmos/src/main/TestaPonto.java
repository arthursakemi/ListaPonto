/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Sakemi
 */
public class TestaPonto {

    public static void main(String[] args) {

        ListaPonto pontos = new ListaPonto();

        pontos.add(new Ponto(0, 0));
        pontos.add(new Ponto(1, 1));
        pontos.add(new Ponto(1, 1));
        pontos.add(new Ponto(1, 1));
        pontos.add(2, new Ponto(2, 2));
        pontos.add(3, new Ponto(3, 4));

        System.out.println(pontos.toString());

        System.out.println(pontos.mostDistant());

        System.out.println(pontos.insideRadius(1, new Ponto(0, 0)));

    }

}
