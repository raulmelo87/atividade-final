public class Aluno extends Pessoa{
    //ATRIBUTOS----------------------------------------------------------------------------
    private float nota;
    private String curso;

    //MÉTODOS------------------------------------------------------------------------------
    public String estaAprovado (float nota){

        if (nota >6){
            return "Aprovado";
        }else {
            return "Reprovado";
        }

    }

    //MÉTODO CONSTRUTOR---------------------------------------------------------------------
    public Aluno(String nome, int idade, String sexo, String curso, float nota) {
        super(nome, idade, sexo);
        this.nota = nota;
        this.curso = curso;
    }

    //GETTERS E SETTERS---------------------------------------------------------------------
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getNota() {
        return nota;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }

    //TOSTRING--------------------------------------------------------------------------------
    @Override
    public String toString() {
        return"Aluno{" +
                "Curso= " + curso +
                ", Nota= " + nota +
                "}" + super.toString();
    }

}