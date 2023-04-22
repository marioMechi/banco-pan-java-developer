package one.digitalinnovation;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Carro> hashSetCarro = new HashSet<>();
        hashSetCarro.add(new Carro("Ford"));
        hashSetCarro.add(new Carro("Fiat"));
        hashSetCarro.add(new Carro("Volkswagem"));
        hashSetCarro.add(new Carro("Chevrolet"));
        hashSetCarro.add(new Carro("BMW"));
        hashSetCarro.add(new Carro("Zip"));
        System.out.println(hashSetCarro);

        Set<Carro> treeSetCarro = new TreeSet<>();
        treeSetCarro.add(new Carro("Ford"));
        treeSetCarro.add(new Carro("Fiat"));
        treeSetCarro.add(new Carro("Volkswagem"));
        treeSetCarro.add(new Carro("Chevrolet"));
        treeSetCarro.add(new Carro("BMW"));
        treeSetCarro.add(new Carro("Zip"));
        System.out.println(treeSetCarro);
    }
}
