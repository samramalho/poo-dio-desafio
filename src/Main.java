import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java");
        curso2.setDescricao("Descrição do curso");
        curso2.setCargaHoraria(8);



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Nome");
        mentoria1.setDescricao("Descrição de Java");
        mentoria1.setDate(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

    }
}