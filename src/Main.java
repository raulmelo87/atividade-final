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
        System.out.println(
                "Nome do aluno: " + nomeAluno + ", Curso: " + cursoAluno + ", Status de aprovação: " + statusAprovacao);
        System.out.println("---------------------------------------------------------------------------------");

        Professor Prof = new Professor("João", 27, "Masculino", "Tecnologia", 7000);
        Prof.aumentarSalario(500);
        Prof.mudarArea("Produto");
        float verSalario = Prof.getSalario();
        String verArea = Prof.getArea();
        System.out.println("Salário: " + verSalario + ", Área: " + verArea);
        System.out.println("---------------------------------------------------------------------------------");

        Funcionario func1 = new Funcionario("Henrique", 39, "Masculino", "Infraestrutura", 5000);
        System.out.println(func1.toString());
        func1.mudarSetor("Redes");
        func1.aumentarSalario(1500);
        System.out.println(func1.toString());

    }
}
