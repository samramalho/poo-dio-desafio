import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso1 Java");
        curso1.setDescricao("Descrição do curso1");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso2 Java");
        curso2.setDescricao("Curso 2");
        curso2.setCargaHoraria(59);



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Nome");
        mentoria1.setDescricao("Descrição de Java");
        mentoria1.setDate(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devSamuel = new Dev();
        devSamuel.setNome("Samuel ");
        devSamuel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devSamuel.getConteudosInscritos());
        devSamuel.progredir();
        devSamuel.progredir();
        System.out.println("*-*");
        System.out.println("Conteudos Concluidos " + devSamuel.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + devSamuel.getConteudosConcluidos());
        System.out.println("XP:" + devSamuel.calcularTotalXp());


        System.out.println("*-------------*");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos inscritos " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos inscritos " + devJoao.getConteudosInscritos());

        System.out.println("Conteudos Concluidos " + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());





    }
}