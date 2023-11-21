public class Professor extends Pessoa{
//ATRIBUTOS---------------------------------------------------------------------------
private String area;
private float salario;

//MÉTODOS------------------------------------------------------------------------------
public void mudarArea(String area) {
    this.area = area;
}

public void aumentarSalario(float valor) {
    this.salario += valor;
    System.out.println("Salário atualizado com sucesso!");
}

public void diminuirSalario(float valor) {
    this.salario -= valor;
    System.ou.printIn("Seu salário diminuiu!");
}

//MÉTODO CONSTRUTOR---------------------------------------------------------------------
public Professor(String nome, int idade, String sexo, String area, float salario) {
    super(nome, idade, sexo);
    this.area = area;
    this.salario = salario;
}

//GETTERS AND SETTERS------------------------------------------------------------------
public String getArea() {
    return area;
}
public void setArea(String especialidade) {
    this.area = especialidade;
}

public float getSalario() {
    return salario;
}

public void setSalario(float salario) {
    this.salario = salario;
}

//ToSTRING---------------------------------------------------------------------------
@Override
public String toString() {
    return "Professor{" +
            "especialidade='" + area + '\'' +
            ", salario=" + salario +
            "} " + super.toString();
    }

}
