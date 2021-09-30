package org.example.jca.lesson10;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class Telephonebook {
    //    String name;
//    Long number;
//
//    public Telephonebook(String name, Long number) {
//        this.name = name;
//        this.number = number;
//    }

    private final TreeMap<String, Set<Long>> entries = new TreeMap<>();

    public void add(String name, Long number) {
        Set<Long> phones = getPhones(name);
        phones.add(Long.valueOf(String.valueOf(number)));
    }

    private Set<Long> getPhones(String name) {
        return entries.computeIfAbsent(name, key -> new HashSet<>());
    }

    public Set<Long> get(String name) {
        return getPhones(name);
    }
}
