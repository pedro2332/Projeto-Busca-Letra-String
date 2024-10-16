package com.projetostring.services;

public class VerifyLetter {

    public void verifyLetter (String word, String letter) {
        if (word.contains(letter)) {
            var outLetterWord = word.toLowerCase().replace(letter, "");
            var howManyLetter = word.length() - outLetterWord.length();
            System.out.printf("Aí sim! A palavra %s contem a letra %s!", word, letter);
            System.out.printf("\nA letra %s aparece %d vez(es) na palavra %s", letter, howManyLetter, word);
        } else {
            System.out.printf("A palavra %s não contém a letra %s", word, letter);
        }

    }
}
