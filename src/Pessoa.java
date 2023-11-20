public class Pessoa {
    // ATRIBUTOS----------------------------------------------------------------------------
    private String nome;
    private int idade;
    private String sexo;

    // MÉTODOS------------------------------------------------------------------------------
    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public void fazerAniversario() {
        this.idade++;
    }

    public void alterarSexo(String sexo) {
        this.sexo = sexo;
    }

    // MÉTODO
    // CONSTRUTOR---------------------------------------------------------------------
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // GETTERS AND
    // SETTERS------------------------------------------------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // ToSTRING---------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
