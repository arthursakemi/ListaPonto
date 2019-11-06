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
public class ListaPonto {

    private Ponto pontos[];
    private int size;

    public ListaPonto() {
        this.pontos = new Ponto[1];
        this.size = 0;
    }

    public ListaPonto(int n) {
        this.pontos = new Ponto[n];
        this.size = 0;
    }

    public void add(Ponto p) {
        if (pontos.length == this.size) {
            expand();
        }

        this.pontos[size] = p;
        this.size++;
    }

    public void add(int i, Ponto p) {
        if (pontos.length == this.size) {
            expand();
        }
        shiftRight(i);

        this.pontos[i] = p;
        this.size++;
    }

    public void remove(int i) {
        for (int j = i; j < size - 1; j++) {
            this.pontos[j] = this.pontos[j + 1];
        }

        size--;
    }

    public void remove(Ponto p) {

    }

    public int size() {
        return this.size;
    }

    private void shiftRight(int i) {
        for (int j = size; j > i; j--) {
            this.pontos[j] = this.pontos[j - 1];
        }

    }

    private void expand() {
        int size = pontos.length;
        int newSize = 1 + size + (size / 2);
        Ponto[] temp = new Ponto[size];

        copy(this.pontos, temp);

        this.pontos = new Ponto[newSize];

        copy(temp, this.pontos);
    }

    private void copy(Ponto[] from, Ponto[] to) {
        for (int i = 0; i < from.length; i++) {
            to[i] = from[i];
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += pontos[i].toString();

            if (i < size - 1) {
                result += ", ";
            }
        }

        return result;
    }

}
