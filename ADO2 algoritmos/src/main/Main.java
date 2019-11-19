/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author arthur.msakemi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaPonto lista = new ListaPonto();
        menu(lista);

    }

    public static void menu(ListaPonto lista) {
        Scanner in = new Scanner(System.in);
        int op;

        loop:
        do {
            opcoes();
            op = in.nextInt();

            switch (op) {
                case 1:
                    op1(lista);
                    break;
                case 2:
                    op2(lista);
                    break;
                case 3:
                    op3(lista);
                    break;
                case 4:
                    op4(lista);
                    break;
                case 5:
                    op5(lista);
                    break;
                case 6:
                    op6(lista);
                    break;
                case 0:
                    break loop;
                default:
                    System.err.println("Opcao invalida!");

            }

            if (!novaOperacao()) {
                System.out.println("Aplicacao encerrada!");
                break;
            }

        } while (op != 0);

    }

    public static void op1(ListaPonto lista) {
        Ponto p = criarPonto();

        lista.add(p);

        System.out.println("Pontos:");
        lista.print();

        System.out.println("");
    }

    public static void op2(ListaPonto lista) {
        Scanner in = new Scanner(System.in);
        int i;
        Ponto p = criarPonto();

        while (true) {
            System.out.print("Informe a posicao desejada: ");
            i = in.nextInt();

            if (i > lista.size() || i < 0) {
                System.err.println("Posicao inválida!");
            } else {
                break;
            }
        }

        lista.add(i, p);

        System.out.println("Pontos:");
        lista.print();

        System.out.println("");
    }

    public static void op3(ListaPonto lista) {
        Scanner in = new Scanner(System.in);
        Ponto p = criarPonto();
        int i = lista.indexOf(p);

        if (i < 0) {
            System.out.println("O ponto não foi encontrado!");
        } else {
            System.out.println("Ponto encontrado no indice: " + i);
        }

        System.out.println("Pontos:");
        lista.print();

        System.out.println("");

    }

    public static void op4(ListaPonto lista) {
        Scanner in = new Scanner(System.in);
        int i;

        while (true) {
            System.out.print("Informe o indice do elemento a ser removido: ");
            i = in.nextInt();

            if (i >= lista.size() || i < 0) {
                System.err.println("Posicao inválida");
                System.out.println("");
            } else {
                lista.remove(i);
                break;
            }
        }

        System.out.println("Pontos:");
        lista.print();

        System.out.println("");
    }

    public static void op5(ListaPonto lista) {
        if (lista.size() < 2) {
            System.err.println("Quantidade de elementos insuficiente!");
            System.out.println("");
            return;
        }

        double d = lista.mostDistant();

        System.out.printf("\nA maior distancia entre pontos e: %.2f\n", d);

        System.out.println("Pontos:");
        lista.print();

        System.out.println("");
    }

    public static void op6(ListaPonto lista) {
        Scanner in = new Scanner(System.in);
        ListaPonto contidos;
        Ponto centro;
        int r;

        System.out.println("Informe o centro da circunferencia:");
        centro = criarPonto();

        System.out.print("Informe o raio da circunferencia: ");
        r = in.nextInt();
        System.out.println("");

        contidos = lista.insideRadius(r, centro);

        if (contidos.size() == 0) {
            System.out.println("Não há pontos dentro da circunferencia!");
        } else {
            System.out.println("Pontos dentro da circunferencia:");
            contidos.print();
            System.out.println("");
        }

        System.out.println("Pontos:");
        lista.print();
        System.out.println("");
    }

    public static boolean novaOperacao() {
        Scanner in = new Scanner(System.in);
        int i;

        while (true) {
            System.out.println("Deseja executar uma nova operação?\n"
                    + "1- SIM\n"
                    + "2- NAO\n");

            i = in.nextInt();
            switch (i) {
                case 1:
                    return true;
                case 2:
                    return false;
                default:
                    System.err.println("Opção invalida!");
                    System.out.println("");
                    break;
            }
        }

    }

    public static Ponto criarPonto() {
        Scanner in = new Scanner(System.in);
        int x, y;

        System.out.print("Informe as coordenadas do ponto:\n"
                + "X = ");
        x = in.nextInt();

        System.out.print("Y = ");
        y = in.nextInt();

        System.out.println("");

        return new Ponto(x, y);
    }

    public static void opcoes() {
        System.out.println(
                "\nInforme o numero da operacao desejada:\n"
                + "\n"
                + "1- Adicionar um elemento no final da colecao;\n"
                + "2- Adicionar um elemento em uma posicao da colecao;\n"
                + "3- Retornar o incide da primeira ocorrencia de um elemento na colecao;\n"
                + "4- Remover um elemento em uma posicao na colecao;\n"
                + "5- Calcular a distancia dos dois pontos mais distantes na colecao;\n"
                + "6- Retornar uma colecao de pontos contido em uma circunferencia de raio X;\n"
                + "\n"
                + "0- Encerrar a aplicacao;\n");
    }

}
