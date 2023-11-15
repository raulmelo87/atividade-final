public class Main {
    public static void main(String[] args) throws Exception {
        
        System.out.println("---------------------------------------------------------------------------------");
        Livro li1 = new Livro("Sapines", "Yuval Harari");
        li1.consultarLivro();
        System.out.println("---------------------------------------------------------------------------------");

        Pessoa pe1 = new Pessoa("Maria", 20, "feminino");
        pe1.fazerAniversario();
        System.out.println(pe1);
        System.out.println("---------------------------------------------------------------------------------");

        Aluno al1 = new Aluno("José", 30, "masculino", "ADS", 5);
        String nomeAluno = al1.getNome();
        String cursoAluno = al1.getCurso();
        String statusAprovacao = al1.estaAprovado(al1.getNota());
        System.out.println("Nome do aluno: " + nomeAluno + ", Curso: " + cursoAluno + ", Status de aprovação: " + statusAprovacao);
        System.out.println("---------------------------------------------------------------------------------");


    }
}
