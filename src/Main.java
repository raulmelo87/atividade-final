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



    }
}
