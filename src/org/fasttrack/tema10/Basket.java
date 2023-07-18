package org.fasttrack.tema10;

import java.util.*;

public class Basket {
    private List<String> fruits;

    public Basket() {
        this.fruits = new ArrayList<>();
    }

    public boolean find(String fruitToFind) {
//        for (String currentFruit: fruits) {
//            if (currentFruit.equals(fruitToFind)) {
//                return true;
//            }
//        }
//        return false;
        return fruits.contains(fruitToFind);

//        if (fruits.contains(fruitToFind)) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public boolean remove(String fruitTORemove) {
        return fruits.remove(fruitTORemove);
    }

    public int position(String fruit) {
        return fruits.indexOf(fruit);
    }

    public Collection<String> distinct() {
//        List<String> unique = new ArrayList<>();
//        for (String fruit: fruits) {
//            if (!unique.contains(fruit)) {
//                unique.add(fruit);
//            }
//        }
//        return unique;
        return new HashSet<>(fruits);
    }

    public boolean add(String fruitToAdd) {
        return fruits.add(fruitToAdd);
    }

    public int count() {
        return fruits.size();
    }

    public int uniqueFruitsCount() {
        int counter = 0;
        List<String> uniqueFruits = new ArrayList<>();
        for (String fruit : fruits) {
            if (!uniqueFruits.contains(fruit)) {
                uniqueFruits.add(fruit);
                counter++;
            }
        }
        return counter;

//        return this.distinct().size();
    }


}
