package collections.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class CollectionMain {
    public static void main(String[] args) {
        Collection<String> superHero = new LinkedList<>();
        superHero.add("Spider Man");
        superHero.add("Iron Man");
        superHero.add("Super Man");
        superHero.add("Thor");
        superHero.add("Black Adam");
        superHero.add("Flash");
        superHero.add("Batman");
        superHero.add("Aquaman");

        Collection<String> superHeroine = new ArrayList<>();
        superHeroine.add("Wonder Woman");
        superHeroine.add("Black Widow");
        superHeroine.add("Jean Grey");
        superHeroine.add("Rog");

        Collection<String> mutants = new ArrayList<>();
        mutants.addAll(superHero);
        mutants.addAll(superHeroine);

        mutants.forEach(System.out::println);
        System.out.println("=========================");
        mutants.remove("Iron Man");
        /* This is lambda expression */
        mutants.forEach(System.out::println);
    }
}
