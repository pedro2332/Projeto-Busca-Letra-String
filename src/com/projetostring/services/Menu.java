package com.projetostring.services;

public class Menu {
    private VerifyLetter verifyLetter = new VerifyLetter();
    private String word = "Olho";
    final String firstLetter = "a";
    final String secondLetter = "o";

    public void initializeMenu() {
        System.out.println("""
                Bem vindo, a letra que será buscada inicialmente é a letra: A
                
                Palavra: Olho
                Executando busca...
                """);
        verifyLetter.verifyLetter(word, firstLetter);

        System.out.println("""
                
                Bom, vamos tentar utilizar a letra "o" desta vez!
                """);
        verifyLetter.verifyLetter(word, secondLetter);
    }
}
