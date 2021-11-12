public class Funcionario extends Pessoa {
  private String matriculation;
  private String departament;
  private String user_type = "Funcionário";

  public Funcionario(){}

  public Funcionario(String nome, String cpf, String email) {
    super(nome, cpf, email);
    
    System.out.println(user_type + "adicionado com sucesso!");
    System.out.println("Nome do" + user_type + ":" + getName());
    System.out.println("Telefone do " + user_type + ": " + getPhone());
    System.out.println("Email do " + user_type + ": " + getEmail());
  }

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
  public void showProfileContent() {
    System.out.println("<==--- Perfil do Funcionário ---==>\n");
    System.out.println("Nome do usuário: " + getName());
    System.out.println("Telefone do usuário: " + getPhone());
    System.out.println("Email do usuário: " + getEmail());
    System.out.println("Departamento do usuário: " + getDepartament());
    System.out.println("Matricula do usuário: " + getMatriculation());
  }

}
