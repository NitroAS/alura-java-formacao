package org.example;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(1);
        meuFilme.avalia(5);
        meuFilme.avalia(9.5);
        System.out.println("Total de Avalições " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());


    }
}