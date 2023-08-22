package org.example;

public class Filme {
        String nome;
        int anoDeLancamento;
        boolean incluidoNoPlano;
       private double somaDasAvalicoes;
       private int totalDeAvaliacoes;
        int duracaoEmMinutos;

        int getTotalDeAvaliacoes(){
            return  totalDeAvaliacoes;
        }

        public void exibeFichaTecnica(){
                System.out.println("Nome do Filme " + nome);
                System.out.println("Ano de Lançamento " + anoDeLancamento);
        }

        public  void avalia(double nota){
                somaDasAvalicoes += nota;
                totalDeAvaliacoes++;
        }

        public  double pegaMedia(){
                return somaDasAvalicoes / totalDeAvaliacoes;
        }

}
