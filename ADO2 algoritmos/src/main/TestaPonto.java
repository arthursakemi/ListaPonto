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

        pontos.add(0, new Ponto(2, 2));
        pontos.add(new Ponto(0, 0));
        pontos.add(new Ponto(1, 1));
        pontos.add(new Ponto(1, 1));
        pontos.add(new Ponto(1, 1));
        pontos.add(0, new Ponto(2, 1));
        pontos.add(6, new Ponto(3, 4));

        pontos.print();

        System.out.println(pontos.mostDistant());

        System.out.println(pontos.insideRadius(1, new Ponto(0, 0)));

    }

}
