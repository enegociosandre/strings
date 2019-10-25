package Strings;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Strings {

    public static void main(String[] args) {
        var string = new String("teste");
        System.out.println("testando -->" + string.charAt(1));
        System.out.println(string.length());
        System.out.println(string.equals("teste"));
        final var mensagem = String.format("String formatada com olha ai --> %s da hora", string);
        System.out.println(mensagem);

        System.out.println("A B C D E F G".toCharArray());
        System.out.println("Aula de Java".split("A"));
        System.out.println("Aula".concat(" de Java "));
        System.out.println("1234 asda qw".replaceAll("[0-9]","#"));

        //intStream.of(1,2,3,4,5).forEach(n->{
        //    System.out.println(n);
        //});

        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");
        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);
        nomes.remove(1);
        nomes.remove("Juliana");
        System.out.println(nomes);


        for(String name : nomes){
            System.out.println(name);
        }

        Iterator<String> iterator = nomes.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);
        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);


        System.out.println(LocalDate.now().minusDays(1));
        System.out.println(LocalTime.now());

    }
}
