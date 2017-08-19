package com.mojafirma.stringComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main_StringComparator {

    public static void main(String[] args) {

        StringComparator comparator = new StringComparator();
        Scanner sc = new Scanner(System.in);
        List<String> wordList = Arrays.asList("ala", "ola", "ula", "ela", "cola", "viola", "hela", "cela", "mila", "kula", "pola", "tola", "kot");
        List<String> newWordList = new ArrayList<>();
        System.out.println("Podaj slowo do porownania:");
        String compared = sc.nextLine();
        newWordList.add(compared);

        newWordList.addAll(wordList.stream().filter(word -> comparator.areSimilar(word, compared)).collect(Collectors.toList()));
        newWordList.stream().forEach(System.out::println);


    }
}
