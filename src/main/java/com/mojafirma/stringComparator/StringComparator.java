package com.mojafirma.stringComparator;
//14. (Poziom 3) Zaimplementuj wyszukiwarkê podobnych napisów - napis jest podobny do zadanego, je¿eli jego d³ugoœæ nie ró¿ni
// siê o wiêcej ni¿ dwa znaki, a zbiór u¿ytych liter ma tak¹ sam¹ wielkoœæ i nie ró¿ni siê o wiêcej ni¿ 1 literê.
// Np. porównujemy napis "baza" do napisu "bez":
//1. d³ugoœæ napisu "baza" = 4, napisu "bez" = 3 wiêc pierwszy warunek jest spe³niony
//2. zbiór liter napisu "baza" to 'a', 'b' 'z' , napisu "bez" to 'b', 'z', 'e' - oba zbiory liter maj¹ rozmiar 3 i ró¿ni¹ siê o jedn¹
// literê wiêc uznajemy ¿e napisy s¹ podobne
// Dodaj do listy kilkanaœcie napisów, nastêpnie przefiltruj j¹ na podstawie podobieñstwa do napisu podanego przez u¿ytkownika.


import java.util.HashSet;
import java.util.Set;

public class StringComparator {

    public boolean areSimilar(String a, String b) {
        if (a.length() + 2 >= b.length() && a.length() - 2 <= b.length()) {
            Set<Character> letterSetA = stringToSet(a);
            Set<Character> letterSetB = stringToSet(b);
            if (letterSetA.size() == letterSetB.size()) {
                Set<Character> differences = new HashSet<>();
                for (Character ch : letterSetA) {
                    if (!letterSetB.contains(ch)) {
                        differences.add(ch);
                    }
                }
                if (differences.size() <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    private Set<Character> stringToSet(String s) {
        Set<Character> letterSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            letterSet.add(new Character(s.charAt(i)));
        }
        return letterSet;
    }



}
