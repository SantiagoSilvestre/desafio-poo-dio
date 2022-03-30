import br.com.dio.desafio.domain.Bootcamp;
import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Dev;
import br.com.dio.desafio.domain.Mentoria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java Script");
        curso2.setDescricao("Descrição curso java script");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria de java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(mentoria1);
//        System.out.println(curso1);
//        System.out.println(curso2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devSantiago = new Dev();
        devSantiago.setNome("Santiago");
        devSantiago.inscreverBootcamp(bootcamp);
        devSantiago.progredir();
        devSantiago.progredir();
        devSantiago.progredir();
        System.out.println("Conteúdos inscritos Santiago: "+devSantiago.getConteudosInscrito());
        System.out.println("Conteúdos concluídos Santiago: "+devSantiago.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos Santiago: "+devSantiago.getConteudosInscrito());
        System.out.println("XP: : "+devSantiago.calcularXp());


//        Dev devCamila = new Dev();
//        devCamila.setNome("Camila");
//        devCamila.inscreverBootcamp(bootcamp);
//        System.out.println("Conteúdos inscritos Camila: "+devCamila.getConteudosInscrito());

    }



//    public static void main(String[] args) {
//        Scanner leitor = new Scanner(System.in);
//        char o = leitor.next().toUpperCase().charAt(0);
//        double soma = 0;
//        double[][] M = new double[12][12];
//
//        for (int i = 0; i < 12; i++) {
//            for (int j = 0; j < 12; j++) {
//                M[i][j] = leitor.nextDouble();
//                if (j + i < 11)
//                    soma += M[i][j];
//            }
//        }
//        if (o=='M') soma /= 66.0;
//        System.out.println(String.format("%.1f", soma));
//    }


}
