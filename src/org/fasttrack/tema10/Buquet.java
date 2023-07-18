package org.fasttrack.tema10;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Buquet {
    private Set<String> flowers;

    public Buquet() {
        this.flowers = new HashSet<>();
    }

    public Collection<String> getAll() {
        return this.flowers;
    }

    public boolean add(String flower) {
        return this.flowers.add(flower);
    }

    public boolean remove(String flower) {
        return this.flowers.remove(flower);
    }
}
