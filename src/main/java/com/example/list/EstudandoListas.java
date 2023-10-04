package com.example.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EstudandoListas {

    public static void main(String[] args) {
        //Listas permitem elementos duplicados e garante ordem de inserção
        //java.util.List;

        // ArrayList deve ser usado onde mais operações de pesquisa são necessárias.
        // LinkedList deve ser usado onde mais operações de inserção e exclusão são necessárias.

        //        List notas = new ArrayList(); //antes do Java 5
        //        List<Double> notas = new ArrayList<Double>(); //Generics - Diamond Operator
        //        ArrayList<Double> notas = new ArrayList<>(); --não se usa mais, nem recomendado

        //TODO é orientado programar orientado a interface e não para a implementação

        //        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 8d, 5.1));
        //TODO não aceita dessa forma
        //        List<Double> notas = Arrays.asList(7d, 8.5, 8d, 5.1);
        //        notas.add(10d);
        //        System.out.println(notas);

        //lista imutavel -> List.of
        //        List<Double> notas = List.of(1d, 2d, 3d);
        //        notas.add(1d);
        //        notas.remove(2d);
        //        System.out.println(notas);

        List<Double> notas = new ArrayList<Double>();

        notas.add(7d);
        notas.add(3d);
        notas.add(4d);
        notas.add(5d);
        notas.add(6d);
        notas.add(7d);
        notas.add(8d);
        notas.add(9d);

        System.out.println("Todos os dados da lista" + notas.toString());
        System.out.println("Posição " + notas.indexOf(5d));

        notas.add(4, 5d);
        System.out.println("Adicionou a nota 5 na posição 4 " + notas);

        System.out.println("Substituição de valores");
        notas.set(0, 10d);
        System.out.println(notas);

        System.out.println("Conferir se tem a nota 5 em nossa lista: " + notas.contains(5d));

        //        System.out.println("Imprimir todas as notas na ordem em que foram informadas: ");
        //        for (Double nota : notas) {
        //            System.out.println(nota);
        //        }

        System.out.println("Imprima a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator(); //Ctrl Alt V - Criar variável
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma de todas as notas: " + soma);

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remover a nota especifica (Nota 7)");
        notas.remove(7d);
        System.out.println(notas);

        System.out.println("Remover a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remover as notas menor que 7");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) {
                iterator1.remove();
            }
        }
        System.out.println(notas);
//
        //        System.out.println("Apagar toda a lista");
        //        notas.clear();
        //        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());






    }
}

