public class Funcionario extends Pessoa {
    // atributos
    private String setor;
    private float salario;

    // metodos
    public void mudarSetor(String novoSetor) {
        this.setor = novoSetor;
        System.out.println("Alterando Setor...");
        System.out.println("Setor modificado com sucesso!");
    }

    public void aumentarSalario(float valor) {
        System.out.println("Alterando Salario...");
        System.out.println("Salario alterado com sucesso!");
        this.salario += valor;
    }

    // metodo construtor
    public Funcionario(String nome, int idade, String sexo, String setor, float salario) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.salario = salario;
    }

    // getters e setters
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    // toString
    @Override
    public String toString() {
        return "Funcionário:" + getNome() +
                "\n Setor: " + setor +
                "\n Salario: " + salario;
    }
}
