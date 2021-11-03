public class Funcionario extends Pessoa {
  private String matriculation;
  private String departament;

  public String getDepartament() {
    return departament;
  }

  public String getMatriculation() {
    return matriculation;
  }

  public void setMatriculation(String matriculation) {
    this.matriculation = matriculation;
  }

  public void setDepartament(String departament) {
    this.departament = departament;
  }

  @Override
  public void showPessoaContent() {
    System.out.println("<==--- Perfil do Funcionário ---==>\n");
    System.out.println("Nome do usuário: " + getName());
    System.out.println("Telefone do usuário: " + getPhone());
    System.out.println("Email do usuário: " + getEmail());
    System.out.println("Departamento do usuário: " + getDepartament());
    System.out.println("Matricula do usuário: " + getMatriculation());
  }

}
