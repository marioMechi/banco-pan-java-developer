package one.digitalinnovation;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> queueCarro = new LinkedList<>();

        queueCarro.add(new Carro("Ford"));
        queueCarro.add(new Carro("Fiat"));
        queueCarro.add(new Carro("Chevolet"));

        System.out.println(queueCarro.add(new Carro("Pegeout")));
        System.out.println(queueCarro);

        System.out.println(queueCarro.offer(new Carro("Renault")));
        System.out.println(queueCarro);

        System.out.println(queueCarro.peek());
        System.out.println(queueCarro);
    }
}
