package principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão" , 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar" , 2023);
        outroFilme.avalia(6);
        Filme filmeDoPaulo = new Filme("Dogville" , 2003);
        filmeDoPaulo.avalia(3);

        Serie lost = new Serie("Lost", 2000);
        lost.avalia(6);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista
             ) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classifição " + filme.getClassificacao());
            }

        }

       List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Alexsandro");
        buscaPorArtista.add("Nykolly");
        buscaPorArtista.add("Adam Sandler");

        Collections.sort(buscaPorArtista);
        System.out.println("Depois de ordenação");
        System.out.println(buscaPorArtista);


        Collections.sort(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

//        @Override - decrescente
//        public int compareTo(Conta outra) {
//            if (this.saldo < outra.saldo) {
//                return 1;
//            } else if (this.saldo > outra.saldo) {
//                return -1;
//            } else {
//                return 0;
//            }
//        }


        System.out.println("Ordenando por Ano " + lista);
    }
}
